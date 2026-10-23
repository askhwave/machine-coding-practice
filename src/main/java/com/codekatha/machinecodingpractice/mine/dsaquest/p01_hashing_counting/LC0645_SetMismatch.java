package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #645 - Set Mismatch  [Easy]
 * Link   : https://leetcode.com/problems/set-mismatch/
 * Pattern: Hash Map / Set / Counting
 *
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number
 * in the set, which results in repetition of one number and loss of another number. You are
 * given an integer array nums representing the data status of this set after the error. Find
 * the number that occurs twice and the number that is missing and return them in the form of
 * an array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,1]
 * Output: [1,2]
 * </pre>
 *
 * Constraints:
 *  - 2 <= nums.length <= 10^4
 *  - 1 <= nums[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Frequency array 1..n: freq 2 = duplicate, freq 0 = missing. Follow-up: O(1) space.
 */
public class LC0645_SetMismatch {

    // TODO: apna solution yahan likho
    public int[] findErrorNums(int[] nums) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0645_SetMismatch sol = new LC0645_SetMismatch();
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1,2,2,4}))); // [2, 3]
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1,1})));     // [1, 2]
    }
}
