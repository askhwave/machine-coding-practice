package com.codekatha.machinecodingpractice.mine.dsaquest.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1464 - Maximum Product of Two Elements in an Array  [Easy]
 * Link   : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given the array of integers nums, you will choose two different indices i and j of that
 * array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,5,4,5]
 * Output: 16
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [3,7]
 * Output: 12
 * </pre>
 *
 * Constraints:
 *  - 2 <= nums.length <= 500
 *  - 1 <= nums[i] <= 10^3
 *
 * Hint (spoiler - pehle khud try karo): Sirf top-2 largest chahiye - ek pass me max1, max2 track karo (sort zaroori nahi).
 */
public class LC1464_MaximumProductOfTwoElementsInAnArray {

    // TODO: apna solution yahan likho
    public int maxProduct(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC1464_MaximumProductOfTwoElementsInAnArray sol = new LC1464_MaximumProductOfTwoElementsInAnArray();
        System.out.println(sol.maxProduct(new int[]{3,4,5,2})); // 12
        System.out.println(sol.maxProduct(new int[]{1,5,4,5})); // 16
        System.out.println(sol.maxProduct(new int[]{3,7}));     // 12
    }
}
