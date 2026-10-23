package com.codekatha.machinecodingpractice.mine.dsaquest.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #15 - 3Sum  [Medium]
 * Link   : https://leetcode.com/problems/3sum/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i
 * != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set
 * must not contain duplicate triplets.
 *
 * Example 1:
 * <pre>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1,1]
 * Output: []
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * </pre>
 *
 * Constraints:
 *  - 3 <= nums.length <= 3000
 *  - -10^5 <= nums[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Sort -> ek element fix -> baaki par Two Sum II (#167). Duplicates skip karna mat bhoolna.
 */
public class LC0015_3Sum {

    // TODO: apna solution yahan likho
    public List<List<Integer>> threeSum(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0015_3Sum sol = new LC0015_3Sum();
        System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4})); // [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(sol.threeSum(new int[]{0,1,1}));           // []
        System.out.println(sol.threeSum(new int[]{0,0,0}));           // [[0, 0, 0]]
    }
}
