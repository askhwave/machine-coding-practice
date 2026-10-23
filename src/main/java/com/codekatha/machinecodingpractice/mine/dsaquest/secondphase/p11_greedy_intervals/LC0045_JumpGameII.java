package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #45 - Jump Game II  [Medium]
 * Link   : https://leetcode.com/problems/jump-game-ii/
 * Pattern: Greedy & Intervals
 *
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned
 * at index 0. Each element nums[i] represents the maximum length of a forward jump from index
 * i. Return the minimum number of jumps to reach index n - 1. The test cases are generated
 * such that you can reach index n - 1.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - 0 <= nums[i] <= 1000
 *  - It's guaranteed that you can reach nums[n - 1].
 *
 * Hint (spoiler - pehle khud try karo): Implicit BFS: currentEnd (is jump ki seema) aur farthest. i == currentEnd par jumps++, currentEnd = farthest.
 */
public class LC0045_JumpGameII {

    // TODO: apna solution yahan likho
    public int jump(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0045_JumpGameII sol = new LC0045_JumpGameII();
        Check.start("LC0045_JumpGameII");
        Check.eq("2", () -> sol.jump(new int[]{2,3,1,1,4}));
        Check.eq("2", () -> sol.jump(new int[]{2,3,0,1,4}));
        Check.eq("0", () -> sol.jump(new int[]{0}));
        Check.summary();
    }
}
