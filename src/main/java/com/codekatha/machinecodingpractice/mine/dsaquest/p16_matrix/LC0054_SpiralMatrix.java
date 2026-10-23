package com.codekatha.machinecodingpractice.mine.dsaquest.p16_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #54 - Spiral Matrix  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/spiral-matrix/
 * Pattern: Matrix / 2D Array
 *
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Example 1:
 * <pre>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * </pre>
 *
 * Constraints:
 *  - m == matrix.length
 *  - n == matrix[i].length
 *  - 1 <= m, n <= 10
 *  - -100 <= matrix[i][j] <= 100
 *
 * Hint (spoiler - pehle khud try karo): Char boundaries: top, bottom, left, right. Ek ek side traverse karke boundary andar. Single row/col par duplicate se bacho (traverse ke beech me check).
 */
public class LC0054_SpiralMatrix {

    // TODO: apna solution yahan likho
    public List<Integer> spiralOrder(int[][] matrix) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0054_SpiralMatrix sol = new LC0054_SpiralMatrix();
        System.out.println(sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));          // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(sol.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})); // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
