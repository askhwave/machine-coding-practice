package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #290 - Word Pattern  [Easy]
 * Link   : https://leetcode.com/problems/word-pattern/
 * Pattern: Hash Map / Set / Counting
 *
 * Given a pattern and a string s, find if s follows the same pattern. Here follow means a full
 * match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 *
 * Example 1:
 * <pre>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= pattern.length <= 300
 *  - pattern contains only lower-case English letters.
 *  - 1 <= s.length <= 3000
 *  - s contains only lowercase English letters and spaces ' '.
 *  - s does not contain any leading or trailing spaces.
 *  - All the words in s are separated by a single space.
 *
 * Hint (spoiler - pehle khud try karo): #205 jaisa bijection, bas string ki jagah words. Words ke compare me equals() use karo.
 */
public class LC0290_WordPattern {

    // TODO: apna solution yahan likho
    public boolean wordPattern(String pattern, String s) {
        return false;
    }

    public static void main(String[] args) {
        LC0290_WordPattern sol = new LC0290_WordPattern();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog"));  // true
        System.out.println(sol.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(sol.wordPattern("aaaa", "dog cat cat dog")); // false
    }
}
