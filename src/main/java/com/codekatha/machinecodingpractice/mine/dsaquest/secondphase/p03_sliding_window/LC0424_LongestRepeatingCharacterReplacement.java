package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #424 - Longest Repeating Character Replacement  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/longest-repeating-character-replacement/
 * Pattern: Sliding Window
 *
 * You are given a string s and an integer k. You can choose any character of the string and
 * change it to any other uppercase English character. You can perform this operation at most k
 * times. Return the length of the longest substring containing the same letter you can get
 * after performing the above operations.
 *
 * Example 1:
 * <pre>
 * Input: s = "ABAB", k = 2
 * Output: 4
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of only uppercase English letters.
 *  - 0 <= k <= s.length
 *
 * Hint (spoiler - pehle khud try karo): Window valid jab (len - maxFreq) <= k. maxFreq ko kabhi decrease karne ki zaroorat nahi - kyun?
 */
public class LC0424_LongestRepeatingCharacterReplacement {

    // TODO: apna solution yahan likho
    public int characterReplacement(String s, int k) {
        return 0;
    }

    public static void main(String[] args) {
        LC0424_LongestRepeatingCharacterReplacement sol = new LC0424_LongestRepeatingCharacterReplacement();
        Check.start("LC0424_LongestRepeatingCharacterReplacement");
        Check.eq("4", () -> sol.characterReplacement("ABAB", 2));
        Check.eq("4", () -> sol.characterReplacement("AABABBA", 1));
        Check.summary();
    }
}
