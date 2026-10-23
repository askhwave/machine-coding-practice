package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p16_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #73 - Set Matrix Zeroes  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/set-matrix-zeroes/
 * Pattern: Matrix / 2D Array
 *
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to
 * 0's. You must do it in place.
 *
 * Example 1:
 * <pre>
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * </pre>
 *
 * Constraints:
 *  - m == matrix.length
 *  - n == matrix[0].length
 *  - 1 <= m, n <= 200
 *  - -2^31 <= matrix[i][j] <= 2^31 - 1
 *  - Follow-up: A straightforward solution using O(mn) space is probably a bad idea. A simple improvement uses O(m + n) space, but still not the best solution. Could you devise a constant space solution?
 *
 * Hint (spoiler - pehle khud try karo): O(m+n): rowZero[], colZero[] flags. O(1): pehli row/col ko hi flags ki tarah use karo (pehle alag se note kar lo ki khud pehli row/col me zero tha).
 */
public class LC0073_SetMatrixZeroes {

    // TODO: apna solution yahan likho
    public void setZeroes(int[][] matrix) {
    }

    public static void main(String[] args) {
        LC0073_SetMatrixZeroes sol = new LC0073_SetMatrixZeroes();
        int[][] a = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        sol.setZeroes(a);
        System.out.println(Arrays.deepToString(a)); // [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    }
}
