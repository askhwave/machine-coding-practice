package com.codekatha.machinecodingpractice.mine.dsaquest.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #55 - Jump Game  [Medium]
 * Link   : https://leetcode.com/problems/jump-game/
 * Pattern: Greedy & Intervals
 *
 * You are given an integer array nums. You are initially positioned at the array's first
 * index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - 0 <= nums[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): farthest reachable index track karo; i > farthest ho jaye to stuck.
 */
public class LC0055_JumpGame {

    // TODO: apna solution yahan likho
    public boolean canJump(int[] nums) {
        return false;
    }

    public static void main(String[] args) {
        LC0055_JumpGame sol = new LC0055_JumpGame();
        System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
        System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
        System.out.println(sol.canJump(new int[]{0}));         // true
    }
}
