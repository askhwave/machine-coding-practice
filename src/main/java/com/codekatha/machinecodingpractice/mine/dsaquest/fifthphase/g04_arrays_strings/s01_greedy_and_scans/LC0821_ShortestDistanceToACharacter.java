package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s01_greedy_and_scans;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #821 - Shortest Distance to a Character  [Difficulty: Easy | Atlassian: last seen 2 years, frequency score 0.243]
 * Link   : https://leetcode.com/problems/shortest-distance-to-a-character/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Greedy & Two-pass Scans
 *
 * Given a string s and a character c that occurs in s, return an array of integers answer
 * where answer.length == s.length and answer[i] is the distance from index i to the closest
 * occurrence of character c in s. The distance between two indices i and j is abs(i - j),
 * where abs is the absolute value function.
 *
 * Example 1:
 * <pre>
 * Input: s = "loveleetcode", c = "e"
 * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 * Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed). The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3. For index 8 the closest 'e' is at index 6, so the distance is abs(8 - 6) = 2.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "aaab", c = "b"
 * Output: [3,2,1,0]
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^4
 *  - s[i] and c are lowercase English letters.
 *  - It is guaranteed that c occurs at least once in s.
 *
 * Hint (spoiler - pehle khud try karo): Do pass: left-to-right me 'pichhle c se doori' (c nahi mila to bahut bada number), phir right-to-left me 'agle c se doori' aur min lo. O(n), extra sort/search nahi.
 */
public class LC0821_ShortestDistanceToACharacter {

    // TODO: apna solution yahan likho
    public int[] shortestToChar(String s, char c) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0821_ShortestDistanceToACharacter sol = new LC0821_ShortestDistanceToACharacter();
        Check.start("LC0821_ShortestDistanceToACharacter");
        Check.eq("[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]", () -> sol.shortestToChar("loveleetcode", 'e'));
        Check.eq("[3, 2, 1, 0]", () -> sol.shortestToChar("aaab", 'b'));
        Check.eq("[0, 1, 2, 3]", () -> sol.shortestToChar("baaa", 'b'));
        Check.eq("[0]", () -> sol.shortestToChar("a", 'a'));
        Check.eq("[2, 1, 0, 1, 1, 0]", () -> sol.shortestToChar("abcabc", 'c'));
        Check.eq("[1, 0, 1, 1, 0, 1]", () -> sol.shortestToChar("xyzxyz", 'y'));
        Check.eq("[0, 0, 0, 0]", () -> sol.shortestToChar("eeee", 'e'));
        Check.eq("[0, 1, 0, 1, 0, 1, 0]", () -> sol.shortestToChar("abababa", 'a'));
        Check.eq("[0, 1, 2, 1, 0, 0, 0, 1, 1, 0]", () -> sol.shortestToChar("bacabbbcab", 'b'));
        Check.eq("[0, 1, 0, 0, 0, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 0, 1, 2, 1, 0, 0, 0, 1, 0]", () -> sol.shortestToChar("babbbabcaccacababaacbbbcb", 'b'));
        Check.eq("[0, 1, 0, 1, 2, 3, 2, 1, 0, 0, 0, 1, 2, 3, 2, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 2, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 3]", () -> sol.shortestToChar("bcbccaccbbbaaaacbbacbababaabbcabaacbcbabbbbaaabbacbcbcbabcac", 'b'));
        Check.summary();
    }
}
