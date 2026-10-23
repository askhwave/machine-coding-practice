package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p07_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #739 - Daily Temperatures  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/daily-temperatures/
 * Pattern: Stack & Queue
 *
 * Given an array of integers temperatures represents the daily temperatures, return an array
 * answer such that answer[i] is the number of days you have to wait after the ith day to get a
 * warmer temperature. If there is no future day for which this is possible, keep answer[i] ==
 * 0 instead.
 *
 * Example 1:
 * <pre>
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 * </pre>
 *
 * Constraints:
 *  - 1 <= temperatures.length <= 10^5
 *  - 30 <= temperatures[i] <= 100
 *
 * Hint (spoiler - pehle khud try karo): Monotonic (decreasing) stack of INDICES. Warmer din milte hi stack se pop karke answer[idx] = i - idx.
 */
public class LC0739_DailyTemperatures {

    // TODO: apna solution yahan likho
    public int[] dailyTemperatures(int[] temperatures) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0739_DailyTemperatures sol = new LC0739_DailyTemperatures();
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}))); // [1, 1, 4, 2, 1, 1, 0, 0]
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{30,40,50,60})));             // [1, 1, 1, 0]
        System.out.println(Arrays.toString(sol.dailyTemperatures(new int[]{30,60,90})));                // [1, 1, 0]
    }
}
