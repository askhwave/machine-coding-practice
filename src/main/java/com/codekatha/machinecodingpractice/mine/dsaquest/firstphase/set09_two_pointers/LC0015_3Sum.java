package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set09_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.*;

/**
 * LeetCode #15 - 3Sum  [Medium]
 * Link   : https://leetcode.com/problems/3sum/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i
 * != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set
 * must not contain duplicate triplets.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [0,1,1]
 * Output: []
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * </pre>
 * <p>
 * Constraints:
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 * <p>
 * Hint (spoiler - pehle khud try karo): Sort -> ek element fix -> baaki par Two Sum II (#167). Duplicates skip karna mat bhoolna.
 */
public class LC0015_3Sum {

    // TODO: apna solution yahan likho
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            int l = i + 1;
            int r = n;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == -nums[i]) {
                    ans.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (sum < -nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(ans);
        return result;
    }


    public static void main(String[] args) {
        LC0015_3Sum sol = new LC0015_3Sum();
        Check.start("LC0015_3Sum");
        Check.sameElements("[[-1, -1, 2], [-1, 0, 1]]", () -> sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        Check.sameElements("[]", () -> sol.threeSum(new int[]{0, 1, 1}));
        Check.sameElements("[[0, 0, 0]]", () -> sol.threeSum(new int[]{0, 0, 0}));
        Check.summary();
    }
}
