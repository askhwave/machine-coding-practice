package com.codekatha.machinecodingpractice.mine.dsaquest.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #153 - Find Minimum in Rotated Sorted Array  [Medium]
 * Link   : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Pattern: Binary Search (index + answer space)
 *
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * Given the sorted rotated array nums of unique elements, return the minimum element of this
 * array. You must write an algorithm that runs in O(log n) time.
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [11,13,15,17]
 * Output: 11
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 5000
 *  - -5000 <= nums[i] <= 5000
 *  - All the integers of nums are unique.
 *  - nums is sorted and rotated between 1 and n times.
 *
 * Hint (spoiler - pehle khud try karo): mid ko hi se compare karo: nums[mid] > nums[hi] to min right me, warna mid ya left me.
 */
public class LC0153_FindMinimumInRotatedSortedArray {

    // TODO: apna solution yahan likho
    public int findMin(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        LC0153_FindMinimumInRotatedSortedArray sol = new LC0153_FindMinimumInRotatedSortedArray();
        System.out.println(sol.findMin(new int[]{3,4,5,1,2}));       // 1
        System.out.println(sol.findMin(new int[]{4,5,6,7,0,1,2}));   // 0
        System.out.println(sol.findMin(new int[]{11,13,15,17}));     // 11
    }
}
