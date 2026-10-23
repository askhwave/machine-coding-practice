package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #13 - Roman to Integer  [Easy]
 * Link   : https://leetcode.com/problems/roman-to-integer/
 * Pattern: String Manipulation & Simulation
 *
 * Roman numerals are represented by seven different symbols: I=1, V=5, X=10, L=50, C=100,
 * D=500, M=1000. Roman numerals are usually written largest to smallest from left to right.
 * However, when a smaller value appears before a larger one it is subtracted (IV = 4, IX = 9,
 * XL = 40, XC = 90, CD = 400, CM = 900). Given a roman numeral, convert it to an integer.
 *
 * Example 1:
 * <pre>
 * Input: s = "III"
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V = 5, III = 3.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 15
 *  - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 *  - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *
 * Hint (spoiler - pehle khud try karo): Agar current value next se chhoti hai to minus, warna plus.
 */
public class LC0013_RomanToInteger {

    // TODO: apna solution yahan likho
    public int romanToInt(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0013_RomanToInteger sol = new LC0013_RomanToInteger();
        System.out.println(sol.romanToInt("III"));      // 3
        System.out.println(sol.romanToInt("LVIII"));    // 58
        System.out.println(sol.romanToInt("MCMXCIV"));  // 1994
    }
}
