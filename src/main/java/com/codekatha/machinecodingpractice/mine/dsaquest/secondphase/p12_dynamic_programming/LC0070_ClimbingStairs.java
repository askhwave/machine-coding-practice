package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #70 - Climbing Stairs  [Easy]
 * Link   : https://leetcode.com/problems/climbing-stairs/
 * Pattern: Dynamic Programming
 *
 * You are climbing a staircase. It takes n steps to reach the top. Each time you can either
 * climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 * <pre>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top. 1. 1 step + 1 step 2. 2 steps
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top. 1. 1 step + 1 step + 1 step 2. 1 step + 2 steps 3. 2 steps + 1 step
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 45
 *
 * Hint (spoiler - pehle khud try karo): dp[i] = dp[i-1] + dp[i-2]. Fibonacci hi hai - kyun? Transition khud explain karo.
 */
public class LC0070_ClimbingStairs {

    // TODO: apna solution yahan likho
    public int climbStairs(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC0070_ClimbingStairs sol = new LC0070_ClimbingStairs();
        System.out.println(sol.climbStairs(2));  // 2
        System.out.println(sol.climbStairs(3));  // 3
        System.out.println(sol.climbStairs(45)); // 1836311903
    }
}
