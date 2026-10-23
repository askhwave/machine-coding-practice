package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1480 - Running Sum of 1d Array  [Easy]
 * Link   : https://leetcode.com/problems/running-sum-of-1d-array/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]...nums[i]). Return the running sum of nums.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 1000
 *  - -10^6 <= nums[i] <= 10^6
 *
 * Hint (spoiler - pehle khud try karo): Prefix sum ka base. In-place bhi ho sakta hai.
 */
public class LC1480_RunningSumOf1dArray {

    // TODO: apna solution yahan likho
    public int[] runningSum(int[] nums) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC1480_RunningSumOf1dArray sol = new LC1480_RunningSumOf1dArray();
        Check.start("LC1480_RunningSumOf1dArray");
        Check.eq("[1, 3, 6, 10]", () -> Arrays.toString(sol.runningSum(new int[]{1,2,3,4})));
        Check.eq("[3, 4, 6, 16, 17]", () -> Arrays.toString(sol.runningSum(new int[]{3,1,2,10,1})));
        Check.summary();
    }
}
