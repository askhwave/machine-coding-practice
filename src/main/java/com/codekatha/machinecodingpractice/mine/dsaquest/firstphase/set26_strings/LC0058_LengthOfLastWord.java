package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set26_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #58 - Length of Last Word  [Easy]
 * Link   : https://leetcode.com/problems/length-of-last-word/
 * Pattern: String Manipulation & Simulation
 *
 * Given a string s consisting of words and spaces, return the length of the last word in the
 * string. A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 * <pre>
 * Input: s = "Hello World"
 * Output: 5
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^4
 *  - s consists of only English letters and spaces ' '.
 *  - There will be at least one word in s.
 *
 * Hint (spoiler - pehle khud try karo): Peeche se chalo: pehle trailing spaces skip, phir letters count.
 */
public class LC0058_LengthOfLastWord {

    // TODO: apna solution yahan likho
    public int lengthOfLastWord(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0058_LengthOfLastWord sol = new LC0058_LengthOfLastWord();
        Check.start("LC0058_LengthOfLastWord");
        Check.eq("5", () -> sol.lengthOfLastWord("Hello World"));
        Check.eq("4", () -> sol.lengthOfLastWord("   fly me   to   the moon  "));
        Check.eq("6", () -> sol.lengthOfLastWord("luffy is still joyboy"));
        Check.summary();
    }
}
