package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set12_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #209 - Minimum Size Subarray Sum  [Medium]
 * Link   : https://leetcode.com/problems/minimum-size-subarray-sum/
 * Pattern: Sliding Window
 *
 * Given an array of positive integers nums and a positive integer target, return the minimal
 * length of a subarray whose sum is greater than or equal to target. If there is no such
 * subarray, return 0 instead.
 *
 * Example 1:
 * <pre>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= target <= 10^9
 *  - 1 <= nums.length <= 10^5
 *  - 1 <= nums[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Right badhao jab tak sum >= target; phir left se shrink karte hue min length update.
 */
public class LC0209_MinimumSizeSubarraySum {

    // TODO: apna solution yahan likho
    public int minSubArrayLen(int target, int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0209_MinimumSizeSubarraySum sol = new LC0209_MinimumSizeSubarraySum();
        Check.start("LC0209_MinimumSizeSubarraySum");
        Check.eq("2", () -> sol.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        Check.eq("1", () -> sol.minSubArrayLen(4, new int[]{1,4,4}));
        Check.eq("0", () -> sol.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
        Check.summary();
    }
}
