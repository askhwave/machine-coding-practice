package com.codekatha.machinecodingpractice.mine.dsaquest.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #231 - Power of Two  [Easy]
 * Link   : https://leetcode.com/problems/power-of-two/
 * Pattern: Bit Manipulation & Math
 *
 * Given an integer n, return true if it is a power of two. Otherwise, return false. An integer
 * n is a power of two, if there exists an integer x such that n == 2^x.
 *
 * Example 1:
 * <pre>
 * Input: n = 1
 * Output: true
 * Explanation: 2^0 = 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 16
 * Output: true
 * Explanation: 2^4 = 16
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 3
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - -2^31 <= n <= 2^31 - 1
 *  - Follow-up: Could you solve it without loops/recursion?
 *
 * Hint (spoiler - pehle khud try karo): Power of two me exactly ek set bit. #191 wali trick + n > 0 check.
 */
public class LC0231_PowerOfTwo {

    // TODO: apna solution yahan likho
    public boolean isPowerOfTwo(int n) {
        return false;
    }

    public static void main(String[] args) {
        LC0231_PowerOfTwo sol = new LC0231_PowerOfTwo();
        System.out.println(sol.isPowerOfTwo(1));    // true
        System.out.println(sol.isPowerOfTwo(16));   // true
        System.out.println(sol.isPowerOfTwo(3));    // false
        System.out.println(sol.isPowerOfTwo(0));    // false
        System.out.println(sol.isPowerOfTwo(-16));  // false
    }
}
