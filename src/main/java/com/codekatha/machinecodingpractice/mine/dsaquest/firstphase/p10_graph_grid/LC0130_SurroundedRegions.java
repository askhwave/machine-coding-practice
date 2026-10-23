package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #130 - Surrounded Regions  [Medium]
 * Link   : https://leetcode.com/problems/surrounded-regions/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are
 * surrounded: Connect: a cell is connected to adjacent cells horizontally or vertically.
 * Region: to form a region connect every 'O' cell. Surround: the region is surrounded with 'X'
 * cells if you can connect the region with 'X' cells and none of the region cells are on the
 * edge of the board. To capture a surrounded region, replace all 'O's with 'X's in-place
 * within the original board. You do not need to return anything.
 *
 * Example 1:
 * <pre>
 * Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: board = [["X"]]
 * Output: [["X"]]
 * </pre>
 *
 * Constraints:
 *  - m == board.length
 *  - n == board[i].length
 *  - 1 <= m, n <= 200
 *  - board[i][j] is 'X' or 'O'.
 *
 * Hint (spoiler - pehle khud try karo): Ulta socho: border se connected 'O' safe hain. Border 'O's se DFS karke temporary mark ('#'), phir baaki 'O' -> 'X', '#' -> 'O'.
 */
public class LC0130_SurroundedRegions {

    // TODO: apna solution yahan likho
    public void solve(char[][] board) {
    }

    public static void main(String[] args) {
        LC0130_SurroundedRegions sol = new LC0130_SurroundedRegions();
        char[][] b = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        sol.solve(b);
        System.out.println(Arrays.deepToString(b)); // only bottom O stays: [[X,X,X,X],[X,X,X,X],[X,X,X,X],[X,O,X,X]]
    }
}
