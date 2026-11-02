package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g09_dynamic_programming.s01_one_dimensional;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #91 - Decode Ways  [LeetCode: Medium | Cheatsheet: Round 2 F2F | Medium]
 * Link   : https://leetcode.com/problems/decode-ways/
 * Group  : Dynamic Programming  >  1D DP
 *
 * A message containing letters from A-Z can be encoded into numbers using the following
 * mapping: 'A' -> "1", 'B' -> "2", ..., 'Z' -> "26". To decode an encoded message, all the
 * digits must be grouped then mapped back into letters using the reverse of the mapping above
 * (there may be multiple ways). For example, "11106" can be mapped into "AAJF" with the
 * grouping (1 1 10 6) or "KJF" with the grouping (11 10 6). Note that the grouping (1 11 06)
 * is invalid because "06" cannot be mapped into 'F' since "6" is different from "06". Given a
 * string s containing only digits, return the number of ways to decode it. If the entire
 * string cannot be decoded in any valid way, return 0. The test cases are generated so that
 * the answer fits in a 32-bit integer.
 *
 * Example 1:
 * <pre>
 * Input: s = "12"
 * Output: 2
 * Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "226"
 * Output: 3
 * Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "06"
 * Output: 0
 * Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 100
 *  - s contains only digits and may contain leading zero(s).
 *
 * Hint (spoiler - pehle khud try karo): dp[i] = s ke pehle i characters ke decodings. Single digit (non-zero) => += dp[i-1]; two digits 10..26 => += dp[i-2]. '0' akela kuch nahi, sirf '10'/'20' ke part ke roop me valid.
 */
public class LC0091_DecodeWays {

    // TODO: apna solution yahan likho
    public int numDecodings(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0091_DecodeWays sol = new LC0091_DecodeWays();
        Check.start("LC0091_DecodeWays");
        Check.eq(2, () -> sol.numDecodings("12"));
        Check.eq(3, () -> sol.numDecodings("226"));
        Check.eq(0, () -> sol.numDecodings("06"));
        Check.eq(0, () -> sol.numDecodings("0"));
        Check.eq(1, () -> sol.numDecodings("10"));
        Check.eq(1, () -> sol.numDecodings("27"));
        Check.eq(0, () -> sol.numDecodings("100"));
        Check.eq(1, () -> sol.numDecodings("2101"));
        Check.eq(2, () -> sol.numDecodings("11106"));
        Check.eq(1, () -> sol.numDecodings("1"));
        Check.eq(9, () -> sol.numDecodings("123123"));
        Check.eq(4, () -> sol.numDecodings("2611055971756562"));
        Check.eq(165580141, () -> sol.numDecodings("1111111111111111111111111111111111111111"));
        Check.eq(0, () -> sol.numDecodings("301"));
        Check.eq(1, () -> sol.numDecodings("110"));
        Check.eq(0, () -> sol.numDecodings("230"));
        Check.eq(1, () -> sol.numDecodings("99"));
        Check.eq(1, () -> sol.numDecodings("1020"));
        Check.eq(2, () -> sol.numDecodings("26"));
        Check.eq(1, () -> sol.numDecodings("2"));
        Check.summary();
    }
}
