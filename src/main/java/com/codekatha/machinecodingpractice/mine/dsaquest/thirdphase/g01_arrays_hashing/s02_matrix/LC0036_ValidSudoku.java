package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g01_arrays_hashing.s02_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #36 - Valid Sudoku  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/valid-sudoku/
 * Group  : Arrays & Hashing  >  Matrix Traversal & Validation
 *
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated
 * according to the following rules: (1) Each row must contain the digits 1-9 without
 * repetition. (2) Each column must contain the digits 1-9 without repetition. (3) Each of the
 * nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition. Note: A
 * Sudoku board (partially filled) could be valid but is not necessarily solvable. Only the
 * filled cells need to be validated according to the mentioned rules.
 *
 * Example 1:
 * <pre>
 * Input: board (har row ek string, '.' = khaali cell)
 *   "53..7...."
 *   "6..195..."
 *   ".98....6."
 *   "8...6...3"
 *   "4..8.3..1"
 *   "7...2...6"
 *   ".6....28."
 *   "...419..5"
 *   "....8..79"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: board = same as Example 1, but the top-left 5 is changed to 8
 * Output: false
 * Explanation: Two 8's in the top-left 3 x 3 sub-box (and in column 0), so it is invalid.
 * </pre>
 *
 * Constraints:
 *  - board.length == 9
 *  - board[i].length == 9
 *  - board[i][j] is a digit 1-9 or '.'.
 *
 * Hint (spoiler - pehle khud try karo): Teen jagah sets: row[r], col[c], box[(r/3)*3 + c/3]. Ek hi pass mein sab check.
 */
public class LC0036_ValidSudoku {

    // TODO: apna solution yahan likho
    public boolean isValidSudoku(char[][] board) {
        return false;
    }

    static char[][] grid(String... rows) {
        char[][] g = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) g[i] = rows[i].toCharArray();
        return g;
    }

    public static void main(String[] args) {
        LC0036_ValidSudoku sol = new LC0036_ValidSudoku();
        Check.start("LC0036_ValidSudoku");
        Check.eq(true, () -> sol.isValidSudoku(grid("53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79")));
        Check.eq(false, () -> sol.isValidSudoku(grid("83..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79")));
        Check.eq(true, () -> sol.isValidSudoku(grid(".........",".........",".........",".........",".........",".........",".........",".........",".........")));
        Check.eq(false, () -> sol.isValidSudoku(grid("55.......",".........",".........",".........",".........",".........",".........",".........","........."))); // row duplicate
        Check.eq(false, () -> sol.isValidSudoku(grid("5........",".........",".........",".........",".........",".........",".........",".........","5........"))); // column duplicate
        Check.eq(false, () -> sol.isValidSudoku(grid("1........",".1.......",".........",".........",".........",".........",".........",".........","........."))); // sub-box duplicate only
        Check.eq(true, () -> sol.isValidSudoku(grid("1........","...1.....","......1..",".........",".........",".........",".........",".........","........."))); // same digit, different row/col/box
        Check.eq(true, () -> sol.isValidSudoku(grid("534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","345286179"))); // fully solved board
        Check.eq(false, () -> sol.isValidSudoku(grid("534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","345286171"))); // one wrong cell in a solved board
        Check.summary();
    }
}
