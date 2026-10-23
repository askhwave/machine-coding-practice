package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #448 - Find All Numbers Disappeared in an Array  [Easy]
 * Link   : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of
 * all the integers in the range [1, n] that do not appear in nums.
 *
 * Example 1:
 * <pre>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,1]
 * Output: [2]
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 10^5
 *  - 1 <= nums[i] <= n
 *  - Follow-up: could you do it without extra space and in O(n) runtime?
 *
 * Hint (spoiler - pehle khud try karo): Index-as-hash: value v ke liye index v-1 ko negative mark karo.
 */
public class LC0448_FindAllNumbersDisappearedInAnArray {

    // TODO: apna solution yahan likho
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0448_FindAllNumbersDisappearedInAnArray sol = new LC0448_FindAllNumbersDisappearedInAnArray();
        System.out.println(sol.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})); // [5, 6]
        System.out.println(sol.findDisappearedNumbers(new int[]{1,1}));             // [2]
    }
}
