package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #53 - Maximum Subarray  [Medium]
 * Link   : https://leetcode.com/problems/maximum-subarray/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 * Example 1:
 * <pre>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1]
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -10^4 <= nums[i] <= 10^4
 *  - Follow-up: try the divide and conquer approach too.
 *
 * Hint (spoiler - pehle khud try karo): Kadane: cur = max(num, cur + num). Sab negative ho to bhi sahi chalna chahiye.
 */
public class LC0053_MaximumSubarray {

    // TODO: apna solution yahan likho
    public int maxSubArray(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0053_MaximumSubarray sol = new LC0053_MaximumSubarray();
        System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println(sol.maxSubArray(new int[]{1}));                     // 1
        System.out.println(sol.maxSubArray(new int[]{5,4,-1,7,8}));            // 23
        System.out.println(sol.maxSubArray(new int[]{-3,-1,-2}));              // -1
    }
}
