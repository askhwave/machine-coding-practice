package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g09_dynamic_programming.s02_two_dimensional;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #72 - Edit Distance  [LeetCode: Medium | Cheatsheet: Round 2 F2F | Hard]
 * Link   : https://leetcode.com/problems/edit-distance/
 * Group  : Dynamic Programming  >  2D DP (two strings)
 *
 * Given two strings word1 and word2, return the minimum number of operations required to
 * convert word1 to word2. You have the following three operations permitted on a word: Insert
 * a character, Delete a character, Replace a character.
 *
 * Example 1:
 * <pre>
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation: horse -> rorse (replace 'h' with 'r') -> rose (remove 'r') -> ros (remove 'e')
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation: intention -> inention (remove 't') -> enention (replace 'i' with 'e') -> exention (replace 'n' with 'x') -> exection (replace 'n' with 'c') -> execution (insert 'u')
 * </pre>
 *
 * Constraints:
 *  - 0 <= word1.length, word2.length <= 500
 *  - word1 and word2 consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): dp[i][j] = word1[0..i) ko word2[0..j) banane ka cost. Chars equal: dp[i-1][j-1]. Warna 1 + min(delete dp[i-1][j], insert dp[i][j-1], replace dp[i-1][j-1]). Base: dp[i][0] = i, dp[0][j] = j.
 */
public class LC0072_EditDistance {

    // TODO: apna solution yahan likho
    public int minDistance(String word1, String word2) {
        return 0;
    }

    public static void main(String[] args) {
        LC0072_EditDistance sol = new LC0072_EditDistance();
        Check.start("LC0072_EditDistance");
        Check.eq(3, () -> sol.minDistance("horse", "ros"));
        Check.eq(5, () -> sol.minDistance("intention", "execution"));
        Check.eq(0, () -> sol.minDistance("", ""));
        Check.eq(1, () -> sol.minDistance("a", ""));
        Check.eq(3, () -> sol.minDistance("", "abc"));
        Check.eq(0, () -> sol.minDistance("abc", "abc"));
        Check.eq(3, () -> sol.minDistance("kitten", "sitting"));
        Check.eq(3, () -> sol.minDistance("sunday", "saturday"));
        Check.eq(12, () -> sol.minDistance("pneumonoultramicroscopic", "ultramicroscopically"));
        Check.eq(3, () -> sol.minDistance("abcdef", "azced"));
        Check.eq(1, () -> sol.minDistance("a", "b"));
        Check.eq(2, () -> sol.minDistance("ab", "ba"));
        Check.eq(500, () -> sol.minDistance("a".repeat(500), "b".repeat(500)));  // pure recursion (no memo) yahan atak jayegi
        Check.summary();
    }
}
