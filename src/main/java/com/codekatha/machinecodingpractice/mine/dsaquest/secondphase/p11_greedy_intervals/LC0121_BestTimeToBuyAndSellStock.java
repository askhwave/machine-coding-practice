package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #121 - Best Time to Buy and Sell Stock  [Easy]
 * Link   : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Pattern: Greedy & Intervals
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock. Return the maximum profit you can achieve
 * from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 * <pre>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * </pre>
 *
 * Constraints:
 *  - 1 <= prices.length <= 10^5
 *  - 0 <= prices[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Ek pass: ab tak ka minimum price track karo, har din (price - minSoFar) se profit update.
 */
public class LC0121_BestTimeToBuyAndSellStock {

    // TODO: apna solution yahan likho
    public int maxProfit(int[] prices) {
        return 0;
    }

    public static void main(String[] args) {
        LC0121_BestTimeToBuyAndSellStock sol = new LC0121_BestTimeToBuyAndSellStock();
        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));   // 0
    }
}
