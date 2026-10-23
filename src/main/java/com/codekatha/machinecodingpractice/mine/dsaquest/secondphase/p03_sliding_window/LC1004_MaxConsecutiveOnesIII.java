package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #1004 - Max Consecutive Ones III  [Medium]
 * Link   : https://leetcode.com/problems/max-consecutive-ones-iii/
 * Pattern: Sliding Window
 *
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in
 * the array if you can flip at most k 0's.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - nums[i] is either 0 or 1.
 *  - 0 <= k <= nums.length
 *
 * Hint (spoiler - pehle khud try karo): Window jisme zeros <= k ho. Zeros count > k hote hi left badhao.
 */
public class LC1004_MaxConsecutiveOnesIII {

    // TODO: apna solution yahan likho
    public int longestOnes(int[] nums, int k) {
        return 0;
    }

    public static void main(String[] args) {
        LC1004_MaxConsecutiveOnesIII sol = new LC1004_MaxConsecutiveOnesIII();
        System.out.println(sol.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); // 6
        System.out.println(sol.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); // 10
    }
}
