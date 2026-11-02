package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s01_subsets_combinations_permutations;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #78 - Subsets  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/subsets/
 * Group  : Backtracking  >  Subsets, Combinations & Permutations
 *
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0]
 * Output: [[],[0]]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10
 *  - -10 <= nums[i] <= 10
 *  - All the numbers of nums are unique.
 *
 * Hint (spoiler - pehle khud try karo): Har element ke liye 2 choices: include / exclude. Ya: dfs(start) me har node pe current list ko answer mein daalo, phir i = start.. se aage badho.
 */
public class LC0078_Subsets {

    // TODO: apna solution yahan likho
    public List<List<Integer>> subsets(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0078_Subsets sol = new LC0078_Subsets();
        Check.start("LC0078_Subsets");
        Check.sameElements("[[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]", () -> sol.subsets(new int[]{1,2,3}));
        Check.sameElements("[[], [0]]", () -> sol.subsets(new int[]{0}));
        Check.sameElements("[[], [1], [2], [1, 2]]", () -> sol.subsets(new int[]{1,2}));
        Check.sameElements("[[], [5], [-3], [8], [1], [5, -3], [5, 8], [5, 1], [-3, 8], [-3, 1], [8, 1], [5, -3, 8], [5, -3, 1], [5, 8, 1], [-3, 8, 1], [5, -3, 8, 1]]", () -> sol.subsets(new int[]{5,-3,8,1}));
        Check.sameElements("[[], [3], [1], [3, 1]]", () -> sol.subsets(new int[]{3,1}));
        Check.sameElements("[[], [1], [2], [3], [4], [5], [1, 2], [1, 3], [1, 4], [1, 5], [2, 3], [2, 4], [2, 5], [3, 4], [3, 5], [4, 5], [1, 2, 3], [1, 2, 4], [1, 2, 5], [1, 3, 4], [1, 3, 5], [1, 4, 5], [2, 3, 4], [2, 3, 5], [2, 4, 5], [3, 4, 5], [1, 2, 3, 4], [1, 2, 3, 5], [1, 2, 4, 5], [1, 3, 4, 5], [2, 3, 4, 5], [1, 2, 3, 4, 5]]", () -> sol.subsets(new int[]{1,2,3,4,5}));
        Check.eq(1024, () -> sol.subsets(new int[]{1,2,3,4,5,6,7,8,9,10}).size());
        Check.summary();
    }
}
