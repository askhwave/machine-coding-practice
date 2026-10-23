package com.codekatha.machinecodingpractice.mine.dsaquest.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

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
        System.out.println(sol.fib(2));  // 1
        System.out.println(sol.fib(3));  // 2
        System.out.println(sol.fib(4));  // 3
        System.out.println(sol.fib(30)); // 832040
    }
}
