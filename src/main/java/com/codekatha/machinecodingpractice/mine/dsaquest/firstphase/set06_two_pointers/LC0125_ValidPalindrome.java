package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set06_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #125 - Valid Palindrome  [Easy]
 * Link   : https://leetcode.com/problems/valid-palindrome/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers. Given a string s, return true if it is
 * a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * <pre>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "race a car"
 * Output: false
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: s = " "
 * Output: true
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= s.length <= 2 * 10^5
 * - s consists only of printable ASCII characters.
 * <p>
 * Hint (spoiler - pehle khud try karo): Left/right pointer, non-alphanumeric skip karo, lowercase compare.
 */
public class LC0125_ValidPalindrome {

    // TODO: apna solution yahan likho
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = str.length()-1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        LC0125_ValidPalindrome sol = new LC0125_ValidPalindrome();
        Check.start("LC0125_ValidPalindrome");
        Check.eq("true", () -> sol.isPalindrome("A man, a plan, a canal: Panama"));
        Check.eq("false", () -> sol.isPalindrome("race a car"));
        Check.eq("true", () -> sol.isPalindrome(" "));
        Check.summary();
    }
}
