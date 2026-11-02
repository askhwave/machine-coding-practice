package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g02_two_pointers_sliding_window.s02_string_window_and_matching;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #438 - Find All Anagrams in a String  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Group  : Two Pointers, Sliding Window & String Matching  >  String Window & Pattern Matching
 *
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order. An Anagram is a word or phrase formed by rearranging
 * the letters of a different word or phrase, typically using all the original letters exactly
 * once.
 *
 * Example 1:
 * <pre>
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc". The substring with start index = 6 is "bac", which is an anagram of "abc".
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation: The substring with start index = 0 is "ab", the one at 1 is "ba", the one at 2 is "ab" - all anagrams of "ab".
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length, p.length <= 3 * 10^4
 *  - s and p consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Fixed window of size |p|: dono taraf 26-size count array; window slide karte waqt ek char add, ek remove.
 */
public class LC0438_FindAllAnagramsInAString {

    // TODO: apna solution yahan likho
    public List<Integer> findAnagrams(String s, String p) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0438_FindAllAnagramsInAString sol = new LC0438_FindAllAnagramsInAString();
        Check.start("LC0438_FindAllAnagramsInAString");
        Check.sameElements("[0, 6]", () -> sol.findAnagrams("cbaebabacd", "abc"));
        Check.sameElements("[0, 1, 2]", () -> sol.findAnagrams("abab", "ab"));
        Check.sameElements("[]", () -> sol.findAnagrams("a", "ab"));
        Check.sameElements("[1]", () -> sol.findAnagrams("baa", "aa"));
        Check.sameElements("[0, 1, 2, 3]", () -> sol.findAnagrams("abcabc", "cba"));
        Check.sameElements("[0, 1, 2, 3, 4, 5, 6, 7]", () -> sol.findAnagrams("aaaaaaaaaa", "aaa"));
        Check.sameElements("[1, 2, 3, 5]", () -> sol.findAnagrams("abacbabc", "abc"));
        Check.sameElements("[]", () -> sol.findAnagrams("af", "be"));
        Check.sameElements("[0, 2, 4, 6]", () -> sol.findAnagrams("ababababab", "aab"));
        Check.eq(29998, () -> sol.findAnagrams("a".repeat(30000), "aaa").size()); // big input: O(n * |p|) bhi chalega, O(n^2) nahi
        Check.summary();
    }
}
