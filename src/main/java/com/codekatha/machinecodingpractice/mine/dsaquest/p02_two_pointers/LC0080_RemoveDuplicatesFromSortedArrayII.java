package com.codekatha.machinecodingpractice.mine.dsaquest.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #80 - Remove Duplicates from Sorted Array II  [Medium]
 * Link   : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place
 * such that each unique element appears at most twice. The relative order of the elements
 * should be kept the same. Return k after placing the final result in the first k slots of
 * nums. Do not allocate extra space for another array; you must do this by modifying the input
 * array in-place with O(1) extra memory.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 3 * 10^4
 *  - -10^4 <= nums[i] <= 10^4
 *  - nums is sorted in non-decreasing order.
 *
 * Hint (spoiler - pehle khud try karo): nums[i] != nums[write-2] ho tabhi likho (generalises to 'at most k').
 */
public class LC0080_RemoveDuplicatesFromSortedArrayII {

    // TODO: apna solution yahan likho
    public int removeDuplicates(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0080_RemoveDuplicatesFromSortedArrayII sol = new LC0080_RemoveDuplicatesFromSortedArrayII();
        int[] a = {0,0,1,1,1,1,2,3,3};
        int k = sol.removeDuplicates(a);
        System.out.println(k + " " + Arrays.toString(Arrays.copyOf(a, k))); // 7 [0, 0, 1, 1, 2, 3, 3]
    }
}
