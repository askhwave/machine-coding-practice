package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set05_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #128 - Longest Consecutive Sequence  [Medium]
 * Link   : https://leetcode.com/problems/longest-consecutive-sequence/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive
 * elements sequence. You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [1,0,1,2]
 * Output: 3
 * </pre>
 * <p>
 * Constraints:
 * - 0 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * <p>
 * Hint (spoiler - pehle khud try karo): Set me daalo; sirf wahi number se count shuru karo jiska num-1 set me nahi hai (sequence ka start).
 */
public class LC0128_LongestConsecutiveSequence {

    // TODO: apna solution yahan likho
    public int longestConsecutive(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, false);
        }
        int ans = 0;

        //nums = [100,4,200,1,3,2]
        // 100-t,4-f,200-t,1-t,3-f,2-f
        for (int num : nums) {
            if (!map.containsKey(num - 1)) {
                map.put(num, true);
            }
        }

        for (int num : nums) {
            if (map.get(num) == true)
                ans = Math.max(ans, findLength(map, num));
        }

        return ans;
    }

    public int findLength(Map<Integer, Boolean> map, int key) {
        int count = 0;
        while (map.containsKey(key)) {
            count++;
            key++;
        }
        return count;
    }

    public static void main(String[] args) {
        LC0128_LongestConsecutiveSequence sol = new LC0128_LongestConsecutiveSequence();
        Check.start("LC0128_LongestConsecutiveSequence");
        Check.eq("4", () -> sol.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        Check.eq("9", () -> sol.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        Check.eq("3", () -> sol.longestConsecutive(new int[]{1, 0, 1, 2}));
        Check.summary();
    }
}
