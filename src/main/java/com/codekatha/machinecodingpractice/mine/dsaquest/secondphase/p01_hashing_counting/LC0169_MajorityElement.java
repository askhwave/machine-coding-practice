package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #169 - Majority Element  [Easy]
 * Link   : https://leetcode.com/problems/majority-element/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an array nums of size n, return the majority element. The majority element is the
 * element that appears more than floor(n / 2) times. You may assume that the majority element
 * always exists in the array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,2,3]
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 5 * 10^4
 *  - -10^9 <= nums[i] <= 10^9
 *  - Follow-up: solve it in linear time and O(1) space.
 *
 * Hint (spoiler - pehle khud try karo): Pehle HashMap count; phir Boyer-Moore voting (candidate + count) se O(1) space.
 */
public class LC0169_MajorityElement {

    // TODO: apna solution yahan likho
    public int majorityElement(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0169_MajorityElement sol = new LC0169_MajorityElement();
        System.out.println(sol.majorityElement(new int[]{3,2,3}));       // 3
        System.out.println(sol.majorityElement(new int[]{2,2,1,1,1,2,2})); // 2
    }
}
