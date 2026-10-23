package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set02_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1160 - Find Words That Can Be Formed by Characters  [Easy]
 * Link   : https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * Pattern: Hash Map / Set / Counting
 *
 * You are given an array of strings words and a string chars. A string is good if it can be
 * formed by characters from chars (each character can only be used once). Return the sum of
 * lengths of all good strings in words.
 *
 * Example 1:
 * <pre>
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: "cat" and "hat" can be formed, 3 + 3 = 6.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * </pre>
 *
 * Constraints:
 *  - 1 <= words.length <= 1000
 *  - 1 <= words[i].length, chars.length <= 100
 *  - words[i] and chars consist of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): chars ka freq array ek baar; har word ke liye uska freq <= chars freq check.
 */
public class LC1160_FindWordsThatCanBeFormedByCharacters {

    // TODO: apna solution yahan likho
    public int countCharacters(String[] words, String chars) {
        return 0;
    }

    public static void main(String[] args) {
        LC1160_FindWordsThatCanBeFormedByCharacters sol = new LC1160_FindWordsThatCanBeFormedByCharacters();
        Check.start("LC1160_FindWordsThatCanBeFormedByCharacters");
        Check.eq("6", () -> sol.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        Check.eq("10", () -> sol.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
        Check.summary();
    }
}
