package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set32_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #68 - Text Justification  [Hard]
 * Link   : https://leetcode.com/problems/text-justification/
 * Pattern: String Manipulation & Simulation
 *
 * Given an array of strings words and a width maxWidth, format the text such that each line
 * has exactly maxWidth characters and is fully (left and right) justified. You should pack
 * your words in a greedy approach; that is, pack as many words as you can in each line. Pad
 * extra spaces ' ' when necessary so that each line has exactly maxWidth characters. Extra
 * spaces between words should be distributed as evenly as possible. If the number of spaces on
 * a line does not divide evenly between words, the empty slots on the left will be assigned
 * more spaces than the slots on the right. For the last line of text, it should be left-
 * justified, and no extra space is inserted between words. A word is defined as a character
 * sequence consisting of non-space characters only. Each word's length is guaranteed to be
 * greater than 0 and not exceed maxWidth. The input array words contains at least one word.
 *
 * Example 1:
 * <pre>
 * Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * Output:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * Output:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * </pre>
 *
 * Constraints:
 *  - 1 <= words.length <= 300
 *  - 1 <= words[i].length <= 20
 *  - words[i] consists of only English letters and symbols.
 *  - 1 <= maxWidth <= 100
 *  - words[i].length <= maxWidth
 *
 * Hint (spoiler - pehle khud try karo): Pehle greedy line banao (kitne words fit). Phir spaces = gaps ko evenly, extra left gaps ko. Last line aur single-word line = left justify.
 */
public class LC0068_TextJustification {

    // TODO: apna solution yahan likho
    public List<String> fullJustify(String[] words, int maxWidth) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0068_TextJustification sol = new LC0068_TextJustification();
        Check.start("LC0068_TextJustification");
        Check.eq(List.of("This    is    an", "example  of text", "justification.  "),
                 () -> sol.fullJustify(new String[]{"This","is","an","example","of","text","justification."}, 16));
        Check.eq(List.of("What   must   be", "acknowledgment  ", "shall be        "),
                 () -> sol.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
        Check.summary();
    }
}
