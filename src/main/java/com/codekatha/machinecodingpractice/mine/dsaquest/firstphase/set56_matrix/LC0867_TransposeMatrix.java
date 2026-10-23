package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set56_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #867 - Transpose Matrix  [Easy]
 * Link   : https://leetcode.com/problems/transpose-matrix/
 * Pattern: Matrix / 2D Array
 *
 * Given a 2D integer array matrix, return the transpose of matrix. The transpose of a matrix
 * is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 *
 * Example 1:
 * <pre>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * </pre>
 *
 * Constraints:
 *  - m == matrix.length
 *  - n == matrix[i].length
 *  - 1 <= m, n <= 1000
 *  - 1 <= m * n <= 10^5
 *  - -10^9 <= matrix[i][j] <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): Rectangular matrix me naya matrix [n][m] banta hai: res[j][i] = matrix[i][j].
 */
public class LC0867_TransposeMatrix {

    // TODO: apna solution yahan likho
    public int[][] transpose(int[][] matrix) {
        return new int[0][0];
    }

    public static void main(String[] args) {
        LC0867_TransposeMatrix sol = new LC0867_TransposeMatrix();
        Check.start("LC0867_TransposeMatrix");
        Check.eq("[[1, 4, 7], [2, 5, 8], [3, 6, 9]]", () -> Arrays.deepToString(sol.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
        Check.eq("[[1, 4], [2, 5], [3, 6]]", () -> Arrays.deepToString(sol.transpose(new int[][]{{1,2,3},{4,5,6}})));
        Check.summary();
    }
}
