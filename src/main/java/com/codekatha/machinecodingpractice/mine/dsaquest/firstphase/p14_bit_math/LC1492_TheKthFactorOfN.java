package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1492 - The kth Factor of n  [Medium]
 * Link   : https://leetcode.com/problems/the-kth-factor-of-n/
 * Pattern: Bit Manipulation & Math
 *
 * You are given two positive integers n and k. A factor of an integer n is defined as an
 * integer i where n % i == 0. Consider a list of all factors of n sorted in ascending order,
 * return the kth factor in this list or return -1 if n has less than k factors.
 *
 * Example 1:
 * <pre>
 * Input: n = 12, k = 3
 * Output: 3
 * Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 7, k = 2
 * Output: 7
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 4, k = 4
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 1 <= k <= n <= 1000
 *  - Follow-up: Could you solve this problem in less than O(n) complexity?
 *
 * Hint (spoiler - pehle khud try karo): O(n) seedha. Follow-up O(sqrt n): i aur n/i ke pair me factors aate hain - chhote wale ascending, bade wale descending.
 */
public class LC1492_TheKthFactorOfN {

    // TODO: apna solution yahan likho
    public int kthFactor(int n, int k) {
        return -1;
    }

    public static void main(String[] args) {
        LC1492_TheKthFactorOfN sol = new LC1492_TheKthFactorOfN();
        System.out.println(sol.kthFactor(12, 3));  // 3
        System.out.println(sol.kthFactor(7, 2));   // 7
        System.out.println(sol.kthFactor(4, 4));   // -1
    }
}
