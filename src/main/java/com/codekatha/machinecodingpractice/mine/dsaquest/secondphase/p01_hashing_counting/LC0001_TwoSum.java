package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1 - Two Sum  [Easy]
 * Link   : https://leetcode.com/problems/two-sum/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an array of integers nums and an integer target, return the indices of the two numbers
 * such that they add up to target. You may assume that each input has exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * </pre>
 *
 * Constraints:
 *  - 2 <= nums.length <= 10^4
 *  - -10^9 <= nums[i] <= 10^9
 *  - -10^9 <= target <= 10^9
 *  - Only one valid answer exists.
 *
 * Hint (spoiler - pehle khud try karo): Har number ke liye socho: target - num pehle dekha hai kya? Map: value -> index.
 */
public class LC0001_TwoSum {

    // TODO: apna solution yahan likho
    public int[] twoSum(int[] nums, int target) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0001_TwoSum sol = new LC0001_TwoSum();
        Check.start("LC0001_TwoSum");
        Check.sameElements("[0, 1]", () -> sol.twoSum(new int[]{2,7,11,15}, 9));
        Check.sameElements("[1, 2]", () -> sol.twoSum(new int[]{3,2,4}, 6));
        Check.sameElements("[0, 1]", () -> sol.twoSum(new int[]{3,3}, 6));
        Check.summary();
    }
}
