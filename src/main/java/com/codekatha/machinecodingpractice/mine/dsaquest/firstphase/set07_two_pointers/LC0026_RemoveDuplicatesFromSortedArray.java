package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set07_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.Arrays;

/**
 * LeetCode #26 - Remove Duplicates from Sorted Array  [Easy]
 * Link   : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should
 * be kept the same. Then return the number of unique elements in nums. The first k elements of
 * nums should hold the unique elements in their original order; the rest do not matter.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order.
 * <p>
 * Hint (spoiler - pehle khud try karo): Sorted hai, to nums[i] != nums[write-1] ho tabhi likho.
 */
public class LC0026_RemoveDuplicatesFromSortedArray {

    // TODO: apna solution yahan likho
    public int removeDuplicates(int[] nums) {
        int valid = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[valid] = nums[i];
                valid++;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        LC0026_RemoveDuplicatesFromSortedArray sol = new LC0026_RemoveDuplicatesFromSortedArray();
        Check.start("LC0026_RemoveDuplicatesFromSortedArray");
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = sol.removeDuplicates(a);
        Check.eq("5 [0, 1, 2, 3, 4]", () -> k + " " + Arrays.toString(Arrays.copyOf(a, k)));
        Check.summary();
    }
}
