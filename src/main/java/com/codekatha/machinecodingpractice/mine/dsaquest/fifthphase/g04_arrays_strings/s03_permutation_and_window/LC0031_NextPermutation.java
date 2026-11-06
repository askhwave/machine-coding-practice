package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s03_permutation_and_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #31 - Next Permutation  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.037]
 * Link   : https://leetcode.com/problems/next-permutation/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Permutation & Window
 *
 * A permutation of an array of integers is an arrangement of its members into a sequence or
 * linear order. For example, for arr = [1,2,3], the following are all the permutations of arr:
 * [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]. The next permutation of an array
 * of integers is the next lexicographically greater permutation of its integer. More formally,
 * if all the permutations of the array are sorted in one container according to their
 * lexicographical order, then the next permutation of that array is the permutation that
 * follows it in the container. If such arrangement is not possible, the array must be
 * rearranged as the lowest possible order (i.e., sorted in ascending order). For example, the
 * next permutation of arr = [1,2,3] is [1,3,2]. Similarly, the next permutation of arr =
 * [2,3,1] is [3,1,2]. While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1]
 * does not have a lexicographical larger rearrangement. Given an array of integers nums, find
 * the next permutation of nums. The replacement must be in place and use only constant extra
 * memory.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 100
 *  - 0 <= nums[i] <= 100
 *
 * Hint (spoiler - pehle khud try karo): Peeche se pehla index i jahan nums[i] < nums[i+1] (pivot). Na mile to poora reverse. Warna peeche se pehla j jahan nums[j] > nums[i], swap(i, j), phir i+1 se end tak reverse (wo suffix descending tha, reverse = ascending = sabse chhota).
 */
public class LC0031_NextPermutation {

    // TODO: apna solution yahan likho
    public void nextPermutation(int[] nums) {
    }

    public static void main(String[] args) {
        LC0031_NextPermutation sol = new LC0031_NextPermutation();
        Check.start("LC0031_NextPermutation");
        Check.eq("[1, 3, 2]", () -> { int[] a = new int[]{1,2,3}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 2, 3]", () -> { int[] a = new int[]{3,2,1}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 5, 1]", () -> { int[] a = new int[]{1,1,5}; sol.nextPermutation(a); return a; });
        Check.eq("[1]", () -> { int[] a = new int[]{1}; sol.nextPermutation(a); return a; });
        Check.eq("[3, 1, 2]", () -> { int[] a = new int[]{2,3,1}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 1, 3]", () -> { int[] a = new int[]{1,3,2}; sol.nextPermutation(a); return a; });
        Check.eq("[5, 5, 2, 3, 4, 7]", () -> { int[] a = new int[]{5,4,7,5,3,2}; sol.nextPermutation(a); return a; });
        Check.eq("[5, 1, 1]", () -> { int[] a = new int[]{1,5,1}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 2, 2]", () -> { int[] a = new int[]{2,2,2}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 1]", () -> { int[] a = new int[]{1,2}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 2]", () -> { int[] a = new int[]{2,1}; sol.nextPermutation(a); return a; });
        Check.eq("[0, 1, 3, 0, 2, 3, 5]", () -> { int[] a = new int[]{0,1,2,5,3,3,0}; sol.nextPermutation(a); return a; });
        Check.eq("[4, 2, 0, 3, 0, 2, 2]", () -> { int[] a = new int[]{4,2,0,2,3,2,0}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 1, 2, 3]", () -> { int[] a = new int[]{1,3,2,2}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 2, 3, 4, 5, 7, 6]", () -> { int[] a = new int[]{1,2,3,4,5,6,7}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 2, 3, 4, 5, 6, 7]", () -> { int[] a = new int[]{7,6,5,4,3,2,1}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 4]", () -> { int[] a = new int[]{4,1}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 1, 3, 3, 3, 3, 3]", () -> { int[] a = new int[]{1,3,3,3,3,3,2}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 1, 4]", () -> { int[] a = new int[]{1,4,2}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 3, 0, 0, 1]", () -> { int[] a = new int[]{1,1,3,0,0}; sol.nextPermutation(a); return a; });
        Check.eq("[3, 4, 2, 3, 4, 3, 2]", () -> { int[] a = new int[]{3,4,2,3,4,2,3}; sol.nextPermutation(a); return a; });
        Check.eq("[4, 3, 1, 2, 2, 1, 3]", () -> { int[] a = new int[]{4,3,1,2,1,3,2}; sol.nextPermutation(a); return a; });
        Check.eq("[4, 1, 2, 0, 4, 3, 0]", () -> { int[] a = new int[]{4,1,2,0,4,0,3}; sol.nextPermutation(a); return a; });
        Check.eq("[1, 4, 1, 4, 0]", () -> { int[] a = new int[]{1,4,1,0,4}; sol.nextPermutation(a); return a; });
        Check.eq("[3, 4, 1, 2, 2]", () -> { int[] a = new int[]{3,2,4,2,1}; sol.nextPermutation(a); return a; });
        Check.eq("[4, 3, 2, 4, 1, 3]", () -> { int[] a = new int[]{4,3,2,3,4,1}; sol.nextPermutation(a); return a; });
        Check.eq("[2, 3, 2, 1, 0, 3, 4]", () -> { int[] a = new int[]{2,3,2,0,4,3,1}; sol.nextPermutation(a); return a; });
        Check.eq("[4, 2, 4, 1, 1, 4, 4]", () -> { int[] a = new int[]{4,2,1,4,4,4,1}; sol.nextPermutation(a); return a; });
        Check.eq("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1], [1, 2, 3]]", () -> { int[] a = {1, 2, 3}; List<int[]> seen = new ArrayList<>(); seen.add(a.clone()); for (int i = 0; i < 6; i++) { sol.nextPermutation(a); seen.add(a.clone()); } return Arrays.deepToString(seen.toArray()); });   // 6 baar lagao: cycle poora hoke wapas [1,2,3]
        Check.summary();
    }
}
