package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #704 - Binary Search  [Easy]
 * Link   : https://leetcode.com/problems/binary-search/
 * Pattern: Binary Search (index + answer space)
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1. You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <pre>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - -10^4 < nums[i], target < 10^4
 *  - All the integers in nums are unique.
 *  - nums is sorted in ascending order.
 *
 * Hint (spoiler - pehle khud try karo): Template pakka karo: lo, hi, mid = lo + (hi-lo)/2. Overflow aur infinite loop dono se bacho.
 */
public class LC0704_BinarySearch {

    // TODO: apna solution yahan likho
    public int search(int[] nums, int target) {
        return -1;
    }

    public static void main(String[] args) {
        LC0704_BinarySearch sol = new LC0704_BinarySearch();
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12}, 9)); // 4
        System.out.println(sol.search(new int[]{-1,0,3,5,9,12}, 2)); // -1
    }
}
