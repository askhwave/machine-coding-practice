package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set05_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <pre>
 * LeetCode #49 - Group Anagrams  [Medium]
 * Link   : https://leetcode.com/problems/group-anagrams/
 * Pattern: Hash Map / Set / Counting
 * </pre>
 * <pre>
 * Given an array of strings strs, group the anagrams together. You can return the answer in
 * any order.
 * </pre>
 * Example 1:
 * <pre>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: strs = [""]
 * Output: [[""]]
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: strs = ["a"]
 * Output: [["a"]]
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters.
 * <p>
 * Hint (spoiler - pehle khud try karo): Canonical key banao (sorted chars ya 26-count string) -> Map&lt;key, List>.
 */
public class LC0049_GroupAnagrams {

    // TODO: apna solution yahan likho
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] arr = new int[26];
            for (Character c : str.toCharArray()) {
                int idx = c - 'a';
                arr[idx]++;
            }

//            String key = Arrays.stream(arr).boxed().map(v -> v + "")
//                    .reduce("", (a, b) -> a + "#" + b);

            String key  = Arrays.toString(arr);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);

//            if (map.containsKey(key)) {
//                List<String> values = map.get(key);
//                values.add(str);
//            } else {
//                List<String> values = new ArrayList<>();
//                values.add(str);
//                map.put(key, new ArrayList<>(values));
//            }

        }
        List<List<String>> ans = map.entrySet().stream()
                .map((e) -> e.getValue())
                .collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        LC0049_GroupAnagrams sol = new LC0049_GroupAnagrams();
        Check.start("LC0049_GroupAnagrams");
        Check.sameElements("[[bat], [nat, tan], [ate, eat, tea]]", () -> sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        Check.sameElements("[[]]", () -> sol.groupAnagrams(new String[]{""}));
        Check.sameElements("[[a]]", () -> sol.groupAnagrams(new String[]{"a"}));
        Check.summary();
    }
}
