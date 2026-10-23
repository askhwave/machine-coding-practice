package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #75 - Sort Colors  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/sort-colors/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that
 * objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
 * respectively. You must solve this problem without using the library's sort function.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 300
 *  - nums[i] is either 0, 1, or 2.
 *  - Follow-up: Could you come up with a one-pass algorithm using only constant extra space?
 *
 * Hint (spoiler - pehle khud try karo): Dutch National Flag: low, mid, high - teen pointers, ek pass.
 */
public class LC0075_SortColors {

    // TODO: apna solution yahan likho
    public void sortColors(int[] nums) {
    }

    public static void main(String[] args) {
        LC0075_SortColors sol = new LC0075_SortColors();
        int[] a = {2,0,2,1,1,0};
        sol.sortColors(a);
        System.out.println(Arrays.toString(a)); // [0, 0, 1, 1, 2, 2]
    }
}
