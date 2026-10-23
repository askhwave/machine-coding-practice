package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #34 - Find First and Last Position of Element in Sorted Array  [Medium]
 * Link   : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Pattern: Binary Search (index + answer space)
 *
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
 * position of a given target value. If target is not found in the array, return [-1, -1]. You
 * must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <pre>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * </pre>
 *
 * Constraints:
 *  - 0 <= nums.length <= 10^5
 *  - -10^9 <= nums[i] <= 10^9
 *  - nums is a non-decreasing array.
 *  - -10^9 <= target <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): Do binary search: lower bound (target) aur lower bound (target+1) - 1. Ek helper, do baar call.
 */
public class LC0034_FindFirstAndLastPositionOfElementInSortedArray {

    // TODO: apna solution yahan likho
    public int[] searchRange(int[] nums, int target) {
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        LC0034_FindFirstAndLastPositionOfElementInSortedArray sol = new LC0034_FindFirstAndLastPositionOfElementInSortedArray();
        System.out.println(Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10}, 8))); // [3, 4]
        System.out.println(Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10}, 6))); // [-1, -1]
        System.out.println(Arrays.toString(sol.searchRange(new int[]{}, 0)));            // [-1, -1]
    }
}
