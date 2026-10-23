package com.codekatha.machinecodingpractice.mine.dsaquest.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1295 - Find Numbers with Even Number of Digits  [Easy]
 * Link   : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 * <pre>
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation: 12 contains 2 digits (even), 345 contains 3 (odd), 2 contains 1 (odd), 6 contains 1 (odd), 7896 contains 4 (even).
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 500
 *  - 1 <= nums[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Digit count: String.valueOf(n).length() ya divide-by-10 loop.
 */
public class LC1295_FindNumbersWithEvenNumberOfDigits {

    // TODO: apna solution yahan likho
    public int findNumbers(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC1295_FindNumbersWithEvenNumberOfDigits sol = new LC1295_FindNumbersWithEvenNumberOfDigits();
        System.out.println(sol.findNumbers(new int[]{12,345,2,6,7896})); // 2
        System.out.println(sol.findNumbers(new int[]{555,901,482,1771})); // 1
    }
}
