package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set23_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #33 - Search in Rotated Sorted Array  [Medium]
 * Link   : https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Pattern: Binary Search (index + answer space)
 *
 * There is an integer array nums sorted in ascending order (with distinct values). Prior to
 * being passed to your function, nums is possibly rotated at an unknown pivot index k such
 * that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
 * nums[k-1]]. Given the array nums after the possible rotation and an integer target, return
 * the index of target if it is in nums, or -1 if it is not in nums. You must write an
 * algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <pre>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1], target = 0
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 5000
 *  - -10^4 <= nums[i] <= 10^4
 *  - All values of nums are unique.
 *  - nums is an ascending array that is possibly rotated.
 *  - -10^4 <= target <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Har mid par ek half hamesha sorted hota hai. Dekho target us sorted half me hai ya nahi.
 */
public class LC0033_SearchInRotatedSortedArray {

    // TODO: apna solution yahan likho
    public int search(int[] nums, int target) {
        return -1;
    }

    public static void main(String[] args) {
        LC0033_SearchInRotatedSortedArray sol = new LC0033_SearchInRotatedSortedArray();
        Check.start("LC0033_SearchInRotatedSortedArray");
        Check.eq("4", () -> sol.search(new int[]{4,5,6,7,0,1,2}, 0));
        Check.eq("-1", () -> sol.search(new int[]{4,5,6,7,0,1,2}, 3));
        Check.eq("-1", () -> sol.search(new int[]{1}, 0));
        Check.eq("1", () -> sol.search(new int[]{3,1}, 1));
        Check.summary();
    }
}
