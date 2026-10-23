package com.codekatha.machinecodingpractice.mine.dsaquest.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #3644 - Maximum K to Sort a Permutation  [Medium]
 * Link   : https://leetcode.com/problems/maximum-k-to-sort-a-permutation/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * You are given an integer array nums of length n, where nums is a permutation of the numbers
 * in the range [0..n - 1]. You may swap elements at indices i and j only if nums[i] AND
 * nums[j] == k, where AND denotes the bitwise AND operation and k is a non-negative integer.
 * Return the maximum value of k such that the array can be sorted in non-decreasing order
 * using any number of such swaps. If nums is already sorted, return 0.
 *
 * Example 1:
 * <pre>
 * Input: nums = [0,3,2,1]
 * Output: 1
 * Explanation: Choose k = 1. Swapping nums[1] = 3 and nums[3] = 1 is allowed since 3 AND 1 = 1, resulting in a sorted permutation: [0, 1, 2, 3].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1,3,2]
 * Output: 2
 * Explanation: Choose k = 2. Swapping nums[2] = 3 and nums[3] = 2 is allowed since 3 AND 2 = 2, resulting in a sorted permutation: [0, 1, 2, 3].
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [3,2,1,0]
 * Output: 0
 * Explanation: Only k = 0 allows sorting since no greater k allows the required swaps where nums[i] AND nums[j] == k.
 * </pre>
 *
 * Constraints:
 *  - 1 <= n == nums.length <= 10^5
 *  - 0 <= nums[i] <= n - 1
 *  - nums is a permutation of integers from 0 to n - 1.
 *
 * Hint (spoiler - pehle khud try karo): Jo elements apni sahi jagah (nums[i] == i) par nahi hain, unko swap hona hi padega. Un sab ka AND hi max k hai.
 */
public class LC3644_MaximumKToSortAPermutation {

    // TODO: apna solution yahan likho
    public int sortPermutation(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC3644_MaximumKToSortAPermutation sol = new LC3644_MaximumKToSortAPermutation();
        System.out.println(sol.sortPermutation(new int[]{0,3,2,1})); // 1
        System.out.println(sol.sortPermutation(new int[]{0,1,3,2})); // 2
        System.out.println(sol.sortPermutation(new int[]{3,2,1,0})); // 0
    }
}
