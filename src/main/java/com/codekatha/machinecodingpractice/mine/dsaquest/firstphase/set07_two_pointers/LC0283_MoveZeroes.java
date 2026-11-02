package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set07_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.Arrays;

/**
 * LeetCode #283 - Move Zeroes  [Easy]
 * Link   : https://leetcode.com/problems/move-zeroes/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements. Note that you must do this in-place without making a copy of
 * the array.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [0]
 * Output: [0]
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 * - Follow-up: could you minimize the total number of operations done?
 * <p>
 * Hint (spoiler - pehle khud try karo): write pointer: non-zero mila to wahan rakho, baaki zero bharo (ya swap).
 */
public class LC0283_MoveZeroes {

    // TODO: apna solution yahan likho
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] =0;
        }

    }

    public static void main(String[] args) {
        LC0283_MoveZeroes sol = new LC0283_MoveZeroes();
        Check.start("LC0283_MoveZeroes");
        int[] a = {0, 1, 0, 3, 12};
        sol.moveZeroes(a);
        Check.eq("[1, 3, 12, 0, 0]", () -> Arrays.toString(a));
        Check.summary();
    }
}
