package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set52_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #268 - Missing Number  [Easy]
 * Link   : https://leetcode.com/problems/missing-number/
 * Pattern: Bit Manipulation & Math
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only
 * number in the range that is missing from the array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,0,1]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1]
 * Output: 2
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 10^4
 *  - 0 <= nums[i] <= n
 *  - All the numbers of nums are unique.
 *  - Follow-up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 *
 * Hint (spoiler - pehle khud try karo): Teen tareeke: sum formula n(n+1)/2 - sum, XOR (index ^ value), cyclic sort. Teeno likh ke dekho.
 */
public class LC0268_MissingNumber {

    // TODO: apna solution yahan likho
    public int missingNumber(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0268_MissingNumber sol = new LC0268_MissingNumber();
        Check.start("LC0268_MissingNumber");
        Check.eq("2", () -> sol.missingNumber(new int[]{3,0,1}));
        Check.eq("2", () -> sol.missingNumber(new int[]{0,1}));
        Check.eq("8", () -> sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        Check.summary();
    }
}
