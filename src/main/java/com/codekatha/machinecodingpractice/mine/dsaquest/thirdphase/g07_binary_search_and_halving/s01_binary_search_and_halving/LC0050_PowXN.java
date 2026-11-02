package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g07_binary_search_and_halving.s01_binary_search_and_halving;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #50 - Pow(x, n)  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/powx-n/
 * Group  : Binary Search & Halving  >  Binary Search & Halving
 *
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * Example 1:
 * <pre>
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 * </pre>
 *
 * Constraints:
 *  - -100.0 < x < 100.0
 *  - -2^31 <= n <= 2^31 - 1
 *  - n is an integer.
 *  - Either x is not zero or n > 0.
 *  - -10^4 <= x^n <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Exponentiation by squaring: n even => (x*x)^(n/2); n odd => x * x^(n-1). Negative n => 1/x aur |n|. Trap: n = Integer.MIN_VALUE ka -n int me overflow karta hai - long use karo.
 */
public class LC0050_PowXN {

    // TODO: apna solution yahan likho
    public double myPow(double x, int n) {
        return 0.0;
    }

    public static void main(String[] args) {
        LC0050_PowXN sol = new LC0050_PowXN();
        Check.start("LC0050_PowXN");
        Check.eq(1024.0, () -> sol.myPow(2.0, 10)); 
        Check.eq(9.261000000000001, () -> sol.myPow(2.1, 3)); 
        Check.eq(0.25, () -> sol.myPow(2.0, -2)); 
        Check.eq(1.0, () -> sol.myPow(1.0, Integer.MIN_VALUE)); 
        Check.eq(1.0, () -> sol.myPow(-1.0, Integer.MIN_VALUE)); 
        Check.eq(-1.0, () -> sol.myPow(-1.0, Integer.MAX_VALUE)); 
        Check.eq(0.0, () -> sol.myPow(2.0, Integer.MIN_VALUE)); // n = MIN_VALUE: -n overflow ho jata hai!
        Check.eq(0.0, () -> sol.myPow(0.0, 5)); 
        Check.eq(0.0, () -> sol.myPow(0.00001, Integer.MAX_VALUE)); 
        Check.eq(-8.0, () -> sol.myPow(-2.0, 3)); 
        Check.eq(1.0, () -> sol.myPow(2.0, 0)); 
        Check.eq(2.7182682371922975, () -> sol.myPow(1.00001, 100000)); 
        Check.eq(-0.037037037037037035, () -> sol.myPow(-3.0, -3)); 
        Check.eq(0.0009765625, () -> sol.myPow(0.5, 10)); 
        Check.eq(1.239550, () -> sol.myPow(1.0000000001, Integer.MAX_VALUE)); // O(n) loop yahan bahut slow hoga - O(log n) chahiye
        Check.summary();
    }
}
