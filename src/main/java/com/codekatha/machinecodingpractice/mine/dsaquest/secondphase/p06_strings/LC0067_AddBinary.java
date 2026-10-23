package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #67 - Add Binary  [Easy]
 * Link   : https://leetcode.com/problems/add-binary/
 * Pattern: String Manipulation & Simulation
 *
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 * <pre>
 * Input: a = "11", b = "1"
 * Output: "100"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * </pre>
 *
 * Constraints:
 *  - 1 <= a.length, b.length <= 10^4
 *  - a and b consist only of '0' or '1' characters.
 *  - Each string does not contain leading zeros except for the zero itself.
 *
 * Hint (spoiler - pehle khud try karo): Peeche se carry ke saath add; StringBuilder me append karke last me reverse.
 */
public class LC0067_AddBinary {

    // TODO: apna solution yahan likho
    public String addBinary(String a, String b) {
        return "";
    }

    public static void main(String[] args) {
        LC0067_AddBinary sol = new LC0067_AddBinary();
        Check.start("LC0067_AddBinary");
        Check.eq("100", () -> sol.addBinary("11", "1"));
        Check.eq("10101", () -> sol.addBinary("1010", "1011"));
        Check.summary();
    }
}
