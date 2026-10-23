package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #152 - Maximum Product Subarray  [Medium]
 * Link   : https://leetcode.com/problems/maximum-product-subarray/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an integer array nums, find a subarray that has the largest product, and return the
 * product. The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 2 * 10^4
 *  - -10 <= nums[i] <= 10
 *  - The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 *
 * Hint (spoiler - pehle khud try karo): Kadane jaisa, par curMax AUR curMin dono rakho - negative se multiply karne par min, max ban jata hai.
 */
public class LC0152_MaximumProductSubarray {

    // TODO: apna solution yahan likho
    public int maxProduct(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0152_MaximumProductSubarray sol = new LC0152_MaximumProductSubarray();
        System.out.println(sol.maxProduct(new int[]{2,3,-2,4}));  // 6
        System.out.println(sol.maxProduct(new int[]{-2,0,-1}));   // 0
        System.out.println(sol.maxProduct(new int[]{-2,3,-4}));   // 24
    }
}
