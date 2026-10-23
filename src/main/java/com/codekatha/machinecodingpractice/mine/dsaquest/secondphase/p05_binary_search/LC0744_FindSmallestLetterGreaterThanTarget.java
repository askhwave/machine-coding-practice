package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #744 - Find Smallest Letter Greater Than Target  [Easy]
 * Link   : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Pattern: Binary Search (index + answer space)
 *
 * You are given an array of characters letters that is sorted in non-decreasing order, and a
 * character target. There are at least two different characters in letters. Return the
 * smallest character in letters that is lexicographically greater than target. If such a
 * character does not exist, return the first character in letters.
 *
 * Example 1:
 * <pre>
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: letters = ["c","f","j"], target = "c"
 * Output: "f"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: letters = ["x","x","y","y"], target = "z"
 * Output: "x"
 * </pre>
 *
 * Constraints:
 *  - 2 <= letters.length <= 10^4
 *  - letters[i] is a lowercase English letter.
 *  - letters is sorted in non-decreasing order.
 *  - letters contains at least two different characters.
 *  - target is a lowercase English letter.
 *
 * Hint (spoiler - pehle khud try karo): 'Upper bound' (strictly greater). Na mile to wrap-around: letters[0].
 */
public class LC0744_FindSmallestLetterGreaterThanTarget {

    // TODO: apna solution yahan likho
    public char nextGreatestLetter(char[] letters, char target) {
        return ' ';
    }

    public static void main(String[] args) {
        LC0744_FindSmallestLetterGreaterThanTarget sol = new LC0744_FindSmallestLetterGreaterThanTarget();
        System.out.println(sol.nextGreatestLetter(new char[]{'c','f','j'}, 'a'));     // c
        System.out.println(sol.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));     // f
        System.out.println(sol.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z')); // x
    }
}
