package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set04_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #219 - Contains Duplicate II  [Easy]
 * Link   : https://leetcode.com/problems/contains-duplicate-ii/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices
 * i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -10^9 <= nums[i] <= 10^9
 *  - 0 <= k <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Map: value -> last index. Ya size-k ka sliding set.
 */
public class LC0219_ContainsDuplicateII {

    // TODO: apna solution yahan likho
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return false;
    }

    public static void main(String[] args) {
        LC0219_ContainsDuplicateII sol = new LC0219_ContainsDuplicateII();
        Check.start("LC0219_ContainsDuplicateII");
        Check.eq("true", () -> sol.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        Check.eq("true", () -> sol.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        Check.eq("false", () -> sol.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
        Check.summary();
    }
}
