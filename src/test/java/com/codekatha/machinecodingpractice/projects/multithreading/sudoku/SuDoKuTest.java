package com.codekatha.machinecodingpractice.projects.multithreading.sudoku;

import com.codekatha.machinecodingpractice.mine.projects.multithreading.sudoku.SuDoKu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Plain JUnit 5 test class. No @SpringBootTest here -> Spring context never boots,
// no other package gets touched. @Test just tells JUnit "this method is a test case,
// run it standalone". You can click the green arrow next to each method in IntelliJ,
// or run the whole file with: mvn test -Dtest=SuDoKuTest
class SuDoKuTest {

    @Test
    void validBoardShouldReturnTrue() {
        // A fully solved, legitimately valid 9x9 Sudoku (classic example grid).
        // Every row, every column and every 3x3 box independently contains 1-9 exactly once.
        int[][] board = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        SuDoKu suDoKu = new SuDoKu(board);

        // assertTrue(actual) -> test PASSES if isValid() returns true, FAILS (with a
        // clear JUnit error) if it returns false. This is the "happy path" case.
        assertTrue(suDoKu.isValid());
    }

    @Test
    void duplicateInRowShouldReturnFalse() {
        // Deliberately using a mostly-empty (0 = empty cell) board here instead of a full
        // one. Why: it isolates exactly ONE thing being wrong, so if the test fails you
        // know precisely which check is broken - no noise from other rows/cols/boxes.
        //
        // Row 0 has two 5s: at col 0 and col 4.
        //   - col 0 has only one non-zero value in the whole column -> no column clash.
        //   - col 4 has only one non-zero value in the whole column -> no column clash.
        //   - (0,0) sits in box 0 (rows 0-2, cols 0-2), (0,4) sits in box 1 (rows 0-2,
        //     cols 3-5) -> different boxes, so no box clash either.
        // Net result: the ONLY violation possible is inside row 0.
        int[][] board = new int[9][9]; // all zeros by default in Java
        board[0][0] = 5;
        board[0][4] = 5;

        SuDoKu suDoKu = new SuDoKu(board);

        // assertFalse(actual) -> test PASSES if isValid() returns false. We're asserting
        // the validator correctly REJECTS this board.
        assertFalse(suDoKu.isValid());
    }

    @Test
    void duplicateInColumnShouldReturnFalse() {
        // Same isolation trick, this time for a column-only violation.
        // Column 0 has two 3s: at row 0 and row 3.
        //   - row 0 has only one non-zero cell -> no row clash.
        //   - row 3 has only one non-zero cell -> no row clash.
        //   - (0,0) is in box 0 (rows 0-2, cols 0-2), (3,0) is in box 3 (rows 3-5,
        //     cols 0-2) -> different boxes -> no box clash.
        // Net result: only checkCol(0) should catch this.
        int[][] board = new int[9][9];
        board[0][0] = 3;
        board[3][0] = 3;

        SuDoKu suDoKu = new SuDoKu(board);

        assertFalse(suDoKu.isValid());
    }

    @Test
    void duplicateInBoxOnlyShouldReturnFalse() {
        // The trickiest case, and the one people most often forget to test: a board that
        // looks fine if you only check rows and columns, but breaks the box rule.
        //
        // Two 7s placed at (0,0) and (1,1):
        //   - different rows (0 vs 1) -> no row clash.
        //   - different columns (0 vs 1) -> no column clash.
        //   - BOTH cells fall inside box 0 (rows 0-2, cols 0-2) -> box clash.
        //
        // Since isValid() checks all 9 rows first, then all 9 columns, then all 9 boxes
        // (see the three loops in isValid()), this board will sail through the row and
        // column loops with no failures, and only get caught when checkBox(0) runs.
        // That ordering is exactly why this test matters: if checkBox() had a bug (like
        // the ones you already fixed - wrong loop bounds, wrong seen[] size), this is the
        // kind of board that would silently pass when it shouldn't.
        int[][] board = new int[9][9];
        board[0][0] = 7;
        board[1][1] = 7;

        SuDoKu suDoKu = new SuDoKu(board);

        assertFalse(suDoKu.isValid());
    }
}
