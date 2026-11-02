package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s01_subsets_combinations_permutations;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #46 - Permutations  [LeetCode: Medium | Cheatsheet: Round 2 F2F | Medium]
 * Link   : https://leetcode.com/problems/permutations/
 * Group  : Backtracking  >  Subsets, Combinations & Permutations
 *
 * Given an array nums of distinct integers, return all the possible permutations. You can
 * return the answer in any order.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1]
 * Output: [[1]]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 6
 *  - -10 <= nums[i] <= 10
 *  - All the integers of nums are unique.
 *
 * Hint (spoiler - pehle khud try karo): used[] array: har level pe woh element lo jo abhi tak use nahi hua; cur poora (size == n) ho to copy karke result mein daalo; wapas aate waqt un-choose.
 */
public class LC0046_Permutations {

    // TODO: apna solution yahan likho
    public List<List<Integer>> permute(int[] nums) {
        return new ArrayList<>();
    }

    // order-insensitive compare helper: har inner list ko toString karke outer list sort kar deta hai
    static <T> List<String> canon(List<List<T>> rows) {
        List<String> out = new ArrayList<>();
        for (List<T> r : rows) out.add(r.toString());
        Collections.sort(out);
        return out;
    }

    public static void main(String[] args) {
        LC0046_Permutations sol = new LC0046_Permutations();
        Check.start("LC0046_Permutations");
        Check.eq("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", () -> canon(sol.permute(new int[]{1,2,3})));
        Check.eq("[[0, 1], [1, 0]]", () -> canon(sol.permute(new int[]{0,1})));
        Check.eq("[[1]]", () -> canon(sol.permute(new int[]{1})));
        Check.eq("[[1, 2, 3, 4], [1, 2, 4, 3], [1, 3, 2, 4], [1, 3, 4, 2], [1, 4, 2, 3], [1, 4, 3, 2], [2, 1, 3, 4], [2, 1, 4, 3], [2, 3, 1, 4], [2, 3, 4, 1], [2, 4, 1, 3], [2, 4, 3, 1], [3, 1, 2, 4], [3, 1, 4, 2], [3, 2, 1, 4], [3, 2, 4, 1], [3, 4, 1, 2], [3, 4, 2, 1], [4, 1, 2, 3], [4, 1, 3, 2], [4, 2, 1, 3], [4, 2, 3, 1], [4, 3, 1, 2], [4, 3, 2, 1]]", () -> canon(sol.permute(new int[]{1,2,3,4})));
        Check.eq("[[-1, 0, 1], [-1, 1, 0], [0, -1, 1], [0, 1, -1], [1, -1, 0], [1, 0, -1]]", () -> canon(sol.permute(new int[]{-1,0,1})));
        Check.eq("[[2, 4, 5, 6], [2, 4, 6, 5], [2, 5, 4, 6], [2, 5, 6, 4], [2, 6, 4, 5], [2, 6, 5, 4], [4, 2, 5, 6], [4, 2, 6, 5], [4, 5, 2, 6], [4, 5, 6, 2], [4, 6, 2, 5], [4, 6, 5, 2], [5, 2, 4, 6], [5, 2, 6, 4], [5, 4, 2, 6], [5, 4, 6, 2], [5, 6, 2, 4], [5, 6, 4, 2], [6, 2, 4, 5], [6, 2, 5, 4], [6, 4, 2, 5], [6, 4, 5, 2], [6, 5, 2, 4], [6, 5, 4, 2]]", () -> canon(sol.permute(new int[]{5,4,6,2})));
        Check.eq(720, () -> sol.permute(new int[]{1,2,3,4,5,6}).size());
        Check.eq(720, () -> new HashSet<>(sol.permute(new int[]{1,2,3,4,5,6})).size()); // sab permutations alag hone chahiye
        Check.summary();
    }
}
