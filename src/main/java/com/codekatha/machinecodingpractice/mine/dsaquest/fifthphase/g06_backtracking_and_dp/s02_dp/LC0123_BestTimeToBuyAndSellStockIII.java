package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s02_dp;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #123 - Best Time to Buy and Sell Stock III  [Difficulty: Hard | Atlassian: last seen 1 year, frequency score 0.025]
 * Link   : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Dynamic Programming
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete at most two transactions. Note:
 * You may not engage in multiple transactions simultaneously (i.e., you must sell the stock
 * before you buy again).
 *
 * Example 1:
 * <pre>
 * Input: prices = [3,3,5,0,0,3,1,4]
 * Output: 6
 * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3. Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4. Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * </pre>
 *
 * Constraints:
 *  - 1 <= prices.length <= 10^5
 *  - 0 <= prices[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): 4 variables ki state machine: buy1 (best -price), sell1, buy2 (sell1 - price), sell2. Har price pe: buy1 = max(buy1, -p); sell1 = max(sell1, buy1 + p); buy2 = max(buy2, sell1 - p); sell2 = max(sell2, buy2 + p). Answer sell2. (Ya prefix/suffix profit arrays: best single trade left me + right me.)
 */
public class LC0123_BestTimeToBuyAndSellStockIII {

    // TODO: apna solution yahan likho
    public int maxProfit(int[] prices) {
        return 0;
    }

    public static void main(String[] args) {
        LC0123_BestTimeToBuyAndSellStockIII sol = new LC0123_BestTimeToBuyAndSellStockIII();
        Check.start("LC0123_BestTimeToBuyAndSellStockIII");
        Check.eq(6, () -> sol.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
        Check.eq(4, () -> sol.maxProfit(new int[]{1,2,3,4,5}));
        Check.eq(0, () -> sol.maxProfit(new int[]{7,6,4,3,1}));
        Check.eq(0, () -> sol.maxProfit(new int[]{1}));
        Check.eq(11, () -> sol.maxProfit(new int[]{2,1,4,5,2,9,7}));
        Check.eq(13, () -> sol.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
        Check.eq(7, () -> sol.maxProfit(new int[]{6,1,3,2,4,7}));
        Check.eq(7, () -> sol.maxProfit(new int[]{3,2,6,5,0,3}));
        Check.eq(0, () -> sol.maxProfit(new int[]{5,5,5,5}));
        Check.eq(4, () -> sol.maxProfit(new int[]{1,5}));
        Check.eq(0, () -> sol.maxProfit(new int[]{5,1}));
        Check.eq(18, () -> sol.maxProfit(new int[]{1,10,1,10,1,10}));
        Check.eq(12, () -> sol.maxProfit(new int[]{2,4,1,7,3,9}));
        Check.eq(148, () -> sol.maxProfit(new int[]{66,99,3,74,100,60,22,73}));
        Check.eq(169, () -> sol.maxProfit(new int[]{89,59,0,34,83,71,1,87,43,52,30,34,65,44,79}));
        Check.eq(156, () -> sol.maxProfit(new int[]{94,61,69,23,20,93,44,46,72,28,77,95,69,32,60,69,60,33,61,34,53,21,66,28,46,96,5,85,77,70}));
        Check.eq(177, () -> sol.maxProfit(new int[]{63,68,81,73,56,2,12,3,36,3,41,72,80,71,78,59,51,51,46,23,73,59,88,48,67,25,34,9,60,5,43,40,9,1,34,87,78,84,83,3,40,33,42,29,77,0,88,1,5,75,90,8,60,14,55,69,67,65,23,46}));
        Check.eq(199993, () -> { int[] p = new int[100000]; for (int i = 0; i < 100000; i++) p[i] = (int) (((long) i * 7919 + (i / 7) * 31L) % 100001); return sol.maxProfit(p); });   // 10^5 prices, O(n)
        Check.eq(99999, () -> { int[] p = new int[100000]; for (int i = 0; i < 100000; i++) p[i] = i; return sol.maxProfit(p); });   // sirf badhta hua
        Check.eq(0, () -> { int[] p = new int[100000]; for (int i = 0; i < 100000; i++) p[i] = 100000 - i; return sol.maxProfit(p); });   // sirf girta hua
        Check.summary();
    }
}
