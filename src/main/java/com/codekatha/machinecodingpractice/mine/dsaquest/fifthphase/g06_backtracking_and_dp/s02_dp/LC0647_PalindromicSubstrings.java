package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s02_dp;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #647 - Palindromic Substrings  [Difficulty: Medium | Atlassian: last seen 1 year, frequency score 0.023]
 * Link   : https://leetcode.com/problems/palindromic-substrings/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Dynamic Programming
 *
 * Given a string s, return the number of palindromic substrings in it. A string is a
 * palindrome when it reads the same backward as forward. A substring is a contiguous sequence
 * of characters within the string.
 *
 * Example 1:
 * <pre>
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 1000
 *  - s consists of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Expand around centre: 2n-1 centres (n odd-length + n-1 even-length). Har centre se jab tak s[l] == s[r] l--, r++ aur count++. O(n^2) time, O(1) space. DP table (dp[i][j]) bhi chalta hai par extra memory.
 */
public class LC0647_PalindromicSubstrings {

    // TODO: apna solution yahan likho
    public int countSubstrings(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0647_PalindromicSubstrings sol = new LC0647_PalindromicSubstrings();
        Check.start("LC0647_PalindromicSubstrings");
        Check.eq(3, () -> sol.countSubstrings("abc"));
        Check.eq(6, () -> sol.countSubstrings("aaa"));
        Check.eq(1, () -> sol.countSubstrings("a"));
        Check.eq(6, () -> sol.countSubstrings("abba"));
        Check.eq(12, () -> sol.countSubstrings("abacaba"));
        Check.eq(10, () -> sol.countSubstrings("racecar"));
        Check.eq(4, () -> sol.countSubstrings("aab"));
        Check.eq(10, () -> sol.countSubstrings("abcdcba"));
        Check.eq(21, () -> sol.countSubstrings("zzzzzz"));
        Check.eq(6, () -> sol.countSubstrings("abab"));
        Check.eq(36, () -> sol.countSubstrings("aaaaabaaaaa"));
        Check.eq(5, () -> sol.countSubstrings("abcde"));
        Check.eq(20, () -> sol.countSubstrings("aacbcaccabba"));
        Check.eq(47, () -> sol.countSubstrings("cbacccbaabbbbcaabababacbc"));
        Check.eq(77, () -> sol.countSubstrings("bacbabaabbbbcccacaacbbcacaacaaacbabcccaa"));
        Check.eq(500500, () -> sol.countSubstrings("a".repeat(1000)));   // 1000 same chars: n(n+1)/2
        Check.summary();
    }
}
