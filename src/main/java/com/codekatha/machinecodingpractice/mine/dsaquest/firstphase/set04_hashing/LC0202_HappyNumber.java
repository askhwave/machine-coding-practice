package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set04_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #202 - Happy Number  [Easy]
 * Link   : https://leetcode.com/problems/happy-number/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Write an algorithm to determine if a number n is happy. A happy number is a number defined
 * by the following process: starting with any positive integer, replace the number by the sum
 * of the squares of its digits; repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which
 * this process ends in 1 are happy. Return true if n is a happy number, and false if not.
 * <p>
 * Example 1:
 * <pre>
 * Input: n = 19
 * Output: true
 * Explanation: 1^2 + 9^2 = 82, 8^2 + 2^2 = 68, 6^2 + 8^2 = 100, 1^2 + 0^2 + 0^2 = 1
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: n = 2
 * Output: false
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= n <= 2^31 - 1
 * <p>
 * Hint (spoiler - pehle khud try karo): Cycle detect: seen-set. (Follow-up: Floyd fast-slow, O(1) space.)
 */
public class LC0202_HappyNumber {

    // TODO: apna solution yahan likho
    public boolean isHappy(int n) {
        int fast, slow;
        slow = sumOfSquare(n);
        fast = sumOfSquare(sumOfSquare(n));
        while (true) {


            if (fast == 1 || slow == 1) {
                return true;
            }
            if (fast == slow) {
                return false;
            }
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));

        }

    }

    int sumOfSquare(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        LC0202_HappyNumber sol = new LC0202_HappyNumber();
        Check.start("LC0202_HappyNumber");
        Check.eq("true", () -> sol.isHappy(19));
        Check.eq("false", () -> sol.isHappy(2));
        Check.summary();
    }
}
