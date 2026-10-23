package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #139 - Word Break  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/word-break/
 * Pattern: Dynamic Programming
 *
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented
 * into a space-separated sequence of one or more dictionary words. Note that the same word in
 * the dictionary may be reused multiple times in the segmentation.
 *
 * Example 1:
 * <pre>
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 300
 *  - 1 <= wordDict.length <= 1000
 *  - 1 <= wordDict[i].length <= 20
 *  - s and wordDict[i] consist of only lowercase English letters.
 *  - All the strings of wordDict are unique.
 *
 * Hint (spoiler - pehle khud try karo): dp[i] = prefix s[0..i) segment ho sakta hai? dp[i] = OR over j: dp[j] && dict.contains(s[j..i)). dp[0] = true.
 */
public class LC0139_WordBreak {

    // TODO: apna solution yahan likho
    public boolean wordBreak(String s, List<String> wordDict) {
        return false;
    }

    public static void main(String[] args) {
        LC0139_WordBreak sol = new LC0139_WordBreak();
        Check.start("LC0139_WordBreak");
        Check.eq("true", () -> sol.wordBreak("leetcode", List.of("leet","code")));
        Check.eq("true", () -> sol.wordBreak("applepenapple", List.of("apple","pen")));
        Check.eq("false", () -> sol.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
        Check.summary();
    }
}
