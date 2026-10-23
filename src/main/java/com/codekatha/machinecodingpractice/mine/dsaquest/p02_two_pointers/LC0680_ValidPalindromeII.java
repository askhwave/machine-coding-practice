package com.codekatha.machinecodingpractice.mine.dsaquest.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #680 - Valid Palindrome II  [Easy]
 * Link   : https://leetcode.com/problems/valid-palindrome-ii/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given a string s, return true if the s can be palindrome after deleting at most one
 * character from it.
 *
 * Example 1:
 * <pre>
 * Input: s = "aba"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "abc"
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Pehla mismatch milne par dono options try karo: left skip ya right skip.
 */
public class LC0680_ValidPalindromeII {

    // TODO: apna solution yahan likho
    public boolean validPalindrome(String s) {
        return false;
    }

    public static void main(String[] args) {
        LC0680_ValidPalindromeII sol = new LC0680_ValidPalindromeII();
        System.out.println(sol.validPalindrome("aba"));  // true
        System.out.println(sol.validPalindrome("abca")); // true
        System.out.println(sol.validPalindrome("abc"));  // false
    }
}
