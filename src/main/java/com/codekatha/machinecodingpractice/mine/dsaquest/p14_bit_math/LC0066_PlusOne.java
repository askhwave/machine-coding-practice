package com.codekatha.machinecodingpractice.mine.dsaquest.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #66 - Plus One  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/plus-one/
 * Pattern: Bit Manipulation & Math
 *
 * You are given a large integer represented as an integer array digits, where each digits[i]
 * is the ith digit of the integer. The digits are ordered from most significant to least
 * significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 * <pre>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: digits = [9]
 * Output: [1,0]
 * </pre>
 *
 * Constraints:
 *  - 1 <= digits.length <= 100
 *  - 0 <= digits[i] <= 9
 *  - digits does not contain any leading 0's.
 *
 * Hint (spoiler - pehle khud try karo): Peeche se: 9 -> 0 karke aage badho, pehla non-9 mila to +1 aur return. Sab 9 the to size+1 array.
 */
public class LC0066_PlusOne {

    // TODO: apna solution yahan likho
    public int[] plusOne(int[] digits) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0066_PlusOne sol = new LC0066_PlusOne();
        System.out.println(Arrays.toString(sol.plusOne(new int[]{1,2,3})));    // [1, 2, 4]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{4,3,2,1})));  // [4, 3, 2, 2]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9,9})));      // [1, 0, 0]
    }
}
