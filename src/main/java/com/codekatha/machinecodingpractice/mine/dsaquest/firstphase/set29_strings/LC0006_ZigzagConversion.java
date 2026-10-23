package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set29_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #6 - Zigzag Conversion  [Medium]
 * Link   : https://leetcode.com/problems/zigzag-conversion/
 * Pattern: String Manipulation & Simulation
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like
 * this (you may want to display this pattern in a fixed font for better legibility): P A H N /
 * A P L S I I G / Y I R. And then read line by line: "PAHNAPLSIIGYIR". Write the code that
 * will take a string and make this conversion given a number of rows.
 *
 * Example 1:
 * <pre>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "A", numRows = 1
 * Output: "A"
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 1000
 *  - s consists of English letters (lower-case and upper-case), ',' and '.'.
 *  - 1 <= numRows <= 1000
 *
 * Hint (spoiler - pehle khud try karo): Har row ka StringBuilder; row index ek direction me chale, 0 ya last par direction flip. numRows == 1 edge case.
 */
public class LC0006_ZigzagConversion {

    // TODO: apna solution yahan likho
    public String convert(String s, int numRows) {
        return "";
    }

    public static void main(String[] args) {
        LC0006_ZigzagConversion sol = new LC0006_ZigzagConversion();
        Check.start("LC0006_ZigzagConversion");
        Check.eq("PAHNAPLSIIGYIR", () -> sol.convert("PAYPALISHIRING", 3));
        Check.eq("PINALSIGYAHRPI", () -> sol.convert("PAYPALISHIRING", 4));
        Check.eq("A", () -> sol.convert("A", 1));
        Check.summary();
    }
}
