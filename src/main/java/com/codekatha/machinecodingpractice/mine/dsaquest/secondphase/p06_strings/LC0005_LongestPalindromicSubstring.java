package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #5 - Longest Palindromic Substring  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/longest-palindromic-substring/
 * Pattern: String Manipulation & Simulation
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 * <pre>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "cbbd"
 * Output: "bb"
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 1000
 *  - s consist of only digits and English letters.
 *
 * Hint (spoiler - pehle khud try karo): Expand around center: 2n-1 centers (odd + even length). O(n^2), O(1) space.
 */
public class LC0005_LongestPalindromicSubstring {

    // TODO: apna solution yahan likho
    public String longestPalindrome(String s) {
        return "";
    }

    public static void main(String[] args) {
        LC0005_LongestPalindromicSubstring sol = new LC0005_LongestPalindromicSubstring();
        System.out.println(sol.longestPalindrome("babad")); // bab or aba
        System.out.println(sol.longestPalindrome("cbbd"));  // bb
    }
}
