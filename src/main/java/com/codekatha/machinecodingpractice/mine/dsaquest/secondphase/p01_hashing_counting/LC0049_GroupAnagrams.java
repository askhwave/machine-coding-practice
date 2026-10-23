package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #49 - Group Anagrams  [Medium]
 * Link   : https://leetcode.com/problems/group-anagrams/
 * Pattern: Hash Map / Set / Counting
 *
 * Given an array of strings strs, group the anagrams together. You can return the answer in
 * any order.
 *
 * Example 1:
 * <pre>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: strs = [""]
 * Output: [[""]]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: strs = ["a"]
 * Output: [["a"]]
 * </pre>
 *
 * Constraints:
 *  - 1 <= strs.length <= 10^4
 *  - 0 <= strs[i].length <= 100
 *  - strs[i] consists of lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Canonical key banao (sorted chars ya 26-count string) -> Map&lt;key, List>.
 */
public class LC0049_GroupAnagrams {

    // TODO: apna solution yahan likho
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0049_GroupAnagrams sol = new LC0049_GroupAnagrams();
        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"})); // groups of anagrams
        System.out.println(sol.groupAnagrams(new String[]{""}));  // [[]]
        System.out.println(sol.groupAnagrams(new String[]{"a"}));  // [[a]]
    }
}
