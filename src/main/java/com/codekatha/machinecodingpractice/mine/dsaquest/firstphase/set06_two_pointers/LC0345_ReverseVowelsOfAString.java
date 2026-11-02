package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set06_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #345 - Reverse Vowels of a String  [Easy]
 * Link   : https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <pre>
 * Given a string s, reverse only all the vowels in the string and return it. The vowels are
 * 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than
 * once.
 * </pre>
 * Example 1:
 * <pre>
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "leetcode"
 * Output: "leotcede"
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= s.length <= 3 * 10^5
 * - s consist of printable ASCII characters.
 * <p>
 * Hint (spoiler - pehle khud try karo): char[] pe kaam karo; dono taraf se vowel dhundho aur swap.
 */
public class LC0345_ReverseVowelsOfAString {

    // TODO: apna solution yahan likho
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            // i < j guard: pointers cross na ho, aur vowel-less string pe index bahar na jaye
            while (i < j && !vowels.contains(arr[i])) {
                i++;
            }
            while (i < j && !vowels.contains(arr[j])) {
                j--;
            }
            swap(arr, i, j);
            i++;
            j--;
        }

        return new String(arr);
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        LC0345_ReverseVowelsOfAString sol = new LC0345_ReverseVowelsOfAString();
        Check.start("LC0345_ReverseVowelsOfAString");
        Check.eq("AceCreIm", () -> sol.reverseVowels("IceCreAm"));
        Check.eq("leotcede", () -> sol.reverseVowels("leetcode"));
        Check.eq("bcd", () -> sol.reverseVowels("bcd"));
        Check.eq("a", () -> sol.reverseVowels("a"));
        Check.eq("Aa", () -> sol.reverseVowels("aA"));
        Check.eq("race car", () -> sol.reverseVowels("race car"));
        Check.eq("ea", () -> sol.reverseVowels("ae"));
        Check.eq("holle", () -> sol.reverseVowels("hello"));
        Check.eq("uoiea", () -> sol.reverseVowels("aeiou"));
        Check.summary();
    }
}
