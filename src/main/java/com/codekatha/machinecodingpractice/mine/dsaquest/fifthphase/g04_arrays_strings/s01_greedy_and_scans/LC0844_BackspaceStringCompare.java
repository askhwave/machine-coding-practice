package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s01_greedy_and_scans;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #844 - Backspace String Compare  [Difficulty: Easy | Atlassian: last seen 2 years, frequency score 0.041]
 * Link   : https://leetcode.com/problems/backspace-string-compare/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Greedy & Two-pass Scans
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text
 * editors. '#' means a backspace character. Note that after backspacing an empty text, the
 * text will continue empty.
 *
 * Example 1:
 * <pre>
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length, t.length <= 200
 *  - s and t only contain lowercase letters and '#' characters.
 *  - Follow up: Can you solve it in O(n) time and O(1) space?
 *
 * Hint (spoiler - pehle khud try karo): Simple: stack/StringBuilder se dono ko 'type' karo, compare. O(1) space: dono strings me peeche se chalo, '#' count (skip) rakho, valid char milne par dono ke valid chars compare karo.
 */
public class LC0844_BackspaceStringCompare {

    // TODO: apna solution yahan likho
    public boolean backspaceCompare(String s, String t) {
        return false;
    }

    public static void main(String[] args) {
        LC0844_BackspaceStringCompare sol = new LC0844_BackspaceStringCompare();
        Check.start("LC0844_BackspaceStringCompare");
        Check.eq(true, () -> sol.backspaceCompare("ab#c", "ad#c"));
        Check.eq(true, () -> sol.backspaceCompare("ab##", "c#d#"));
        Check.eq(false, () -> sol.backspaceCompare("a#c", "b"));
        Check.eq(true, () -> sol.backspaceCompare("a##c", "#a#c"));
        Check.eq(true, () -> sol.backspaceCompare("y#fo##f", "y#f#o##f"));
        Check.eq(true, () -> sol.backspaceCompare("bxj##tw", "bxo#j##tw"));
        Check.eq(true, () -> sol.backspaceCompare("nzp#o#g", "b#nzp#o#g"));
        Check.eq(true, () -> sol.backspaceCompare("#", "##"));
        Check.eq(true, () -> sol.backspaceCompare("a#", "b#"));
        Check.eq(true, () -> sol.backspaceCompare("abc", "abc"));
        Check.eq(false, () -> sol.backspaceCompare("abc", "abd"));
        Check.eq(false, () -> sol.backspaceCompare("a", "aa"));
        Check.eq(true, () -> sol.backspaceCompare("xywrrmp", "xywrrmu#p"));
        Check.eq(true, () -> sol.backspaceCompare("ab#", "a"));
        Check.eq(false, () -> sol.backspaceCompare("a#bb#a", "aba#"));
        Check.eq(false, () -> sol.backspaceCompare("b#ba#a#b", "###"));
        Check.eq(false, () -> sol.backspaceCompare("ab", "bbb##a##b#"));
        Check.eq(false, () -> sol.backspaceCompare("a", "ba"));
        Check.eq(false, () -> sol.backspaceCompare("b####", "ab#bb"));
        Check.eq(false, () -> sol.backspaceCompare("####a#aabb", "##b#ba##"));
        Check.eq(false, () -> sol.backspaceCompare("bab#", "#####"));
        Check.eq(true, () -> sol.backspaceCompare("###a#b###", "aa##a#b#b##"));
        Check.eq(true, () -> sol.backspaceCompare("#a##a###a#", "####a##"));
        Check.eq(true, () -> sol.backspaceCompare("##", "###"));
        Check.summary();
    }
}
