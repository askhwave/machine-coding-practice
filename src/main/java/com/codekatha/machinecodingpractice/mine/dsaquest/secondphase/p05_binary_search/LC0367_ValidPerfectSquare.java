package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #367 - Valid Perfect Square  [Easy]
 * Link   : https://leetcode.com/problems/valid-perfect-square/
 * Pattern: Binary Search (index + answer space)
 *
 * Given a positive integer num, return true if num is a perfect square or false otherwise. A
 * perfect square is an integer that is the square of an integer. You must not use any built-in
 * library function, such as sqrt.
 *
 * Example 1:
 * <pre>
 * Input: num = 16
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: num = 14
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= num <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): #69 jaisa answer-space search; mid*mid == num check, long use karo.
 */
public class LC0367_ValidPerfectSquare {

    // TODO: apna solution yahan likho
    public boolean isPerfectSquare(int num) {
        return false;
    }

    public static void main(String[] args) {
        LC0367_ValidPerfectSquare sol = new LC0367_ValidPerfectSquare();
        Check.start("LC0367_ValidPerfectSquare");
        Check.eq("true", () -> sol.isPerfectSquare(16));
        Check.eq("false", () -> sol.isPerfectSquare(14));
        Check.eq("true", () -> sol.isPerfectSquare(2147395600));
        Check.summary();
    }
}
