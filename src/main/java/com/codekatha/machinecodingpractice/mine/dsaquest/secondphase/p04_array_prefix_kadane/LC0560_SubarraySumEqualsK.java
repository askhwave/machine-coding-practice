package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #560 - Subarray Sum Equals K  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/subarray-sum-equals-k/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an array of integers nums and an integer k, return the total number of subarrays whose
 * sum equals to k. A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 2 * 10^4
 *  - -1000 <= nums[i] <= 1000
 *  - -10^7 <= k <= 10^7
 *
 * Hint (spoiler - pehle khud try karo): Prefix sum + HashMap&lt;prefix, count>: currentPrefix - k pehle kitni baar aaya? (Negatives hain, window nahi chalega.) map.put(0,1) mat bhoolna.
 */
public class LC0560_SubarraySumEqualsK {

    // TODO: apna solution yahan likho
    public int subarraySum(int[] nums, int k) {
        return 0;
    }

    public static void main(String[] args) {
        LC0560_SubarraySumEqualsK sol = new LC0560_SubarraySumEqualsK();
        Check.start("LC0560_SubarraySumEqualsK");
        Check.eq("2", () -> sol.subarraySum(new int[]{1,1,1}, 2));
        Check.eq("2", () -> sol.subarraySum(new int[]{1,2,3}, 3));
        Check.eq("3", () -> sol.subarraySum(new int[]{1,-1,0}, 0));
        Check.summary();
    }
}
