package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #204 - Count Primes  [Medium]
 * Link   : https://leetcode.com/problems/count-primes/
 * Pattern: Bit Manipulation & Math
 *
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 *
 * Example 1:
 * <pre>
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 0
 * Output: 0
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 1
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 0 <= n <= 5 * 10^6
 *
 * Hint (spoiler - pehle khud try karo): Sieve of Eratosthenes: boolean[n]; i*i se shuru karke multiples cut karo. i*i overflow -> long ya i <= sqrt(n) loop.
 */
public class LC0204_CountPrimes {

    // TODO: apna solution yahan likho
    public int countPrimes(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC0204_CountPrimes sol = new LC0204_CountPrimes();
        Check.start("LC0204_CountPrimes");
        Check.eq("4", () -> sol.countPrimes(10));
        Check.eq("0", () -> sol.countPrimes(0));
        Check.eq("0", () -> sol.countPrimes(1));
        Check.eq("348513", () -> sol.countPrimes(5000000));
        Check.summary();
    }
}
