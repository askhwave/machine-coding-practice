package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set20_arrays_prefix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #41 - First Missing Positive  [Hard]
 * Link   : https://leetcode.com/problems/first-missing-positive/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an unsorted integer array nums. Return the smallest positive integer that is not
 * present in nums. You must implement an algorithm that runs in O(n) time and uses O(1)
 * auxiliary space.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,0]
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -2^31 <= nums[i] <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): Answer hamesha 1..n+1 me hota hai. Cyclic sort: value v ko index v-1 par bhejo, phir pehla mismatch dhundo.
 */
public class LC0041_FirstMissingPositive {

    // TODO: apna solution yahan likho
    public int firstMissingPositive(int[] nums) {
        return 1;
    }

    public static void main(String[] args) {
        LC0041_FirstMissingPositive sol = new LC0041_FirstMissingPositive();
        Check.start("LC0041_FirstMissingPositive");
        Check.eq("3", () -> sol.firstMissingPositive(new int[]{1,2,0}));
        Check.eq("2", () -> sol.firstMissingPositive(new int[]{3,4,-1,1}));
        Check.eq("1", () -> sol.firstMissingPositive(new int[]{7,8,9,11,12}));
        Check.summary();
    }
}
