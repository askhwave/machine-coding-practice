package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #167 - Two Sum II - Input Array Is Sorted  [Medium]
 * Link   : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers be
 * numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length. Return the
 * indices of the two numbers, index1 and index2, added by one as an integer array [index1,
 * index2] of length 2. The tests are generated such that there is exactly one solution. You
 * may not use the same element twice. Your solution must use only constant extra space.
 *
 * Example 1:
 * <pre>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * </pre>
 *
 * Constraints:
 *  - 2 <= numbers.length <= 3 * 10^4
 *  - -1000 <= numbers[i] <= 1000
 *  - numbers is sorted in non-decreasing order.
 *  - -1000 <= target <= 1000
 *  - The tests are generated such that there is exactly one solution.
 *
 * Hint (spoiler - pehle khud try karo): Sum bada -> right--, chhota -> left++. Sorted hone ka fayda.
 */
public class LC0167_TwoSumIIInputArrayIsSorted {

    // TODO: apna solution yahan likho
    public int[] twoSum(int[] numbers, int target) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0167_TwoSumIIInputArrayIsSorted sol = new LC0167_TwoSumIIInputArrayIsSorted();
        Check.start("LC0167_TwoSumIIInputArrayIsSorted");
        Check.eq("[1, 2]", () -> Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));
        Check.eq("[1, 3]", () -> Arrays.toString(sol.twoSum(new int[]{2,3,4}, 6)));
        Check.eq("[1, 2]", () -> Arrays.toString(sol.twoSum(new int[]{-1,0}, -1)));
        Check.summary();
    }
}
