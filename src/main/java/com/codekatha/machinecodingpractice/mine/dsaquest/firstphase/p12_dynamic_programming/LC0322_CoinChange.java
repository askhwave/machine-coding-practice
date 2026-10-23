package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #322 - Coin Change  [Medium]
 * Link   : https://leetcode.com/problems/coin-change/
 * Pattern: Dynamic Programming
 *
 * You are given an integer array coins representing coins of different denominations and an
 * integer amount representing a total amount of money. Return the fewest number of coins that
 * you need to make up that amount. If that amount of money cannot be made up by any
 * combination of the coins, return -1. You may assume that you have an infinite number of each
 * kind of coin.
 *
 * Example 1:
 * <pre>
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: coins = [2], amount = 3
 * Output: -1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: coins = [1], amount = 0
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= coins.length <= 12
 *  - 1 <= coins[i] <= 2^31 - 1
 *  - 0 <= amount <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): dp[a] = min over coins (dp[a - coin] + 1). Unreachable ke liye INF (Integer.MAX_VALUE + 1 overflow se bacho!). Greedy yahan galat hai - counter-example socho.
 */
public class LC0322_CoinChange {

    // TODO: apna solution yahan likho
    public int coinChange(int[] coins, int amount) {
        return -1;
    }

    public static void main(String[] args) {
        LC0322_CoinChange sol = new LC0322_CoinChange();
        System.out.println(sol.coinChange(new int[]{1,2,5}, 11)); // 3
        System.out.println(sol.coinChange(new int[]{2}, 3));       // -1
        System.out.println(sol.coinChange(new int[]{1}, 0));       // 0
    }
}
