package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1903 - Largest Odd Number in String  [Easy]
 * Link   : https://leetcode.com/problems/largest-odd-number-in-string/
 * Pattern: String Manipulation & Simulation
 *
 * You are given a string num, representing a large integer. Return the largest-valued odd
 * integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd
 * integer exists. A substring is a contiguous sequence of characters within a string.
 *
 * Example 1:
 * <pre>
 * Input: num = "52"
 * Output: "5"
 * Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: num = "4206"
 * Output: ""
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: num = "35427"
 * Output: "35427"
 * </pre>
 *
 * Constraints:
 *  - 1 <= num.length <= 10^5
 *  - num only consists of digits and does not contain any leading zeros.
 *
 * Hint (spoiler - pehle khud try karo): Number odd tabhi hoga jab last digit odd. Sabse bada = jitna lamba prefix, to peeche se pehla odd digit dhundo.
 */
public class LC1903_LargestOddNumberInString {

    // TODO: apna solution yahan likho
    public String largestOddNumber(String num) {
        return "";
    }

    public static void main(String[] args) {
        LC1903_LargestOddNumberInString sol = new LC1903_LargestOddNumberInString();
        System.out.println(sol.largestOddNumber("52"));    // 5
        System.out.println(sol.largestOddNumber("4206"));  // (empty)
        System.out.println(sol.largestOddNumber("35427")); // 35427
    }
}
