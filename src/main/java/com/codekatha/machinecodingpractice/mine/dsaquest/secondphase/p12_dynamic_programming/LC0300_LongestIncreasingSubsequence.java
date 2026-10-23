package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #300 - Longest Increasing Subsequence  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/longest-increasing-subsequence/
 * Pattern: Dynamic Programming
 *
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence.
 *
 * Example 1:
 * <pre>
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 2500
 *  - -10^4 <= nums[i] <= 10^4
 *  - Follow-up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 *
 * Hint (spoiler - pehle khud try karo): O(n^2): dp[i] = 1 + max(dp[j]) for j < i, nums[j] < nums[i]. Follow-up: tails[] array + binary search (#704 wala lower-bound).
 */
public class LC0300_LongestIncreasingSubsequence {

    // TODO: apna solution yahan likho
    public int lengthOfLIS(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0300_LongestIncreasingSubsequence sol = new LC0300_LongestIncreasingSubsequence();
        System.out.println(sol.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 4
        System.out.println(sol.lengthOfLIS(new int[]{0,1,0,3,2,3}));         // 4
        System.out.println(sol.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));       // 1
    }
}
