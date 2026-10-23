package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set07_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #88 - Merge Sorted Array  [Easy]
 * Link   : https://leetcode.com/problems/merge-sorted-array/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
 * integers m and n, representing the number of elements in nums1 and nums2 respectively. Merge
 * nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array
 * should not be returned by the function, but instead be stored inside the array nums1. To
 * accommodate this, nums1 has a length of m + n, where the first m elements denote the
 * elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 *
 * Example 1:
 * <pre>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * </pre>
 *
 * Constraints:
 *  - nums1.length == m + n
 *  - nums2.length == n
 *  - 0 <= m, n <= 200
 *  - 1 <= m + n <= 200
 *  - -10^9 <= nums1[i], nums2[j] <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): Peeche se bharo (bade element pehle) - overwrite ka darr nahi.
 */
public class LC0088_MergeSortedArray {

    // TODO: apna solution yahan likho
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    }

    public static void main(String[] args) {
        LC0088_MergeSortedArray sol = new LC0088_MergeSortedArray();
        Check.start("LC0088_MergeSortedArray");
        int[] a = {1,2,3,0,0,0};
        sol.merge(a, 3, new int[]{2,5,6}, 3);
        Check.eq("[1, 2, 2, 3, 5, 6]", () -> Arrays.toString(a));
        Check.summary();
    }
}
