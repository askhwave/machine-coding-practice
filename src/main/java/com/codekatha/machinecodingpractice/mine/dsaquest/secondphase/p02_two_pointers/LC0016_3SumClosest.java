package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #16 - 3Sum Closest  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/3sum-closest/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an integer array nums of length n and an integer target, find three integers in nums
 * such that the sum is closest to target. Return the sum of the three integers. You may assume
 * that each input would have exactly one solution.
 *
 * Example 1:
 * <pre>
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 3 <= nums.length <= 500
 *  - -1000 <= nums[i] <= 1000
 *  - -10^4 <= target <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): #15 jaisa structure; closest diff track karo, sum == target pe turant return.
 */
public class LC0016_3SumClosest {

    // TODO: apna solution yahan likho
    public int threeSumClosest(int[] nums, int target) {
        return 0;
    }

    public static void main(String[] args) {
        LC0016_3SumClosest sol = new LC0016_3SumClosest();
        System.out.println(sol.threeSumClosest(new int[]{-1,2,1,-4}, 1)); // 2
        System.out.println(sol.threeSumClosest(new int[]{0,0,0}, 1));     // 0
    }
}
