package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #643 - Maximum Average Subarray I  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/maximum-average-subarray-i/
 * Pattern: Sliding Window
 *
 * You are given an integer array nums consisting of n elements, and an integer k. Find a
 * contiguous subarray whose length is equal to k that has the maximum average value and return
 * this value. Any answer with a calculation error less than 10^-5 will be accepted.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [5], k = 1
 * Output: 5.00000
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= k <= n <= 10^5
 *  - -10^4 <= nums[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Fixed-size window: naya element add, purana nikaalo. Sum maintain karo (long/int overflow dhyaan).
 */
public class LC0643_MaximumAverageSubarrayI {

    // TODO: apna solution yahan likho
    public double findMaxAverage(int[] nums, int k) {
        return 0.0;
    }

    public static void main(String[] args) {
        LC0643_MaximumAverageSubarrayI sol = new LC0643_MaximumAverageSubarrayI();
        System.out.println(sol.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4)); // 12.75
        System.out.println(sol.findMaxAverage(new int[]{5}, 1));               // 5.0
    }
}
