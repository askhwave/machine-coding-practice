package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set06_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #680 - Valid Palindrome II  [Easy]
 * Link   : https://leetcode.com/problems/valid-palindrome-ii/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given a string s, return true if the s can be palindrome after deleting at most one
 * character from it.
 * <p>
 * Example 1:
 * <pre>
 * Input: s = "aba"
 * Output: true
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: s = "abc"
 * Output: false
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of lowercase English letters.
 * <p>
 * Hint (spoiler - pehle khud try karo): Pehla mismatch milne par dono options try karo: left skip ya right skip.
 */
public class LC0680_ValidPalindromeII {

    // TODO: apna solution yahan likho
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        LC0680_ValidPalindromeII sol = new LC0680_ValidPalindromeII();
        Check.start("LC0680_ValidPalindromeII");
        Check.eq("true", () -> sol.validPalindrome("aba"));
        Check.eq("true", () -> sol.validPalindrome("abca"));
        Check.eq("false", () -> sol.validPalindrome("abc"));

        // --- extra cases ---
        // tiny strings
        Check.eq("true", () -> sol.validPalindrome("a"));
        Check.eq("true", () -> sol.validPalindrome("aa"));
        Check.eq("true", () -> sol.validPalindrome("ab"));
        Check.eq("true", () -> sol.validPalindrome("aab"));
        Check.eq("true", () -> sol.validPalindrome("abb"));
        Check.eq("false", () -> sol.validPalindrome("abcd"));
        // already a palindrome (no delete needed)
        Check.eq("true", () -> sol.validPalindrome("abcba"));
        Check.eq("true", () -> sol.validPalindrome("abccba"));
        Check.eq("true", () -> sol.validPalindrome("racecar"));
        Check.eq("true", () -> sol.validPalindrome("abcdedcba"));
        // delete exactly one char in the middle
        Check.eq("true", () -> sol.validPalindrome("abcxdcba"));
        Check.eq("true", () -> sol.validPalindrome("raceacar"));
        // must try BOTH options at first mismatch (skip left AND skip right)
        Check.eq("true", () -> sol.validPalindrome("deeee"));
        Check.eq("true", () -> sol.validPalindrome("eeeed"));
        Check.eq("true", () -> sol.validPalindrome("ebcbbececabbacecbbcbe"));
        // needs 2+ deletes -> false
        Check.eq("false", () -> sol.validPalindrome("abcxydcba"));
        Check.eq("false", () -> sol.validPalindrome("tebbem"));
        Check.eq("false", () -> sol.validPalindrome("abcdefg"));
        Check.eq("false", () -> sol.validPalindrome("abcabc"));
        // big input (n up to 10^5): must run fast
        Check.eq("true", () -> sol.validPalindrome("a".repeat(50000) + "b" + "a".repeat(49999)));
        Check.eq("false", () -> sol.validPalindrome("a".repeat(30000) + "bcd" + "a".repeat(30000)));
        Check.summary();
    }
}
