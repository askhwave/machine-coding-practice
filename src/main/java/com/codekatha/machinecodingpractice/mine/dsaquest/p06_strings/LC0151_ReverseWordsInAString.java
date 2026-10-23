package com.codekatha.machinecodingpractice.mine.dsaquest.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #151 - Reverse Words in a String  [Medium]
 * Link   : https://leetcode.com/problems/reverse-words-in-a-string/
 * Pattern: String Manipulation & Simulation
 *
 * Given an input string s, reverse the order of the words. A word is defined as a sequence of
 * non-space characters. The words in s will be separated by at least one space. Return a
 * string of the words in reverse order concatenated by a single space. Note that s may contain
 * leading or trailing spaces or multiple spaces between two words. The returned string should
 * only have a single space separating the words. Do not include any extra spaces.
 *
 * Example 1:
 * <pre>
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "  hello world  "
 * Output: "world hello"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "a good   example"
 * Output: "example good a"
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^4
 *  - s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 *  - There is at least one word in s.
 *  - Follow-up: if the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 *
 * Hint (spoiler - pehle khud try karo): trim + split("\\s+") + reverse join. Phir bina split ke two-pointer se bhi try karo.
 */
public class LC0151_ReverseWordsInAString {

    // TODO: apna solution yahan likho
    public String reverseWords(String s) {
        return "";
    }

    public static void main(String[] args) {
        LC0151_ReverseWordsInAString sol = new LC0151_ReverseWordsInAString();
        System.out.println("[" + sol.reverseWords("the sky is blue") + "]");   // [blue is sky the]
        System.out.println("[" + sol.reverseWords("  hello world  ") + "]");  // [world hello]
        System.out.println("[" + sol.reverseWords("a good   example") + "]");  // [example good a]
    }
}
