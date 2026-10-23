package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #217 - Contains Duplicate  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/contains-duplicate/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,1]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,2,3,4]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -10^9 <= nums[i] <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): HashSet: add() false return kare to duplicate.
 */
public class LC0217_ContainsDuplicate {

    // TODO: apna solution yahan likho
    public boolean containsDuplicate(int[] nums) {
        return false;
    }

    public static void main(String[] args) {
        LC0217_ContainsDuplicate sol = new LC0217_ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4})); // false
    }
}
