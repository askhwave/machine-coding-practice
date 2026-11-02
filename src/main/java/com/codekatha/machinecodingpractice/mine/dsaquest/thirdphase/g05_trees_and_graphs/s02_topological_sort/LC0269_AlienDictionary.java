package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g05_trees_and_graphs.s02_topological_sort;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #269 - Alien Dictionary  [LeetCode: Hard | Cheatsheet: Round 2 F2F | Hard]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/alien-dictionary/
 * Group  : Trees & Graphs  >  Topological Sort (Kahn / DFS)
 *
 * There is a new alien language that uses the English alphabet. However, the order of the
 * letters is unknown to you. You are given a list of strings words from the alien language's
 * dictionary, where the strings in words are sorted lexicographically by the rules of this new
 * language. If this claim is incorrect, and the given arrangement of string in words cannot
 * correspond to any order of letters, return "". Otherwise, return a string of the unique
 * letters in the new alien language sorted in lexicographically increasing order by the new
 * language's rules. If there are multiple solutions, return any of them.
 *
 * Example 1:
 * <pre>
 * Input: words = ["wrt","wrf","er","ett","rftt"]
 * Output: "wertf"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: words = ["z","x"]
 * Output: "zx"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: words = ["z","x","z"]
 * Output: ""
 * Explanation: The order is invalid, so return "".
 * </pre>
 *
 * Constraints:
 *  - 1 <= words.length <= 100
 *  - 1 <= words[i].length <= 100
 *  - words[i] consists of only lowercase English letters.
 *
 * Hint (spoiler - pehle khud try karo): Adjacent words ke pehle differing character se edge (x -> y). Saare letters ko nodes maano, Kahn's topological sort. Order poora na bane (cycle) ya prefix case ("abc" ke baad "ab") => "". Trap: jo letters kisi edge me nahi, wo bhi answer me aane chahiye.
 */
public class LC0269_AlienDictionary {

    // TODO: apna solution yahan likho
    public String alienOrder(String[] words) {
        return "";
    }

    // order me sab letters ek-ek baar hon aur words us order me sorted hon
    static boolean validOrder(String[] words, String order) {
        Set<Character> letters = new HashSet<>();
        for (String w : words) for (char c : w.toCharArray()) letters.add(c);
        if (order == null || order.length() != letters.size()) return false;
        int[] rank = new int[128];
        Arrays.fill(rank, -1);
        for (int i = 0; i < order.length(); i++) {
            if (!letters.contains(order.charAt(i)) || rank[order.charAt(i)] != -1) return false;
            rank[order.charAt(i)] = i;
        }
        for (int i = 0; i + 1 < words.length; i++) {
            String a = words[i], b = words[i + 1];
            int j = 0;
            while (j < a.length() && j < b.length() && a.charAt(j) == b.charAt(j)) j++;
            if (j == Math.min(a.length(), b.length())) { if (a.length() > b.length()) return false; continue; }
            if (rank[a.charAt(j)] > rank[b.charAt(j)]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LC0269_AlienDictionary sol = new LC0269_AlienDictionary();
        Check.start("LC0269_AlienDictionary");
        Check.eq("wertf", () -> sol.alienOrder(new String[]{"wrt","wrf","er","ett","rftt"}));
        Check.eq("zx", () -> sol.alienOrder(new String[]{"z","x"}));
        Check.eq("z", () -> sol.alienOrder(new String[]{"z","z"}));
        Check.eq("abc", () -> sol.alienOrder(new String[]{"a","b","c"}));
        Check.eq("bac", () -> sol.alienOrder(new String[]{"ba","bc","ac","cab"}));
        Check.eq("xyz", () -> sol.alienOrder(new String[]{"xy","xz","yz"}));
        Check.eq(true, () -> validOrder(new String[]{"ab","adc"}, sol.alienOrder(new String[]{"ab","adc"}))); // order unique nahi - koi bhi valid chalega
        Check.eq(true, () -> validOrder(new String[]{"abc"}, sol.alienOrder(new String[]{"abc"}))); // order unique nahi - koi bhi valid chalega
        Check.eq(true, () -> validOrder(new String[]{"wrt","wrf","er","ett","rftt","kk"}, sol.alienOrder(new String[]{"wrt","wrf","er","ett","rftt","kk"}))); // order unique nahi - koi bhi valid chalega
        Check.eq(true, () -> validOrder(new String[]{"z","zx","zxy","q"}, sol.alienOrder(new String[]{"z","zx","zxy","q"}))); // order unique nahi - koi bhi valid chalega
        Check.eq("", () -> sol.alienOrder(new String[]{"z","x","z"})); // invalid input
        Check.eq("", () -> sol.alienOrder(new String[]{"abc","ab"})); // invalid input
        Check.eq("", () -> sol.alienOrder(new String[]{"ab","ba","ab"})); // invalid input
        Check.eq("", () -> sol.alienOrder(new String[]{"a","b","c","a"})); // invalid input
        Check.summary();
    }
}
