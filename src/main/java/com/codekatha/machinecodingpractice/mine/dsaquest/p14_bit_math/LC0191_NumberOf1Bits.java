package com.codekatha.machinecodingpractice.mine.dsaquest.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #191 - Number of 1 Bits  [Easy]
 * Link   : https://leetcode.com/problems/number-of-1-bits/
 * Pattern: Bit Manipulation & Math
 *
 * Given a positive integer n, write a function that returns the number of set bits in its
 * binary representation (also known as the Hamming weight).
 *
 * Example 1:
 * <pre>
 * Input: n = 11
 * Output: 3
 * Explanation: The input binary string 1011 has a total of three set bits.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 128
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 2147483645
 * Output: 30
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 2^31 - 1
 *  - Follow-up: If this function is called many times, how would you optimize it?
 *
 * Hint (spoiler - pehle khud try karo): n & (n - 1) sabse right wala set bit hata deta hai. Kitni baar? Wahi answer (Brian Kernighan).
 */
public class LC0191_NumberOf1Bits {

    // TODO: apna solution yahan likho
    public int hammingWeight(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC0191_NumberOf1Bits sol = new LC0191_NumberOf1Bits();
        System.out.println(sol.hammingWeight(11));          // 3
        System.out.println(sol.hammingWeight(128));         // 1
        System.out.println(sol.hammingWeight(2147483645));  // 30
    }
}
