package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #733 - Flood Fill  [Easy]
 * Link   : https://leetcode.com/problems/flood-fill/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * You are given an image represented by an m x n grid of integers image, where image[i][j]
 * represents the pixel value of the image. You are also given three integers sr, sc, and
 * color. Your task is to perform a flood fill on the image starting from the pixel
 * image[sr][sc]. To perform a flood fill: begin with the starting pixel and change its color
 * to color; perform the same process for each pixel that is directly adjacent (pixels that
 * share a side with the original pixel, either horizontally or vertically) and shares the same
 * color as the starting pixel; keep repeating this process by checking neighboring pixels of
 * the updated pixels and modifying their color if it matches the original color of the
 * starting pixel. Return the modified image after performing the flood fill.
 *
 * Example 1:
 * <pre>
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
 * Output: [[0,0,0],[0,0,0]]
 * </pre>
 *
 * Constraints:
 *  - m == image.length
 *  - n == image[i].length
 *  - 1 <= m, n <= 50
 *  - 0 <= image[i][j], color < 2^16
 *  - 0 <= sr < m
 *  - 0 <= sc < n
 *
 * Hint (spoiler - pehle khud try karo): Grid DFS ka base. Trap: original color == new color ho to infinite recursion - pehle hi return.
 */
public class LC0733_FloodFill {

    // TODO: apna solution yahan likho
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return image;
    }

    public static void main(String[] args) {
        LC0733_FloodFill sol = new LC0733_FloodFill();
        System.out.println(Arrays.deepToString(sol.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2))); // [[2, 2, 2], [2, 2, 0], [2, 0, 1]]
        System.out.println(Arrays.deepToString(sol.floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0)));         // [[0, 0, 0], [0, 0, 0]]
    }
}
