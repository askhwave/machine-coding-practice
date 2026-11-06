package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g05_stack_parsing.s01_stack_parsing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #394 - Decode String  [Difficulty: Medium | Atlassian: last seen 1 year, frequency score 0.032]
 * Link   : https://leetcode.com/problems/decode-string/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Stack & Parsing  >  Decode & Calculate
 *
 * Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string],
 * where the encoded_string inside the square brackets is being repeated exactly k times. Note
 * that k is guaranteed to be a positive integer. You may assume that the input string is
 * always valid; there are no extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that
 * digits are only for those repeat numbers, k. For example, there will not be input like 3a or
 * 2[4]. The test cases are generated so that the length of the output will never exceed 10^5.
 *
 * Example 1:
 * <pre>
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 30
 *  - s consists of lowercase English letters, digits, and square brackets '[]'.
 *  - s is guaranteed to be a valid input.
 *  - All the integers in s are in the range [1, 300].
 *
 * Hint (spoiler - pehle khud try karo): Stack: '[' pe (abhi tak ka string, repeat count) push karo aur naya string shuru. ']' pe pop karke: prefix + current * count. Digits ko multi-digit banao (k = k*10 + d). Recursion se bhi ho jata hai.
 */
public class LC0394_DecodeString {

    // TODO: apna solution yahan likho
    public String decodeString(String s) {
        return "";
    }

    public static void main(String[] args) {
        LC0394_DecodeString sol = new LC0394_DecodeString();
        Check.start("LC0394_DecodeString");
        Check.eq("aaabcbc", () -> sol.decodeString("3[a]2[bc]"));
        Check.eq("accaccacc", () -> sol.decodeString("3[a2[c]]"));
        Check.eq("abcabccdcdcdef", () -> sol.decodeString("2[abc]3[cd]ef"));
        Check.eq("abc", () -> sol.decodeString("abc"));
        Check.eq("aaaaaaaaaa", () -> sol.decodeString("10[a]"));
        Check.eq("abcccbcccabcccbcccd", () -> sol.decodeString("2[a2[b3[c]]]d"));
        Check.eq("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", () -> sol.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
        Check.eq("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", () -> sol.decodeString("100[leetcode]"));
        Check.eq("abbc", () -> sol.decodeString("a2[b]c"));
        Check.eq("x", () -> sol.decodeString("1[x]"));
        Check.eq("aaaaaaaaaaaaaaaa", () -> sol.decodeString("2[2[2[2[a]]]]"));
        Check.eq("abccdefgfg", () -> sol.decodeString("ab2[c]de2[fg]"));
        Check.eq("xyxyxyxyxyxyxyxyxyxyxyxy", () -> sol.decodeString("12[xy]"));
        Check.eq("aabbcc", () -> sol.decodeString("2[a]2[b]2[c]"));
        Check.summary();
    }
}
