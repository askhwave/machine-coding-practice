package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g07_binary_search_and_halving.s01_binary_search_and_halving;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #4 - Median of Two Sorted Arrays  [LeetCode: Hard | Cheatsheet: Round 1 OA | Hard]
 * Link   : https://leetcode.com/problems/median-of-two-sorted-arrays/
 * Group  : Binary Search & Halving  >  Binary Search & Halving
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of
 * the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 * <pre>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * </pre>
 *
 * Constraints:
 *  - nums1.length == m
 *  - nums2.length == n
 *  - 0 <= m <= 1000
 *  - 0 <= n <= 1000
 *  - 1 <= m + n <= 2000
 *  - -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * Hint (spoiler - pehle khud try karo): Merge karna O(m+n) hai - O(log) chahiye. Chhote array pe binary search karke partition dhundo: left half ke max <= right half ke min (dono arrays ke across).
 */
public class LC0004_MedianOfTwoSortedArrays {

    // TODO: apna solution yahan likho
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0.0;
    }

    public static void main(String[] args) {
        LC0004_MedianOfTwoSortedArrays sol = new LC0004_MedianOfTwoSortedArrays();
        Check.start("LC0004_MedianOfTwoSortedArrays");
        Check.eq(2.0, () -> sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        Check.eq(2.5, () -> sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        Check.eq(1.0, () -> sol.findMedianSortedArrays(new int[]{}, new int[]{1}));
        Check.eq(2.0, () -> sol.findMedianSortedArrays(new int[]{2}, new int[]{}));
        Check.eq(0.0, () -> sol.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
        Check.eq(5.5, () -> sol.findMedianSortedArrays(new int[]{1,3,5,7}, new int[]{2,4,6,8,10,12}));
        Check.eq(3.5, () -> sol.findMedianSortedArrays(new int[]{1}, new int[]{2,3,4,5,6}));
        Check.eq(3.0, () -> sol.findMedianSortedArrays(new int[]{-5,3,6,12,15}, new int[]{-12,-10,-6,-3,4,10}));
        Check.eq(5.5, () -> sol.findMedianSortedArrays(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10}));
        Check.eq(5.5, () -> sol.findMedianSortedArrays(new int[]{6,7,8,9,10}, new int[]{1,2,3,4,5}));
        Check.eq(0.0, () -> sol.findMedianSortedArrays(new int[]{-1000000}, new int[]{1000000}));
        Check.eq(5.0, () -> sol.findMedianSortedArrays(new int[]{5}, new int[]{5}));
        Check.summary();
    }
}
