package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #69 - Sqrt(x)  [Easy]
 * Link   : https://leetcode.com/problems/sqrtx/
 * Pattern: Binary Search (index + answer space)
 *
 * Given a non-negative integer x, return the square root of x rounded down to the nearest
 * integer. The returned integer should be non-negative as well. You must not use any built-in
 * exponent function or operator.
 *
 * Example 1:
 * <pre>
 * Input: x = 4
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * </pre>
 *
 * Constraints:
 *  - 0 <= x <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): Answer space pe binary search: sabse bada m jahan m*m <= x. m*m ko long me lo (overflow).
 */
public class LC0069_SqrtX {

    // TODO: apna solution yahan likho
    public int mySqrt(int x) {
        return 0;
    }

    public static void main(String[] args) {
        LC0069_SqrtX sol = new LC0069_SqrtX();
        Check.start("LC0069_SqrtX");
        Check.eq("2", () -> sol.mySqrt(4));
        Check.eq("2", () -> sol.mySqrt(8));
        Check.eq("46339", () -> sol.mySqrt(2147395599));
        Check.summary();
    }
}
