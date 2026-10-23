package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set17_arrays_prefix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #189 - Rotate Array  [Medium]
 * Link   : https://leetcode.com/problems/rotate-array/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-
 * negative.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -2^31 <= nums[i] <= 2^31 - 1
 *  - 0 <= k <= 10^5
 *  - Follow-up: try to solve it in-place with O(1) extra space.
 *
 * Hint (spoiler - pehle khud try karo): k %= n. Reverse trick: poora reverse, phir pehle k, phir baaki n-k reverse.
 */
public class LC0189_RotateArray {

    // TODO: apna solution yahan likho
    public void rotate(int[] nums, int k) {
    }

    public static void main(String[] args) {
        LC0189_RotateArray sol = new LC0189_RotateArray();
        Check.start("LC0189_RotateArray");
        int[] a = {1,2,3,4,5,6,7};
        sol.rotate(a, 3);
        Check.eq("[5, 6, 7, 1, 2, 3, 4]", () -> Arrays.toString(a));
        int[] b = {-1,-100,3,99};
        sol.rotate(b, 2);
        Check.eq("[3, 99, -1, -100]", () -> Arrays.toString(b));
        Check.summary();
    }
}
