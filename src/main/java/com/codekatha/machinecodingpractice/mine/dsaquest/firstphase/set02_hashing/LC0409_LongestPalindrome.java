package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set02_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #409 - Longest Palindrome  [Easy]
 * Link   : https://leetcode.com/problems/longest-palindrome/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given a string s which consists of lowercase or uppercase letters, return the length of the
 * longest palindrome that can be built with those letters. Letters are case sensitive, for
 * example, "Aa" is not considered a palindrome.
 * <p>
 * Example 1:
 * <pre>
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "a"
 * Output: 1
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= s.length <= 2000
 * - s consists of lowercase and/or uppercase English letters only.
 * <p>
 * Hint (spoiler - pehle khud try karo): Har char ke pairs count karo (freq/2*2); koi bhi odd freq mile to +1 center.
 */
public class LC0409_LongestPalindrome {

    // TODO: apna solution yahan likho
    public int longestPalindrome(String s) {
        if (s.isBlank()) return 0;

        Map<Character, Integer> freqData = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            freqData.put(ch,
                    freqData.getOrDefault(ch, 0) + 1);
        }

        int result = 0;
        boolean gotOdd = false;
        for (var e : freqData.entrySet()) {
            Integer count = e.getValue();
            if (count % 2 == 0) {
                result += count;
            } else {
                int remender = count % 2;
                int pair = count - remender;
                result += pair;
                gotOdd = true;
            }
        }

//        2nd for loop me ye bhi kar sakte the:
//        result += (count / 2) * 2;
//
//        if (count % 2 != 0)
//            gotOdd = true;

        return gotOdd ? ++result : result;
    }

    public static void main(String[] args) {
        LC0409_LongestPalindrome sol = new LC0409_LongestPalindrome();
        Check.start("LC0409_LongestPalindrome");
        Check.eq("7", () -> sol.longestPalindrome("abccccdd"));
        Check.eq("1", () -> sol.longestPalindrome("a"));
        Check.eq("3", () -> sol.longestPalindrome("ccc"));
        Check.eq("5", () -> sol.longestPalindrome("aaabb"));
        Check.summary();
    }
}
