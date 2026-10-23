package com.codekatha.machinecodingpractice.mine.dsaquest.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #28 - Find the Index of the First Occurrence in a String  [Easy]
 * Link   : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * Pattern: String Manipulation & Simulation
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * <pre>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 1 <= haystack.length, needle.length <= 10^4
 *  - haystack and needle consist of only lowercase English characters.
 *
 * Hint (spoiler - pehle khud try karo): Brute force pehle (i sirf 0..n-m tak). Phir KMP ka idea padho (interview follow-up).
 */
public class LC0028_FindTheIndexOfTheFirstOccurrenceInAString {

    // TODO: apna solution yahan likho
    public int strStr(String haystack, String needle) {
        return -1;
    }

    public static void main(String[] args) {
        LC0028_FindTheIndexOfTheFirstOccurrenceInAString sol = new LC0028_FindTheIndexOfTheFirstOccurrenceInAString();
        System.out.println(sol.strStr("sadbutsad", "sad"));  // 0
        System.out.println(sol.strStr("leetcode", "leeto")); // -1
    }
}
