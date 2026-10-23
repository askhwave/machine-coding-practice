package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #724 - Find Pivot Index  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/find-pivot-index/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an array of integers nums, calculate the pivot index of this array. The pivot index is
 * the index where the sum of all the numbers strictly to the left of the index is equal to the
 * sum of all the numbers strictly to the index's right. If the index is on the left edge of
 * the array, then the left sum is 0 because there are no elements to the left. This also
 * applies to the right edge of the array. Return the leftmost pivot index. If no such index
 * exists, return -1.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,2,3]
 * Output: -1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [2,1,-1]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - -1000 <= nums[i] <= 1000
 *
 * Hint (spoiler - pehle khud try karo): total sum pehle; chalte hue leftSum, rightSum = total - leftSum - nums[i].
 */
public class LC0724_FindPivotIndex {

    // TODO: apna solution yahan likho
    public int pivotIndex(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        LC0724_FindPivotIndex sol = new LC0724_FindPivotIndex();
        System.out.println(sol.pivotIndex(new int[]{1,7,3,6,5,6})); // 3
        System.out.println(sol.pivotIndex(new int[]{1,2,3}));       // -1
        System.out.println(sol.pivotIndex(new int[]{2,1,-1}));      // 0
    }
}
