package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #345 - Reverse Vowels of a String  [Easy]
 * Link   : https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given a string s, reverse only all the vowels in the string and return it. The vowels are
 * 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than
 * once.
 *
 * Example 1:
 * <pre>
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "leetcode"
 * Output: "leotcede"
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 3 * 10^5
 *  - s consist of printable ASCII characters.
 *
 * Hint (spoiler - pehle khud try karo): char[] pe kaam karo; dono taraf se vowel dhundho aur swap.
 */
public class LC0345_ReverseVowelsOfAString {

    // TODO: apna solution yahan likho
    public String reverseVowels(String s) {
        return s;
    }

    public static void main(String[] args) {
        LC0345_ReverseVowelsOfAString sol = new LC0345_ReverseVowelsOfAString();
        System.out.println(sol.reverseVowels("IceCreAm"));  // AceCreIm
        System.out.println(sol.reverseVowels("leetcode"));  // leotcede
    }
}
