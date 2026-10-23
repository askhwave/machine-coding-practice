package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #136 - Single Number  [Easy]
 * Link   : https://leetcode.com/problems/single-number/
 * Pattern: Bit Manipulation & Math
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find
 * that single one. You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 *
 * Example 1:
 * <pre>
 * Input: nums = [2,2,1]
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 3 * 10^4
 *  - -3 * 10^4 <= nums[i] <= 3 * 10^4
 *  - Each element in the array appears twice except for one element which appears only once.
 *
 * Hint (spoiler - pehle khud try karo): XOR: a ^ a = 0, a ^ 0 = a. Saare elements XOR kar do.
 */
public class LC0136_SingleNumber {

    // TODO: apna solution yahan likho
    public int singleNumber(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0136_SingleNumber sol = new LC0136_SingleNumber();
        System.out.println(sol.singleNumber(new int[]{2,2,1}));       // 1
        System.out.println(sol.singleNumber(new int[]{4,1,2,1,2}));   // 4
        System.out.println(sol.singleNumber(new int[]{1}));           // 1
    }
}
