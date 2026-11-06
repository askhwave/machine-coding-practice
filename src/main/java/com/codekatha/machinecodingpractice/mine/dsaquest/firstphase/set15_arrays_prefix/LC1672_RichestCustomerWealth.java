package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set15_arrays_prefix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

import java.util.*;

/**
 * LeetCode #1672 - Richest Customer Wealth  [Easy]
 * Link   : https://leetcode.com/problems/richest-customer-wealth/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 * <p>
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
 * ith customer has in the jth bank. Return the wealth that the richest customer has. A
 * customer's wealth is the amount of money they have in all their bank accounts. The richest
 * customer is the customer that has the maximum wealth.
 * <p>
 * Example 1:
 * <pre>
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 * </pre>
 * <p>
 * Constraints:
 * - m == accounts.length
 * - n == accounts[i].length
 * - 1 <= m, n <= 50
 * - 1 <= accounts[i][j] <= 100
 * <p>
 * Hint (spoiler - pehle khud try karo): Row-wise sum, max track. Warm-up.
 */
public class LC1672_RichestCustomerWealth {

    // TODO: apna solution yahan likho
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        LC1672_RichestCustomerWealth sol = new LC1672_RichestCustomerWealth();
        Check.start("LC1672_RichestCustomerWealth");
        Check.eq("6", () -> sol.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        Check.eq("10", () -> sol.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        Check.eq("17", () -> sol.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
        Check.summary();
    }
}
