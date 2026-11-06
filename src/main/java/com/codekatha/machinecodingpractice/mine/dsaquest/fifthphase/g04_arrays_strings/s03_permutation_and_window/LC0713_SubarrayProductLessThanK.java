package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s03_permutation_and_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #713 - Subarray Product Less Than K  [Difficulty: Medium | Atlassian: last seen 2 years, frequency score 0.025]
 * Link   : https://leetcode.com/problems/subarray-product-less-than-k/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Permutation & Window
 *
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays
 * where the product of all the elements in the subarray is strictly less than k.
 *
 * Example 1:
 * <pre>
 * Input: nums = [10,5,2,6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]. Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,2,3], k = 0
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 3 * 10^4
 *  - 1 <= nums[i] <= 1000
 *  - 0 <= k <= 10^6
 *
 * Hint (spoiler - pehle khud try karo): Sliding window: right badhao, product *= nums[r]. Jab product >= k ho to left se divide karke shrink karo. Har right pe nayi valid subarrays = r - l + 1 (jo r pe end hoti hain). k <= 1 pe seedha 0 (product >= 1 hamesha).
 */
public class LC0713_SubarrayProductLessThanK {

    // TODO: apna solution yahan likho
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return 0;
    }

    public static void main(String[] args) {
        LC0713_SubarrayProductLessThanK sol = new LC0713_SubarrayProductLessThanK();
        Check.start("LC0713_SubarrayProductLessThanK");
        Check.eq(8, () -> sol.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
        Check.eq(0, () -> sol.numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
        Check.eq(0, () -> sol.numSubarrayProductLessThanK(new int[]{1,1,1}, 1));
        Check.eq(6, () -> sol.numSubarrayProductLessThanK(new int[]{1,1,1}, 2));
        Check.eq(0, () -> sol.numSubarrayProductLessThanK(new int[]{5}, 5));
        Check.eq(1, () -> sol.numSubarrayProductLessThanK(new int[]{5}, 6));
        Check.eq(5, () -> sol.numSubarrayProductLessThanK(new int[]{100,200,300}, 1000000));
        Check.eq(3, () -> sol.numSubarrayProductLessThanK(new int[]{1000,1000,1000}, 1000000));
        Check.eq(5, () -> sol.numSubarrayProductLessThanK(new int[]{1000,1000,1000}, 1000001));
        Check.eq(7, () -> sol.numSubarrayProductLessThanK(new int[]{2,2,2,2}, 5));
        Check.eq(7, () -> sol.numSubarrayProductLessThanK(new int[]{2,2,2,2}, 8));
        Check.eq(11, () -> sol.numSubarrayProductLessThanK(new int[]{1,2,1,2,1}, 3));
        Check.eq(0, () -> sol.numSubarrayProductLessThanK(new int[]{1}, 0));
        Check.eq(0, () -> sol.numSubarrayProductLessThanK(new int[]{1}, 1));
        Check.eq(18, () -> sol.numSubarrayProductLessThanK(new int[]{5,2,5,3,4,1,5,2}, 30));
        Check.eq(96, () -> sol.numSubarrayProductLessThanK(new int[]{3,1,2,2,3,1,2,2,1,2,1,1,1,2,3}, 50));
        Check.eq(188, () -> sol.numSubarrayProductLessThanK(new int[]{3,2,4,3,2,4,4,2,1,4,4,3,2,1,3,3,4,4,2,4,1,4,4,1,4,2,1,3,1,3}, 1000));
        Check.eq(6629, () -> sol.numSubarrayProductLessThanK(new int[]{3,2,1,2,3,1,1,2,1,2,1,1,2,3,3,2,3,3,2,1,2,3,2,1,3,3,3,1,1,1,1,3,2,3,3,2,1,3,3,3,3,2,3,1,3,1,1,3,3,2,1,1,1,2,2,2,1,1,3,3,3,2,2,1,1,2,3,2,1,2,1,2,2,1,2,1,3,2,1,1,2,3,1,1,1,3,2,3,2,3,3,1,2,1,2,2,3,1,3,3,3,2,2,1,1,2,2,3,2,2,2,3,1,3,1,3,1,1,1,3,1,1,2,1,2,1,2,3,1,3,3,3,2,3,3,3,3,1,1,2,3,3,2,2,3,2,3,2,1,2,1,2,2,1,1,1,3,2,3,2,2,3,1,2,3,3,1,1,2,3,1,1,2,2,3,2,3,1,2,3,3,1,1,3,2,3,3,1,3,1,3,2,2,3,3,1,1,2,3,2,1,2,1,1,2,1,3,3,1,1,3,1,3,1,1,3,3,3,3,1,2,1,1,1,3,3,3,3,1,1,3,3,1,2,3,1,3,3,2,1,1,1,1,2,3,3,3,3,3,1,2,2,1,3,1,1,2,3,3,1,1,2,2,1,1,3,2,3,3,2,1,3,3,3,2,3,1,1,2,2,1,2,1,1,2,1,3,1,2,2,2,1,2,1,1,2,1,1,2,3}, 1000000));
        Check.eq(450015000, () -> { int[] a = new int[30000]; Arrays.fill(a, 1); return sol.numSubarrayProductLessThanK(a, 2); });   // 30000 ones: n(n+1)/2, O(n) chahiye
        Check.eq(0, () -> { int[] a = new int[30000]; Arrays.fill(a, 1); return sol.numSubarrayProductLessThanK(a, 1); });   // product 1 < 1 nahi
        Check.summary();
    }
}
