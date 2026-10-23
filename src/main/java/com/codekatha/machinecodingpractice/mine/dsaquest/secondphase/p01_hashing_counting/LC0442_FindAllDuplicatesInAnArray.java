package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #442 - Find All Duplicates in an Array  [Medium]
 * Link   : https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an integer array nums of length n where all the integers of nums are in the range [1,
 * n] and each integer appears once or twice, return an array of all the integers that appear
 * twice. You must write an algorithm that runs in O(n) time and uses only constant auxiliary
 * space, excluding the space needed to store the output.
 *
 * Example 1:
 * <pre>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,1,2]
 * Output: [1]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1]
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 10^5
 *  - 1 <= nums[i] <= n
 *  - Each element appears once or twice.
 *
 * Hint (spoiler - pehle khud try karo): #448 wali hi trick: index-as-hash; already negative mila to duplicate.
 */
public class LC0442_FindAllDuplicatesInAnArray {

    // TODO: apna solution yahan likho
    public List<Integer> findDuplicates(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0442_FindAllDuplicatesInAnArray sol = new LC0442_FindAllDuplicatesInAnArray();
        System.out.println(sol.findDuplicates(new int[]{4,3,2,7,8,2,3,1})); // [2, 3]
        System.out.println(sol.findDuplicates(new int[]{1,1,2}));           // [1]
        System.out.println(sol.findDuplicates(new int[]{1}));               // []
    }
}
