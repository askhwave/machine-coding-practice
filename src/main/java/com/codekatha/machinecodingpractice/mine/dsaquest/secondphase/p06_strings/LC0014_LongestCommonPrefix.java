package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #14 - Longest Common Prefix  [Easy]
 * Link   : https://leetcode.com/problems/longest-common-prefix/
 * Pattern: String Manipulation & Simulation
 *
 * Write a function to find the longest common prefix string amongst an array of strings. If
 * there is no common prefix, return an empty string "".
 *
 * Example 1:
 * <pre>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * </pre>
 *
 * Constraints:
 *  - 1 <= strs.length <= 200
 *  - 0 <= strs[i].length <= 200
 *  - strs[i] consists of only lowercase English letters if it is non-empty.
 *
 * Hint (spoiler - pehle khud try karo): Vertical scan: column by column, kisi bhi string me mismatch / end aaye to ruko.
 */
public class LC0014_LongestCommonPrefix {

    // TODO: apna solution yahan likho
    public String longestCommonPrefix(String[] strs) {
        return "";
    }

    public static void main(String[] args) {
        LC0014_LongestCommonPrefix sol = new LC0014_LongestCommonPrefix();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // (empty)
    }
}
