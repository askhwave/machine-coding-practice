package com.codekatha.machinecodingpractice.mine.dsaquest.p16_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #74 - Search a 2D Matrix  [Medium]
 * Link   : https://leetcode.com/problems/search-a-2d-matrix/
 * Pattern: Matrix / 2D Array
 *
 * You are given an m x n integer matrix matrix with the following two properties: each row is
 * sorted in non-decreasing order; the first integer of each row is greater than the last
 * integer of the previous row. Given an integer target, return true if target is in matrix or
 * false otherwise. You must write a solution in O(log(m * n)) time complexity.
 *
 * Example 1:
 * <pre>
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - m == matrix.length
 *  - n == matrix[i].length
 *  - 1 <= m, n <= 100
 *  - -10^4 <= matrix[i][j], target <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Poore matrix ko flatten sorted array socho: index k -> row = k / n, col = k % n. Standard binary search (#704).
 */
public class LC0074_SearchA2DMatrix {

    // TODO: apna solution yahan likho
    public boolean searchMatrix(int[][] matrix, int target) {
        return false;
    }

    public static void main(String[] args) {
        LC0074_SearchA2DMatrix sol = new LC0074_SearchA2DMatrix();
        int[][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(sol.searchMatrix(m, 3));   // true
        System.out.println(sol.searchMatrix(m, 13));  // false
    }
}
