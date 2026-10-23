package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #128 - Longest Consecutive Sequence  [Medium]
 * Link   : https://leetcode.com/problems/longest-consecutive-sequence/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive
 * elements sequence. You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 * <pre>
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1,0,1,2]
 * Output: 3
 * </pre>
 *
 * Constraints:
 *  - 0 <= nums.length <= 10^5
 *  - -10^9 <= nums[i] <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): Set me daalo; sirf wahi number se count shuru karo jiska num-1 set me nahi hai (sequence ka start).
 */
public class LC0128_LongestConsecutiveSequence {

    // TODO: apna solution yahan likho
    public int longestConsecutive(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0128_LongestConsecutiveSequence sol = new LC0128_LongestConsecutiveSequence();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2}));         // 4
        System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));     // 9
        System.out.println(sol.longestConsecutive(new int[]{1,0,1,2}));                 // 3
    }
}
