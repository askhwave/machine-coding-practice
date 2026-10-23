package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #7 - Reverse Integer  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/reverse-integer/
 * Pattern: Bit Manipulation & Math
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
 * the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * <pre>
 * Input: x = 123
 * Output: 321
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: x = -123
 * Output: -321
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: x = 120
 * Output: 21
 * </pre>
 *
 * Constraints:
 *  - -2^31 <= x <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): pop = x % 10; x /= 10; rev = rev * 10 + pop. Multiply karne se PEHLE overflow check (rev > MAX/10 ...). Negative me Java % bhi sign rakhta hai - sahi chalega.
 */
public class LC0007_ReverseInteger {

    // TODO: apna solution yahan likho
    public int reverse(int x) {
        return 0;
    }

    public static void main(String[] args) {
        LC0007_ReverseInteger sol = new LC0007_ReverseInteger();
        Check.start("LC0007_ReverseInteger");
        Check.eq("321", () -> sol.reverse(123));
        Check.eq("-321", () -> sol.reverse(-123));
        Check.eq("21", () -> sol.reverse(120));
        Check.eq("0 (overflow)", () -> sol.reverse(1534236469));
        Check.summary();
    }
}
