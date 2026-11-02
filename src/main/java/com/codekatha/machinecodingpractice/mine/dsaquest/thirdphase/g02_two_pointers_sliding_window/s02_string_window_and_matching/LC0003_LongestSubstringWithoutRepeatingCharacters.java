package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g02_two_pointers_sliding_window.s02_string_window_and_matching;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #3 - Longest Substring Without Repeating Characters  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Group  : Two Pointers, Sliding Window & String Matching  >  String Window & Pattern Matching
 * Revision: pehle bhi aa chuka hai (firstphase/set12_sliding_window, secondphase/p03_sliding_window). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Example 1:
 * <pre>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "bbbbb"
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke". Notice that "pwke" is a subsequence and not a substring.
 * </pre>
 *
 * Constraints:
 *  - 0 <= s.length <= 5 * 10^4
 *  - s consists of English letters, digits, symbols and spaces.
 *
 * Hint (spoiler - pehle khud try karo): Variable window: duplicate aaye to left ko duplicate ke pichhle index ke aage le jao (kabhi peeche nahi).
 */
public class LC0003_LongestSubstringWithoutRepeatingCharacters {

    // TODO: apna solution yahan likho
    public int lengthOfLongestSubstring(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0003_LongestSubstringWithoutRepeatingCharacters sol = new LC0003_LongestSubstringWithoutRepeatingCharacters();
        Check.start("LC0003_LongestSubstringWithoutRepeatingCharacters");
        Check.eq("3", () -> sol.lengthOfLongestSubstring("abcabcbb"));
        Check.eq("1", () -> sol.lengthOfLongestSubstring("bbbbb"));
        Check.eq("3", () -> sol.lengthOfLongestSubstring("pwwkew"));
        Check.eq("2", () -> sol.lengthOfLongestSubstring("abba"));
        Check.summary();
    }
}
