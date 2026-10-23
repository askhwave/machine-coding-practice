package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #190 - Reverse Bits  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/reverse-bits/
 * Pattern: Bit Manipulation & Math
 *
 * Reverse bits of a given 32 bits signed integer.
 *
 * Example 1:
 * <pre>
 * Input: n = 43261596
 * Output: 964176192
 * Explanation: 43261596 (00000010100101000001111010011100) reversed is 964176192 (00111001011110000010100101000000).
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 2147483644
 * Output: 1073741822
 * </pre>
 *
 * Constraints:
 *  - 0 <= n <= 2^31 - 2
 *  - n is even.
 *  - Follow-up: If this function is called many times, how would you optimize it?
 *
 * Hint (spoiler - pehle khud try karo): 32 baar loop: result = (result << 1) | (n & 1); n >>>= 1. Unsigned shift (>>>) dhyaan se.
 */
public class LC0190_ReverseBits {

    // TODO: apna solution yahan likho
    public int reverseBits(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC0190_ReverseBits sol = new LC0190_ReverseBits();
        Check.start("LC0190_ReverseBits");
        Check.eq("964176192", () -> sol.reverseBits(43261596));
        Check.eq("1073741822", () -> sol.reverseBits(2147483644));
        Check.summary();
    }
}
