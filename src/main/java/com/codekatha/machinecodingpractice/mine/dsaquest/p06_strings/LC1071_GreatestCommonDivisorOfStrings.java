package com.codekatha.machinecodingpractice.mine.dsaquest.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1071 - Greatest Common Divisor of Strings  [Easy]
 * Link   : https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Pattern: String Manipulation & Simulation
 *
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
 * (i.e., t is concatenated with itself one or more times). Given two strings str1 and str2,
 * return the largest string x such that x divides both str1 and str2.
 *
 * Example 1:
 * <pre>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * </pre>
 *
 * Constraints:
 *  - 1 <= str1.length, str2.length <= 1000
 *  - str1 and str2 consist of English uppercase letters.
 *
 * Hint (spoiler - pehle khud try karo): Agar str1+str2 != str2+str1 to answer "". Warna answer ki length = gcd(len1, len2).
 */
public class LC1071_GreatestCommonDivisorOfStrings {

    // TODO: apna solution yahan likho
    public String gcdOfStrings(String str1, String str2) {
        return "";
    }

    public static void main(String[] args) {
        LC1071_GreatestCommonDivisorOfStrings sol = new LC1071_GreatestCommonDivisorOfStrings();
        System.out.println(sol.gcdOfStrings("ABCABC", "ABC"));   // ABC
        System.out.println(sol.gcdOfStrings("ABABAB", "ABAB"));  // AB
        System.out.println(sol.gcdOfStrings("LEET", "CODE"));    // (empty)
    }
}
