package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #8 - String to Integer (atoi)  [Medium]
 * Link   : https://leetcode.com/problems/string-to-integer-atoi/
 * Pattern: String Manipulation & Simulation
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 * Algorithm: (1) Whitespace: ignore any leading whitespace. (2) Signedness: determine the sign
 * by checking if the next character is '-' or '+', assuming positivity if neither is present.
 * (3) Conversion: read the integer by skipping leading zeros until a non-digit character is
 * encountered or the end of the string is reached. If no digits were read, then the result is
 * 0. (4) Rounding: if the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1],
 * then round the integer to remain in the range. Return the integer as the final result.
 *
 * Example 1:
 * <pre>
 * Input: s = "42"
 * Output: 42
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "   -042"
 * Output: -42
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "1337c0d3"
 * Output: 1337
 * </pre>
 *
 * Example 4:
 * <pre>
 * Input: s = "0-1"
 * Output: 0
 * </pre>
 *
 * Example 5:
 * <pre>
 * Input: s = "words and 987"
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 0 <= s.length <= 200
 *  - s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 *
 * Hint (spoiler - pehle khud try karo): Overflow ko digit add karne se PEHLE check karo: result > (MAX - digit)/10.
 */
public class LC0008_StringToIntegerAtoi {

    // TODO: apna solution yahan likho
    public int myAtoi(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0008_StringToIntegerAtoi sol = new LC0008_StringToIntegerAtoi();
        System.out.println(sol.myAtoi("42"));             // 42
        System.out.println(sol.myAtoi("   -042"));        // -42
        System.out.println(sol.myAtoi("1337c0d3"));       // 1337
        System.out.println(sol.myAtoi("words and 987"));   // 0
        System.out.println(sol.myAtoi("-91283472332"));    // -2147483648
    }
}
