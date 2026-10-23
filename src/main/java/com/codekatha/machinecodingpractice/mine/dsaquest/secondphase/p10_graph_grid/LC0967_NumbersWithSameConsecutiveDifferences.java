package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #967 - Numbers With Same Consecutive Differences  [Medium]
 * Link   : https://leetcode.com/problems/numbers-with-same-consecutive-differences/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * Given two integers n and k, return an array of all the integers of length n where the
 * difference between every two consecutive digits is k. You may return the answer in any
 * order. Note that the integers should not have leading zeros. Integers as 02 and 043 are not
 * allowed.
 *
 * Example 1:
 * <pre>
 * Input: n = 3, k = 7
 * Output: [181,292,707,818,929]
 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 2, k = 1
 * Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 * </pre>
 *
 * Constraints:
 *  - 2 <= n <= 9
 *  - 0 <= k <= 9
 *
 * Hint (spoiler - pehle khud try karo): Implicit graph/tree: pehla digit 1..9, har step par last +- k (0..9 ke andar). BFS ya DFS. k == 0 par +k aur -k same hai - duplicate mat banao.
 */
public class LC0967_NumbersWithSameConsecutiveDifferences {

    // TODO: apna solution yahan likho
    public int[] numsSameConsecDiff(int n, int k) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0967_NumbersWithSameConsecutiveDifferences sol = new LC0967_NumbersWithSameConsecutiveDifferences();
        System.out.println(Arrays.toString(sol.numsSameConsecDiff(3, 7))); // [181, 292, 707, 818, 929]
        System.out.println(Arrays.toString(sol.numsSameConsecDiff(2, 1))); // [10, 12, 21, ..., 98]
        System.out.println(Arrays.toString(sol.numsSameConsecDiff(2, 0))); // [11, 22, ..., 99]
    }
}
