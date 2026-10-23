package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set10_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #287 - Find the Duplicate Number  [Medium]
 * Link   : https://leetcode.com/problems/find-the-duplicate-number/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an array of integers nums containing n + 1 integers where each integer is in the range
 * [1, n] inclusive. There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra
 * space.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 10^5
 *  - nums.length == n + 1
 *  - 1 <= nums[i] <= n
 *  - All the integers in nums appear only once except for precisely one integer which appears two or more times.
 *
 * Hint (spoiler - pehle khud try karo): Array ko linked list socho: i -> nums[i]. Duplicate = cycle ka entry point (Floyd, #142 jaisa).
 */
public class LC0287_FindTheDuplicateNumber {

    // TODO: apna solution yahan likho
    public int findDuplicate(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        LC0287_FindTheDuplicateNumber sol = new LC0287_FindTheDuplicateNumber();
        Check.start("LC0287_FindTheDuplicateNumber");
        Check.eq("2", () -> sol.findDuplicate(new int[]{1,3,4,2,2}));
        Check.eq("3", () -> sol.findDuplicate(new int[]{3,1,3,4,2}));
        Check.eq("3", () -> sol.findDuplicate(new int[]{3,3,3,3,3}));
        Check.summary();
    }
}
