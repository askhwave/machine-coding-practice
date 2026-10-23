package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p16_matrix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1582 - Special Positions in a Binary Matrix  [Easy]
 * Link   : https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 * Pattern: Matrix / 2D Array
 *
 * Given an m x n binary matrix mat, return the number of special positions in mat. A position
 * (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are
 * 0 (rows and columns are 0-indexed).
 *
 * Example 1:
 * <pre>
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 * </pre>
 *
 * Constraints:
 *  - m == mat.length
 *  - n == mat[i].length
 *  - 1 <= m, n <= 100
 *  - mat[i][j] is either 0 or 1.
 *
 * Hint (spoiler - pehle khud try karo): Pehle rowCount[] aur colCount[] nikalo; phir cell == 1 && rowCount == 1 && colCount == 1.
 */
public class LC1582_SpecialPositionsInABinaryMatrix {

    // TODO: apna solution yahan likho
    public int numSpecial(int[][] mat) {
        return 0;
    }

    public static void main(String[] args) {
        LC1582_SpecialPositionsInABinaryMatrix sol = new LC1582_SpecialPositionsInABinaryMatrix();
        System.out.println(sol.numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}})); // 1
        System.out.println(sol.numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); // 3
    }
}
