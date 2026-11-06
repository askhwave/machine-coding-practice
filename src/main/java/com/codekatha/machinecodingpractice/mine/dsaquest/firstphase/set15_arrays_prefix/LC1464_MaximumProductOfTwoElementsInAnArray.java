package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set15_arrays_prefix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #1464 - Maximum Product of Two Elements in an Array  [Easy]
 * Link   : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 * <p>
 * Given the array of integers nums, you will choose two different indices i and j of that
 * array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [1,5,4,5]
 * Output: 16
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [3,7]
 * Output: 12
 * </pre>
 * <p>
 * Constraints:
 * - 2 <= nums.length <= 500
 * - 1 <= nums[i] <= 10^3
 * <p>
 * Hint (spoiler - pehle khud try karo): Sirf top-2 largest chahiye - ek pass me max1, max2 track karo (sort zaroori nahi).
 */
public class LC1464_MaximumProductOfTwoElementsInAnArray {

    // TODO: apna solution yahan likho
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n >= max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax) {
                secondMax = n;
            }
        }

        return (max - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        LC1464_MaximumProductOfTwoElementsInAnArray sol = new LC1464_MaximumProductOfTwoElementsInAnArray();
        Check.start("LC1464_MaximumProductOfTwoElementsInAnArray");
        Check.eq("12", () -> sol.maxProduct(new int[]{3, 4, 5, 2}));
        Check.eq("16", () -> sol.maxProduct(new int[]{1, 5, 4, 5}));
        Check.eq("12", () -> sol.maxProduct(new int[]{3, 7}));
        Check.summary();
    }
}
