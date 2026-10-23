package com.codekatha.machinecodingpractice.mine.dsaquest.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #2264 - Largest 3-Same-Digit Number in String  [Easy]
 * Link   : https://leetcode.com/problems/largest-3-same-digit-number-in-string/
 * Pattern: String Manipulation & Simulation
 *
 * You are given a string num representing a large integer. An integer is good if it meets the
 * following conditions: it is a substring of num with length 3, and it consists of only one
 * unique digit. Return the maximum good integer as a string or an empty string "" if no such
 * integer exists. Note that a substring is a contiguous sequence of characters within a
 * string, and there may be leading zeroes in num or a good integer.
 *
 * Example 1:
 * <pre>
 * Input: num = "6777133339"
 * Output: "777"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: num = "2300019"
 * Output: "000"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: num = "42352338"
 * Output: ""
 * </pre>
 *
 * Constraints:
 *  - 3 <= num.length <= 1000
 *  - num only consists of digits.
 *
 * Hint (spoiler - pehle khud try karo): Har 3-length window check karo; best digit char compare se track karo.
 */
public class LC2264_Largest3SameDigitNumberInString {

    // TODO: apna solution yahan likho
    public String largestGoodInteger(String num) {
        return "";
    }

    public static void main(String[] args) {
        LC2264_Largest3SameDigitNumberInString sol = new LC2264_Largest3SameDigitNumberInString();
        System.out.println(sol.largestGoodInteger("6777133339")); // 777
        System.out.println(sol.largestGoodInteger("2300019"));    // 000
        System.out.println(sol.largestGoodInteger("42352338"));   // (empty)
    }
}
