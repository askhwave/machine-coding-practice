package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #518 - Coin Change II  [Medium]
 * Link   : https://leetcode.com/problems/coin-change-ii/
 * Pattern: Dynamic Programming
 *
 * You are given an integer array coins representing coins of different denominations and an
 * integer amount representing a total amount of money. Return the number of combinations that
 * make up that amount. If that amount of money cannot be made up by any combination of the
 * coins, return 0. You may assume that you have an infinite number of each kind of coin. The
 * answer is guaranteed to fit into a signed 32-bit integer.
 *
 * Example 1:
 * <pre>
 * Input: amount = 5, coins = [1,2,5]
 * Output: 4
 * Explanation: there are four ways to make up the amount: 5=5, 5=2+2+1, 5=2+1+1+1, 5=1+1+1+1+1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: amount = 3, coins = [2]
 * Output: 0
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: amount = 10, coins = [10]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= coins.length <= 300
 *  - 1 <= coins[i] <= 5000
 *  - All the values of coins are unique.
 *  - 0 <= amount <= 5000
 *
 * Hint (spoiler - pehle khud try karo): COMBINATIONS (order matter nahi): coin loop BAHAR, amount loop ANDAR. Ulta kar diya to permutations (#377) ginega. dp[0] = 1.
 */
public class LC0518_CoinChangeII {

    // TODO: apna solution yahan likho
    public int change(int amount, int[] coins) {
        return 0;
    }

    public static void main(String[] args) {
        LC0518_CoinChangeII sol = new LC0518_CoinChangeII();
        System.out.println(sol.change(5, new int[]{1,2,5})); // 4
        System.out.println(sol.change(3, new int[]{2}));       // 0
        System.out.println(sol.change(10, new int[]{10}));     // 1
    }
}
