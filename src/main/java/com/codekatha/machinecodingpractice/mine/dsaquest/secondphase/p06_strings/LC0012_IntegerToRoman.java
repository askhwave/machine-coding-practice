package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #12 - Integer to Roman  [Medium]
 * Link   : https://leetcode.com/problems/integer-to-roman/
 * Pattern: String Manipulation & Simulation
 *
 * Convert an integer to a roman numeral. Symbols: I=1, V=5, X=10, L=50, C=100, D=500, M=1000.
 * Subtractive forms are used for 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM). Only
 * powers of ten (I, X, C, M) can be repeated at most 3 times in a row. Given an integer,
 * convert it to a roman numeral.
 *
 * Example 1:
 * <pre>
 * Input: num = 3749
 * Output: "MMMDCCXLIX"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: num = 58
 * Output: "LVIII"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: num = 1994
 * Output: "MCMXCIV"
 * </pre>
 *
 * Constraints:
 *  - 1 <= num <= 3999
 *
 * Hint (spoiler - pehle khud try karo): 13 values ki table (1000, 900, 500, ... 4, 1) + symbols; greedy subtract.
 */
public class LC0012_IntegerToRoman {

    // TODO: apna solution yahan likho
    public String intToRoman(int num) {
        return "";
    }

    public static void main(String[] args) {
        LC0012_IntegerToRoman sol = new LC0012_IntegerToRoman();
        System.out.println(sol.intToRoman(3749)); // MMMDCCXLIX
        System.out.println(sol.intToRoman(58));   // LVIII
        System.out.println(sol.intToRoman(1994)); // MCMXCIV
    }
}
