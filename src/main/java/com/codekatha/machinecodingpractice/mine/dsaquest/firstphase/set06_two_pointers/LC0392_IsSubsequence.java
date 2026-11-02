package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set06_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #392 - Is Subsequence  [Easy]
 * Link   : https://leetcode.com/problems/is-subsequence/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise. A
 * subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the
 * remaining characters.
 * <p>
 * Example 1:
 * <pre>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * </pre>
 * <p>
 * Constraints:
 * - 0 <= s.length <= 100
 * - 0 <= t.length <= 10^4
 * - s and t consist only of lowercase English letters.
 * - Follow-up: if there are lots of incoming s (>= 10^9), how would you change the code?
 * <p>
 * Hint (spoiler - pehle khud try karo): i on s, j on t; match hone par hi i++. Follow-up: char -> sorted index list + binary search.
 */
public class LC0392_IsSubsequence {

    // TODO: apna solution yahan likho
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
           if(s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        LC0392_IsSubsequence sol = new LC0392_IsSubsequence();
        Check.start("LC0392_IsSubsequence");
        Check.eq("true", () -> sol.isSubsequence("abc", "ahbgdc"));
        Check.eq("false", () -> sol.isSubsequence("axc", "ahbgdc"));
        Check.summary();
    }
}
