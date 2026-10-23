package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #994 - Rotting Oranges  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/rotting-oranges/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * You are given an m x n grid where each cell can have one of three values: 0 representing an
 * empty cell, 1 representing a fresh orange, or 2 representing a rotten orange. Every minute,
 * any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return
 * the minimum number of minutes that must elapse until no cell has a fresh orange. If this is
 * impossible, return -1.
 *
 * Example 1:
 * <pre>
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: grid = [[0,2]]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - m == grid.length
 *  - n == grid[i].length
 *  - 1 <= m, n <= 10
 *  - grid[i][j] is 0, 1, or 2.
 *
 * Hint (spoiler - pehle khud try karo): Multi-source BFS: saare rotten ek saath queue me. Level = minute. Fresh count track karo; end me fresh bacha to -1.
 */
public class LC0994_RottingOranges {

    // TODO: apna solution yahan likho
    public int orangesRotting(int[][] grid) {
        return -1;
    }

    public static void main(String[] args) {
        LC0994_RottingOranges sol = new LC0994_RottingOranges();
        Check.start("LC0994_RottingOranges");
        Check.eq("4", () -> sol.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
        Check.eq("-1", () -> sol.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
        Check.eq("0", () -> sol.orangesRotting(new int[][]{{0,2}}));
        Check.summary();
    }
}
