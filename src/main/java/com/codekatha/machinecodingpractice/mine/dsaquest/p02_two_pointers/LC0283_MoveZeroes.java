package com.codekatha.machinecodingpractice.mine.dsaquest.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #283 - Move Zeroes  [Easy]
 * Link   : https://leetcode.com/problems/move-zeroes/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements. Note that you must do this in-place without making a copy of
 * the array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0]
 * Output: [0]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - -2^31 <= nums[i] <= 2^31 - 1
 *  - Follow-up: could you minimize the total number of operations done?
 *
 * Hint (spoiler - pehle khud try karo): write pointer: non-zero mila to wahan rakho, baaki zero bharo (ya swap).
 */
public class LC0283_MoveZeroes {

    // TODO: apna solution yahan likho
    public void moveZeroes(int[] nums) {
    }

    public static void main(String[] args) {
        LC0283_MoveZeroes sol = new LC0283_MoveZeroes();
        int[] a = {0,1,0,3,12};
        sol.moveZeroes(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
}
