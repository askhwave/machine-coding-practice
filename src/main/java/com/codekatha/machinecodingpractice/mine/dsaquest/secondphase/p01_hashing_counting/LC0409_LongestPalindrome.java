package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #409 - Longest Palindrome  [Easy]
 * Link   : https://leetcode.com/problems/longest-palindrome/
 * Pattern: Hash Map / Set / Counting
 *
 * Given a string s which consists of lowercase or uppercase letters, return the length of the
 * longest palindrome that can be built with those letters. Letters are case sensitive, for
 * example, "Aa" is not considered a palindrome.
 *
 * Example 1:
 * <pre>
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "a"
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 2000
 *  - s consists of lowercase and/or uppercase English letters only.
 *
 * Hint (spoiler - pehle khud try karo): Har char ke pairs count karo (freq/2*2); koi bhi odd freq mile to +1 center.
 */
public class LC0409_LongestPalindrome {

    // TODO: apna solution yahan likho
    public int longestPalindrome(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0409_LongestPalindrome sol = new LC0409_LongestPalindrome();
        Check.start("LC0409_LongestPalindrome");
        Check.eq("7", () -> sol.longestPalindrome("abccccdd"));
        Check.eq("1", () -> sol.longestPalindrome("a"));
        Check.summary();
    }
}
