package com.codekatha.machinecodingpractice.mine.dsaquest.fourthphase.g01_coding.s01_board_game_simulation;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Atlassian reported question - Teleporter Board (snakes-and-ladders style)  [Round 1 | Coding]
 * Group  : Coding  >  Board Game Simulation & BFS
 * Source : candidate-reported Atlassian interview questions (shared by Aman). Statement reconstructed from garbled notes -
 *           assumptions are written in the Constraints; clarify them with the interviewer like in a real round.
 *
 * The board consists of consecutive squares numbered 1 to last_square. Some squares contain
 * teleporters, given as strings "from,to". The game is played as follows: each turn the player
 * rolls a die numbered 1 to die_sides and moves forward by the rolled number of squares. The
 * player stops at last_square if they reach it (an overshoot also stops at last_square). If
 * the player finishes the move on a square with a teleporter, they are moved to the square the
 * teleporter points to. Only ONE teleporter is followed per turn (the destination square's own
 * teleporter is not followed). The game ends on last_square, so a teleporter on last_square is
 * never used.
 * (1) possibleSquares: return the collection of squares a player can be on after a single
 * turn, given the teleporter strings, the number of die sides, the square the player starts on
 * and the last square.
 * (2) Follow-up: implement BFS and check whether the player can finish the game (reach
 * last_square) from the start square.
 * (3) Bonus: minTurns - the minimum number of turns needed to finish, or -1 if it is
 * impossible.
 *
 * Example 1:
 * <pre>
 * teleporters = ["3,1","4,2","5,10"], die_sides = 6, start = 1, last_square = 28
 * possibleSquares -> {1, 2, 6, 7, 10}
 * Explanation: rolls 1..6 land on 2, 3, 4, 5, 6, 7. Square 3 sends the player to 1, 4 sends to 2, 5 sends to 10.
 * </pre>
 *
 * Example 2:
 * <pre>
 * teleporters = ["3,1"], die_sides = 1, start = 1, last_square = 5
 * canFinish -> false
 * Explanation: 1 -> 2 -> 3 -> teleport to 1 -> ... the player loops forever (visited set is needed in BFS).
 * </pre>
 *
 * Constraints / assumptions:
 *  - 1 <= die_sides
 *  - 1 <= start <= last_square, teleporter squares are inside [1, last_square]
 *  - A square has at most one teleporter; teleporters may point backwards (cycles are possible)
 *  - Statement reconstructed from a candidate-reported question: confirm the overshoot rule and 1-based squares with the interviewer
 *
 * Hint (spoiler - pehle khud try karo): possibleSquares = ek turn ka loop r = 1..die_sides: min(pos + r, last), teleporter ho to follow karo (last square pe nahi). BFS = ye hi function neighbours banata hai; queue + visited set; level = turns. Visited ke bina teleporter cycle me atak jaoge.
 */
public class Round1_TeleporterBoard {

    // TODO: Map<Integer,Integer> from -> to banao, phir ek-turn ka logic likho
    public Set<Integer> possibleSquares(List<String> teleporters, int dieSides, int start, int lastSquare) {
        return new HashSet<>();
    }

    // TODO: BFS (queue + visited)
    public boolean canFinish(List<String> teleporters, int dieSides, int start, int lastSquare) {
        return false;
    }

    // TODO: BFS levels (bonus)
    public int minTurns(List<String> teleporters, int dieSides, int start, int lastSquare) {
        return -1;
    }

    public static void main(String[] args) {
        Round1_TeleporterBoard sol = new Round1_TeleporterBoard();
        Check.start("Round1_TeleporterBoard");
        Check.sameElements("[1, 2, 6, 7, 10]", () -> sol.possibleSquares(List.of("3,1","4,2","5,10"), 6, 1, 28));
        Check.sameElements("[2, 3, 4, 5, 6, 7]", () -> sol.possibleSquares(List.of(), 6, 1, 28));
        Check.sameElements("[26, 27, 28]", () -> sol.possibleSquares(List.of(), 6, 25, 28));
        Check.sameElements("[]", () -> sol.possibleSquares(List.of(), 6, 28, 28));
        Check.sameElements("[28]", () -> sol.possibleSquares(List.of("3,1","4,2","5,10"), 6, 27, 28));
        Check.sameElements("[1, 2]", () -> sol.possibleSquares(List.of("3,1","4,1","5,1","6,1","7,1"), 6, 1, 28));
        Check.sameElements("[6]", () -> sol.possibleSquares(List.of(), 1, 5, 10));
        Check.sameElements("[2, 3, 10]", () -> sol.possibleSquares(List.of("4,10"), 3, 1, 10));
        Check.sameElements("[6, 7, 8, 9, 10]", () -> sol.possibleSquares(List.of("10,2"), 6, 5, 10));
        Check.sameElements("[2, 5]", () -> sol.possibleSquares(List.of("3,5","5,9"), 2, 1, 20));
        Check.eq(true, () -> sol.canFinish(List.of(), 6, 1, 28));
        Check.eq(false, () -> sol.canFinish(List.of("2,1"), 1, 1, 5));
        Check.eq(true, () -> sol.canFinish(List.of("3,1","4,2","5,10"), 6, 1, 28));
        Check.eq(false, () -> sol.canFinish(List.of("3,1"), 1, 1, 5));
        Check.eq(false, () -> sol.canFinish(List.of("2,1","3,1","4,1","5,1","6,1","7,1"), 6, 1, 28));
        Check.eq(true, () -> sol.canFinish(List.of(), 6, 28, 28));
        Check.eq(true, () -> sol.canFinish(List.of("2,20"), 6, 1, 28));
        Check.eq(5, () -> sol.minTurns(List.of(), 6, 1, 28));
        Check.eq(-1, () -> sol.minTurns(List.of("2,1"), 1, 1, 5));
        Check.eq(4, () -> sol.minTurns(List.of("3,1","4,2","5,10"), 6, 1, 28));
        Check.eq(-1, () -> sol.minTurns(List.of("3,1"), 1, 1, 5));
        Check.eq(-1, () -> sol.minTurns(List.of("2,1","3,1","4,1","5,1","6,1","7,1"), 6, 1, 28));
        Check.eq(0, () -> sol.minTurns(List.of(), 6, 28, 28));
        Check.eq(3, () -> sol.minTurns(List.of("2,20"), 6, 1, 28));
        Check.eq(4, () -> sol.minTurns(List.of(), 1, 1, 5));
        Check.eq(4, () -> sol.minTurns(List.of("4,3"), 3, 1, 10));
        Check.eq(-1, () -> sol.minTurns(List.of("2,1","3,1"), 2, 1, 6));
        Check.eq(16667, () -> sol.minTurns(List.of(), 6, 1, 100000));   // lambi board: recursion se stack overflow, BFS se nahi
        Check.summary();
    }
}
