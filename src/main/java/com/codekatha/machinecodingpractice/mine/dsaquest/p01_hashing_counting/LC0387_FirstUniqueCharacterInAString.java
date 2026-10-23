package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #387 - First Unique Character in a String  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Pattern: Hash Map / Set / Counting
 *
 * Given a string s, find the first non-repeating character in it and return its index. If it
 * does not exist, return -1.
 *
 * Example 1:
 * <pre>
 * Input: s = "leetcode"
 * Output: 0
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "loveleetcode"
 * Output: 2
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "aabb"
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of only lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Pass 1: frequency. Pass 2: pehla index jahan freq == 1.
 */
public class LC0387_FirstUniqueCharacterInAString {

    // TODO: apna solution yahan likho
    public int firstUniqChar(String s) {
        return -1;
    }

    public static void main(String[] args) {
        LC0387_FirstUniqueCharacterInAString sol = new LC0387_FirstUniqueCharacterInAString();
        System.out.println(sol.firstUniqChar("leetcode"));     // 0
        System.out.println(sol.firstUniqChar("loveleetcode")); // 2
        System.out.println(sol.firstUniqChar("aabb"));         // -1
    }
}
