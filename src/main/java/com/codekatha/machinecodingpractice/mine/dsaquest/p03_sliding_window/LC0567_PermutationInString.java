package com.codekatha.machinecodingpractice.mine.dsaquest.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #567 - Permutation in String  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/permutation-in-string/
 * Pattern: Sliding Window
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false
 * otherwise. In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * <pre>
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= s1.length, s2.length <= 10^4
 *  - s1 and s2 consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Fixed window of size s1.length; 26-size count arrays compare (Arrays.equals).
 */
public class LC0567_PermutationInString {

    // TODO: apna solution yahan likho
    public boolean checkInclusion(String s1, String s2) {
        return false;
    }

    public static void main(String[] args) {
        LC0567_PermutationInString sol = new LC0567_PermutationInString();
        System.out.println(sol.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(sol.checkInclusion("ab", "eidboaoo")); // false
    }
}
