package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #122 - Best Time to Buy and Sell Stock II  [Medium]
 * Link   : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Pattern: Greedy & Intervals
 *
 * You are given an integer array prices where prices[i] is the price of a given stock on the
 * ith day. On each day, you may decide to buy and/or sell the stock. You can only hold at most
 * one share of the stock at any time. However, you can buy it then immediately sell it on the
 * same day. Find and return the maximum profit you can achieve.
 *
 * Example 1:
 * <pre>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 4. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 3.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= prices.length <= 3 * 10^4
 *  - 0 <= prices[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Unlimited transactions: har chadhai (prices[i] > prices[i-1]) ka fayda jod do. Greedy kyun sahi hai?
 */
public class LC0122_BestTimeToBuyAndSellStockII {

    // TODO: apna solution yahan likho
    public int maxProfit(int[] prices) {
        return 0;
    }

    public static void main(String[] args) {
        LC0122_BestTimeToBuyAndSellStockII sol = new LC0122_BestTimeToBuyAndSellStockII();
        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 7
        System.out.println(sol.maxProfit(new int[]{1,2,3,4,5}));   // 4
        System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));   // 0
    }
}
