package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #334 - Increasing Triplet Subsequence  [Medium]
 * Link   : https://leetcode.com/problems/increasing-triplet-subsequence/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such
 * that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 5 * 10^5
 *  - -2^31 <= nums[i] <= 2^31 - 1
 *  - Follow-up: could you implement a solution that runs in O(n) time complexity and O(1) space complexity?
 *
 * Hint (spoiler - pehle khud try karo): Do variable first (smallest) aur second (smallest 'second'). Teesra bada mila to true.
 */
public class LC0334_IncreasingTripletSubsequence {

    // TODO: apna solution yahan likho
    public boolean increasingTriplet(int[] nums) {
        return false;
    }

    public static void main(String[] args) {
        LC0334_IncreasingTripletSubsequence sol = new LC0334_IncreasingTripletSubsequence();
        System.out.println(sol.increasingTriplet(new int[]{1,2,3,4,5}));   // true
        System.out.println(sol.increasingTriplet(new int[]{5,4,3,2,1}));   // false
        System.out.println(sol.increasingTriplet(new int[]{2,1,5,0,4,6})); // true
    }
}
