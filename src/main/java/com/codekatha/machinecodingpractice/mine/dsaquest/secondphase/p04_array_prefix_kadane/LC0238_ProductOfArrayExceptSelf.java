package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #238 - Product of Array Except Self  [Medium]
 * Link   : https://leetcode.com/problems/product-of-array-except-self/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the
 * product of all the elements of nums except nums[i]. The product of any prefix or suffix of
 * nums is guaranteed to fit in a 32-bit integer. You must write an algorithm that runs in O(n)
 * time and without using the division operation.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * </pre>
 *
 * Constraints:
 *  - 2 <= nums.length <= 10^5
 *  - -30 <= nums[i] <= 30
 *  - Follow-up: can you solve it in O(1) extra space (output array does not count)?
 *
 * Hint (spoiler - pehle khud try karo): answer[i] = (i ke left ka product) * (i ke right ka product). Do pass: prefix, phir suffix running variable se.
 */
public class LC0238_ProductOfArrayExceptSelf {

    // TODO: apna solution yahan likho
    public int[] productExceptSelf(int[] nums) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0238_ProductOfArrayExceptSelf sol = new LC0238_ProductOfArrayExceptSelf();
        Check.start("LC0238_ProductOfArrayExceptSelf");
        Check.eq("[24, 12, 8, 6]", () -> Arrays.toString(sol.productExceptSelf(new int[]{1,2,3,4})));
        Check.eq("[0, 0, 9, 0, 0]", () -> Arrays.toString(sol.productExceptSelf(new int[]{-1,1,0,-3,3})));
        Check.summary();
    }
}
