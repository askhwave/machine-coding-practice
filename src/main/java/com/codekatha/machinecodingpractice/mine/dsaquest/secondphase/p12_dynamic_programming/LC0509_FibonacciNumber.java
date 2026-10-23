package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #509 - Fibonacci Number  [Easy]
 * Link   : https://leetcode.com/problems/fibonacci-number/
 * Pattern: Dynamic Programming
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1, F(n) = F(n - 1) + F(n - 2), for n > 1. Given n, calculate F(n).
 *
 * Example 1:
 * <pre>
 * Input: n = 2
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 3
 * Output: 2
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 4
 * Output: 3
 * </pre>
 *
 * Constraints:
 *  - 0 <= n <= 30
 *
 * Hint (spoiler - pehle khud try karo): Recursion -> memoization -> bottom-up -> O(1) space: ye 4-step DP journey yahin se seekho.
 */
public class LC0509_FibonacciNumber {

    // TODO: apna solution yahan likho
    public int fib(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC0509_FibonacciNumber sol = new LC0509_FibonacciNumber();
        Check.start("LC0509_FibonacciNumber");
        Check.eq("1", () -> sol.fib(2));
        Check.eq("2", () -> sol.fib(3));
        Check.eq("3", () -> sol.fib(4));
        Check.eq("832040", () -> sol.fib(30));
        Check.summary();
    }
}
