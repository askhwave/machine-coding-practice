package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p07_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #496 - Next Greater Element I  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/next-greater-element-i/
 * Pattern: Stack & Queue
 *
 * The next greater element of some element x in an array is the first greater element that is
 * to the right of x in the same array. You are given two distinct 0-indexed integer arrays
 * nums1 and nums2, where nums1 is a subset of nums2. For each 0 <= i < nums1.length, find the
 * index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in
 * nums2. If there is no next greater element, then the answer for this query is -1. Return an
 * array ans of length nums1.length such that ans[i] is the next greater element as described
 * above.
 *
 * Example 1:
 * <pre>
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums1.length <= nums2.length <= 1000
 *  - 0 <= nums1[i], nums2[i] <= 10^4
 *  - All integers in nums1 and nums2 are unique.
 *  - All the integers of nums1 also appear in nums2.
 *
 * Hint (spoiler - pehle khud try karo): Monotonic stack nums2 par chalao, har element ka next greater Map me; phir nums1 ke liye lookup.
 */
public class LC0496_NextGreaterElementI {

    // TODO: apna solution yahan likho
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0496_NextGreaterElementI sol = new LC0496_NextGreaterElementI();
        System.out.println(Arrays.toString(sol.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}))); // [-1, 3, -1]
        System.out.println(Arrays.toString(sol.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));     // [3, -1]
    }
}
