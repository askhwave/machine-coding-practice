package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p16_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #48 - Rotate Image  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/rotate-image/
 * Pattern: Matrix / 2D Array
 *
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees
 * (clockwise). You have to rotate the image in-place, which means you have to modify the input
 * 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 * <pre>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * </pre>
 *
 * Constraints:
 *  - n == matrix.length == matrix[i].length
 *  - 1 <= n <= 20
 *  - -1000 <= matrix[i][j] <= 1000
 *
 * Hint (spoiler - pehle khud try karo): Transpose (#867 in-place) + har row reverse = 90 degree clockwise.
 */
public class LC0048_RotateImage {

    // TODO: apna solution yahan likho
    public void rotate(int[][] matrix) {
    }

    public static void main(String[] args) {
        LC0048_RotateImage sol = new LC0048_RotateImage();
        Check.start("LC0048_RotateImage");
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        sol.rotate(a);
        Check.eq("[[7, 4, 1], [8, 5, 2], [9, 6, 3]]", () -> Arrays.deepToString(a));
        Check.summary();
    }
}
