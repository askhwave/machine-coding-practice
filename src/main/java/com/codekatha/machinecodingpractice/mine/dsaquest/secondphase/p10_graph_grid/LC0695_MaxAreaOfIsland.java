package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #695 - Max Area of Island  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/max-area-of-island/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the
 * grid are surrounded by water. The area of an island is the number of cells with a value 1 in
 * the island. Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * Example 1:
 * <pre>
 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: grid = [[0,0,0,0,0,0,0,0]]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - m == grid.length
 *  - n == grid[i].length
 *  - 1 <= m, n <= 50
 *  - grid[i][j] is either 0 or 1.
 *
 * Hint (spoiler - pehle khud try karo): #200 jaisa, bas DFS size return kare: 1 + sum(four directions).
 */
public class LC0695_MaxAreaOfIsland {

    // TODO: apna solution yahan likho
    public int maxAreaOfIsland(int[][] grid) {
        return 0;
    }

    public static void main(String[] args) {
        LC0695_MaxAreaOfIsland sol = new LC0695_MaxAreaOfIsland();
        int[][] g = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(sol.maxAreaOfIsland(g)); // 6
        System.out.println(sol.maxAreaOfIsland(new int[][]{{0,0,0,0,0,0,0,0}})); // 0
    }
}
