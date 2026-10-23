package com.codekatha.machinecodingpractice.mine.dsaquest.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #76 - Minimum Window Substring  [Hard]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/minimum-window-substring/
 * Pattern: Sliding Window
 *
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring of s such that every character in t (including duplicates) is included in the
 * window. If there is no such substring, return the empty string "". The testcases will be
 * generated such that the answer is unique.
 *
 * Example 1:
 * <pre>
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "a", t = "a"
 * Output: "a"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "a", t = "aa"
 * Output: ""
 * </pre>
 *
 * Constraints:
 *  - m == s.length
 *  - n == t.length
 *  - 1 <= m, n <= 10^5
 *  - s and t consist of uppercase and lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): need[] counts + 'missing' counter. Missing == 0 par window valid -> left se shrink.
 */
public class LC0076_MinimumWindowSubstring {

    // TODO: apna solution yahan likho
    public String minWindow(String s, String t) {
        return "";
    }

    public static void main(String[] args) {
        LC0076_MinimumWindowSubstring sol = new LC0076_MinimumWindowSubstring();
        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC")); // BANC
        System.out.println(sol.minWindow("a", "a"));              // a
        System.out.println(sol.minWindow("a", "aa"));             // (empty)
    }
}
