package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #1768 - Merge Strings Alternately  [Easy]
 * Link   : https://leetcode.com/problems/merge-strings-alternately/
 * Pattern: String Manipulation & Simulation
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters in
 * alternating order, starting with word1. If a string is longer than the other, append the
 * additional letters onto the end of the merged string. Return the merged string.
 *
 * Example 1:
 * <pre>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * </pre>
 *
 * Constraints:
 *  - 1 <= word1.length, word2.length <= 100
 *  - word1 and word2 consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): StringBuilder + do index; jo bacha use append.
 */
public class LC1768_MergeStringsAlternately {

    // TODO: apna solution yahan likho
    public String mergeAlternately(String word1, String word2) {
        return "";
    }

    public static void main(String[] args) {
        LC1768_MergeStringsAlternately sol = new LC1768_MergeStringsAlternately();
        Check.start("LC1768_MergeStringsAlternately");
        Check.eq("apbqcr", () -> sol.mergeAlternately("abc", "pqr"));
        Check.eq("apbqrs", () -> sol.mergeAlternately("ab", "pqrs"));
        Check.eq("apbqcd", () -> sol.mergeAlternately("abcd", "pq"));
        Check.summary();
    }
}
