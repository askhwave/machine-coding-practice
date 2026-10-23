package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #202 - Happy Number  [Easy]
 * Link   : https://leetcode.com/problems/happy-number/
 * Pattern: Hash Map / Set / Counting
 *
 * Write an algorithm to determine if a number n is happy. A happy number is a number defined
 * by the following process: starting with any positive integer, replace the number by the sum
 * of the squares of its digits; repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which
 * this process ends in 1 are happy. Return true if n is a happy number, and false if not.
 *
 * Example 1:
 * <pre>
 * Input: n = 19
 * Output: true
 * Explanation: 1^2 + 9^2 = 82, 8^2 + 2^2 = 68, 6^2 + 8^2 = 100, 1^2 + 0^2 + 0^2 = 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 2
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): Cycle detect: seen-set. (Follow-up: Floyd fast-slow, O(1) space.)
 */
public class LC0202_HappyNumber {

    // TODO: apna solution yahan likho
    public boolean isHappy(int n) {
        return false;
    }

    public static void main(String[] args) {
        LC0202_HappyNumber sol = new LC0202_HappyNumber();
        System.out.println(sol.isHappy(19)); // true
        System.out.println(sol.isHappy(2));  // false
    }
}
