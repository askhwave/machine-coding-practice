package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #338 - Counting Bits  [Easy]
 * Link   : https://leetcode.com/problems/counting-bits/
 * Pattern: Bit Manipulation & Math
 *
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 *
 * Example 1:
 * <pre>
 * Input: n = 2
 * Output: [0,1,1]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * </pre>
 *
 * Constraints:
 *  - 0 <= n <= 10^5
 *  - Follow-up: It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) in a single pass? Can you do it without using any built-in function?
 *
 * Hint (spoiler - pehle khud try karo): DP on bits: ans[i] = ans[i >> 1] + (i & 1). Ya ans[i] = ans[i & (i-1)] + 1.
 */
public class LC0338_CountingBits {

    // TODO: apna solution yahan likho
    public int[] countBits(int n) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0338_CountingBits sol = new LC0338_CountingBits();
        Check.start("LC0338_CountingBits");
        Check.eq("[0, 1, 1]", () -> Arrays.toString(sol.countBits(2)));
        Check.eq("[0, 1, 1, 2, 1, 2]", () -> Arrays.toString(sol.countBits(5)));
        Check.summary();
    }
}
