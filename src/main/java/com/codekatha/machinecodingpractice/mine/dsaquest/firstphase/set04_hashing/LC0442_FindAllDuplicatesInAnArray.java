package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set04_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #442 - Find All Duplicates in an Array  [Medium]
 * Link   : https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given an integer array nums of length n where all the integers of nums are in the range [1,
 * n] and each integer appears once or twice, return an array of all the integers that appear
 * twice. You must write an algorithm that runs in O(n) time and uses only constant auxiliary
 * space, excluding the space needed to store the output.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [1,1,2]
 * Output: [1]
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [1]
 * Output: []
 * </pre>
 * <p>
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 10^5
 * - 1 <= nums[i] <= n
 * - Each element appears once or twice.
 * <p>
 * Hint (spoiler - pehle khud try karo): #448 wali hi trick: index-as-hash; already negative mila to duplicate.
 */
public class LC0442_FindAllDuplicatesInAnArray {

    // TODO: apna solution yahan likho
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx - 1] > 0) {
                nums[idx - 1] = -nums[idx - 1];
            } else{
                ans.add(idx);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        LC0442_FindAllDuplicatesInAnArray sol = new LC0442_FindAllDuplicatesInAnArray();
        Check.start("LC0442_FindAllDuplicatesInAnArray");
        Check.sameElements("[2, 3]", () -> sol.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        Check.sameElements("[1]", () -> sol.findDuplicates(new int[]{1, 1, 2}));
        Check.sameElements("[]", () -> sol.findDuplicates(new int[]{1}));
        Check.summary();
    }
}
