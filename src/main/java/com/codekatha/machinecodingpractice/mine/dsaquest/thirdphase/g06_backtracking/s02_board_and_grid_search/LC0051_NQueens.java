package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s02_board_and_grid_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #51 - N-Queens  [LeetCode: Hard | Cheatsheet: Round 1 OA | Hard]
 * Link   : https://leetcode.com/problems/n-queens/
 * Group  : Backtracking  >  Board / Grid Search
 *
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no
 * two queens attack each other. Given an integer n, return all distinct solutions to the
 * n-queens puzzle. You may return the answer in any order. Each solution contains a distinct
 * board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and
 * an empty space, respectively.
 *
 * Example 1:
 * <pre>
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 1
 * Output: [["Q"]]
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 9
 *
 * Hint (spoiler - pehle khud try karo): Row by row ek queen rakho. Conflict O(1) me dekhne ke liye 3 sets: columns, diagonal (r - c), anti-diagonal (r + c). Board strings sirf solution milne par banao.
 */
public class LC0051_NQueens {

    // TODO: apna solution yahan likho
    public List<List<String>> solveNQueens(int n) {
        return new ArrayList<>();
    }

    // order-insensitive compare helper: har inner list ko toString karke outer list sort kar deta hai
    static <T> List<String> canon(List<List<T>> rows) {
        List<String> out = new ArrayList<>();
        for (List<T> r : rows) out.add(r.toString());
        Collections.sort(out);
        return out;
    }

    public static void main(String[] args) {
        LC0051_NQueens sol = new LC0051_NQueens();
        Check.start("LC0051_NQueens");
        Check.eq("[[Q]]", () -> canon(sol.solveNQueens(1)));
        Check.eq("[]", () -> canon(sol.solveNQueens(2)));
        Check.eq("[]", () -> canon(sol.solveNQueens(3)));
        Check.eq("[[..Q., Q..., ...Q, .Q..], [.Q.., ...Q, Q..., ..Q.]]", () -> canon(sol.solveNQueens(4)));
        Check.eq("[[....Q, ..Q.., Q...., ...Q., .Q...], [....Q, .Q..., ...Q., Q...., ..Q..], [...Q., .Q..., ....Q, ..Q.., Q....], [...Q., Q...., ..Q.., ....Q, .Q...], [..Q.., ....Q, .Q..., ...Q., Q....], [..Q.., Q...., ...Q., .Q..., ....Q], [.Q..., ....Q, ..Q.., Q...., ...Q.], [.Q..., ...Q., Q...., ..Q.., ....Q], [Q...., ...Q., .Q..., ....Q, ..Q..], [Q...., ..Q.., ....Q, .Q..., ...Q.]]", () -> canon(sol.solveNQueens(5)));
        Check.eq("[[....Q., ..Q..., Q....., .....Q, ...Q.., .Q....], [...Q.., Q....., ....Q., .Q...., .....Q, ..Q...], [..Q..., .....Q, .Q...., ....Q., Q....., ...Q..], [.Q...., ...Q.., .....Q, Q....., ..Q..., ....Q.]]", () -> canon(sol.solveNQueens(6)));
        Check.eq(92, () -> sol.solveNQueens(8).size());
        Check.eq(352, () -> sol.solveNQueens(9).size());  // n = 9: O(n^2) check har cell pe karoge to slow
        Check.summary();
    }
}
