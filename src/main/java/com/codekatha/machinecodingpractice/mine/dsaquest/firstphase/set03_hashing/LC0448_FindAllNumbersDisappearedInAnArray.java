package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set03_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #448 - Find All Numbers Disappeared in an Array  [Easy]
 * Link   : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of
 * all the integers in the range [1, n] that do not appear in nums.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [1,1]
 * Output: [2]
 * </pre>
 * <p>
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 10^5
 * - 1 <= nums[i] <= n
 * - Follow-up: could you do it without extra space and in O(n) runtime?
 * <p>
 * Hint (spoiler - pehle khud try karo): Index-as-hash: value v ke liye index v-1 ko negative mark karo.
 */
public class LC0448_FindAllNumbersDisappearedInAnArray {

    // TODO: apna solution yahan likho
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx-1] > 0)
                nums[idx-1] = -nums[idx-1];
            //Arrays.stream(nums).mapToObj(v -> v + ",").forEach(System.out::print);
            //System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC0448_FindAllNumbersDisappearedInAnArray sol = new LC0448_FindAllNumbersDisappearedInAnArray();
        Check.start("LC0448_FindAllNumbersDisappearedInAnArray");
        Check.sameElements("[5, 6]", () -> sol.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        Check.sameElements("[2]", () -> sol.findDisappearedNumbers(new int[]{1, 1}));
        Check.summary();
    }
}
