package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s01_subsets_combinations_permutations;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #39 - Combination Sum  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/combination-sum/
 * Group  : Backtracking  >  Subsets, Combinations & Permutations
 *
 * Given an array of distinct integers candidates and a target integer target, return a list of
 * all unique combinations of candidates where the chosen numbers sum to target. You may return
 * the combinations in any order. The same number may be chosen from candidates an unlimited
 * number of times. Two combinations are unique if the frequency of at least one of the chosen
 * numbers is different.
 *
 * Example 1:
 * <pre>
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times. 7 is a candidate, and 7 = 7.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: candidates = [2], target = 1
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - 1 <= candidates.length <= 30
 *  - 2 <= candidates[i] <= 40
 *  - All elements of candidates are distinct.
 *  - 1 <= target <= 40
 *
 * Hint (spoiler - pehle khud try karo): dfs(start, remaining): har step pe candidates[start..] me se ek lo (same index dobara allowed => dfs(i, ...)). start index se aage hi jao warna [2,3] aur [3,2] dono ban jayenge.
 */
public class LC0039_CombinationSum {

    // TODO: apna solution yahan likho
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0039_CombinationSum sol = new LC0039_CombinationSum();
        Check.start("LC0039_CombinationSum");
        Check.sameElements("[[2, 2, 3], [7]]", () -> sol.combinationSum(new int[]{2,3,6,7}, 7));
        Check.sameElements("[[2, 2, 2, 2], [2, 3, 3], [3, 5]]", () -> sol.combinationSum(new int[]{2,3,5}, 8));
        Check.sameElements("[]", () -> sol.combinationSum(new int[]{2}, 1));
        Check.sameElements("[[1]]", () -> sol.combinationSum(new int[]{1}, 1));
        Check.sameElements("[[1, 1]]", () -> sol.combinationSum(new int[]{1}, 2));
        Check.sameElements("[[7, 7, 2, 2], [7, 3, 3, 3, 2], [7, 3, 2, 2, 2, 2], [3, 3, 3, 3, 3, 3], [3, 3, 3, 3, 2, 2, 2], [3, 3, 2, 2, 2, 2, 2, 2], [2, 2, 2, 2, 2, 2, 2, 2, 2]]", () -> sol.combinationSum(new int[]{7,3,2}, 18));
        Check.sameElements("[[4, 4], [4, 2, 2], [2, 2, 2, 2], [8]]", () -> sol.combinationSum(new int[]{4,2,8}, 8));
        Check.sameElements("[[3, 3, 5], [3, 8]]", () -> sol.combinationSum(new int[]{3,5,8}, 11));
        Check.sameElements("[[2, 2, 2, 2, 2, 2], [2, 2, 2, 3, 3], [2, 2, 3, 5], [2, 5, 5], [3, 3, 3, 3]]", () -> sol.combinationSum(new int[]{2,3,5}, 12));
        Check.summary();
    }
}
