package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set03_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #205 - Isomorphic Strings  [Easy]
 * Link   : https://leetcode.com/problems/isomorphic-strings/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given two strings s and t, determine if they are isomorphic. Two strings s and t are
 * isomorphic if the characters in s can be replaced to get t. All occurrences of a character
 * must be replaced with another character while preserving the order of characters. No two
 * characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * <pre>
 * Input: s = "egg", t = "add"
 * Output: true
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: s = "foo", t = "bar"
 * Output: false
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: s = "paper", t = "title"
 * Output: true
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= s.length <= 5 * 10^4
 * - t.length == s.length
 * - s and t consist of any valid ascii character.
 * <p>
 * Hint (spoiler - pehle khud try karo): Mapping dono direction me one-to-one honi chahiye: s->t aur t->s.
 */
public class LC0205_IsomorphicStrings {

    // TODO: apna solution yahan likho
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ss = s.charAt(i);
            Character tt = t.charAt(i);
            if (map.containsKey(ss)) {
                if (tt != map.get(ss)) return false;
            }
            if(!map.containsKey(ss)&& map.containsValue(tt)) return false;
            map.put(ss, tt);
        }
        return true;
    }

    public static void main(String[] args) {
        LC0205_IsomorphicStrings sol = new LC0205_IsomorphicStrings();
        Check.start("LC0205_IsomorphicStrings");
        Check.eq("true", () -> sol.isIsomorphic("egg", "add"));
        Check.eq("false", () -> sol.isIsomorphic("foo", "bar"));
        Check.eq("true", () -> sol.isIsomorphic("paper", "title"));
        Check.eq("false", () -> sol.isIsomorphic("badc", "baba"));
        Check.summary();
    }
}
