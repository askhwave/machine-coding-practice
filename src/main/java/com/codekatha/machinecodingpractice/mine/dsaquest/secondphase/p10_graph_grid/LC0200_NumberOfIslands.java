package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #200 - Number of Islands  [Medium]
 * Link   : https://leetcode.com/problems/number-of-islands/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of the grid are all
 * surrounded by water.
 *
 * Example 1:
 * <pre>
 * Input: grid = [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: grid = [["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
 * Output: 3
 * </pre>
 *
 * Constraints:
 *  - m == grid.length
 *  - n == grid[i].length
 *  - 1 <= m, n <= 300
 *  - grid[i][j] is '0' or '1'.
 *
 * Hint (spoiler - pehle khud try karo): Har unvisited '1' par count++ aur DFS/BFS se pura island '0' (sink) kar do. Ye connected-components ka template hai.
 */
public class LC0200_NumberOfIslands {

    // TODO: apna solution yahan likho
    public int numIslands(char[][] grid) {
        return 0;
    }

    public static void main(String[] args) {
        LC0200_NumberOfIslands sol = new LC0200_NumberOfIslands();
        char[][] g1 = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(sol.numIslands(g1)); // 1
        char[][] g2 = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(sol.numIslands(g2)); // 3
    }
}
