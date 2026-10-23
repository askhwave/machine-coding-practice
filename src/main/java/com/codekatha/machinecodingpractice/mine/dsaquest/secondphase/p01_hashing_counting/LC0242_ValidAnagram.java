package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #242 - Valid Anagram  [Easy]
 * Link   : https://leetcode.com/problems/valid-anagram/
 * Pattern: Hash Map / Set / Counting
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "rat", t = "car"
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length, t.length <= 5 * 10^4
 *  - s and t consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): int[26] count: s se +1, t se -1, end me sab zero?
 */
public class LC0242_ValidAnagram {

    // TODO: apna solution yahan likho
    public boolean isAnagram(String s, String t) {
        return false;
    }

    public static void main(String[] args) {
        LC0242_ValidAnagram sol = new LC0242_ValidAnagram();
        Check.start("LC0242_ValidAnagram");
        Check.eq("true", () -> sol.isAnagram("anagram", "nagaram"));
        Check.eq("false", () -> sol.isAnagram("rat", "car"));
        Check.summary();
    }
}
