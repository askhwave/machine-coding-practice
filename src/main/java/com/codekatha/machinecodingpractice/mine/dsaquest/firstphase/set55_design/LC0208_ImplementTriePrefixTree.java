package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set55_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #208 - Implement Trie (Prefix Tree)  [Medium]
 * Link   : https://leetcode.com/problems/implement-trie-prefix-tree/
 * Pattern: Design Data Structures
 *
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently
 * store and retrieve keys in a dataset of strings. There are various applications of this data
 * structure, such as autocomplete and spellchecker. Implement the Trie class: Trie()
 * initializes the trie object. void insert(String word) inserts the string word into the trie.
 * boolean search(String word) returns true if the string word is in the trie (i.e., was
 * inserted before), and false otherwise. boolean startsWith(String prefix) returns true if
 * there is a previously inserted string word that has the prefix prefix, and false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: ["Trie","insert","search","search","startsWith","insert","search"]
 *        [[],["apple"],["apple"],["app"],["app"],["app"],["app"]]
 * Output: [null,null,true,false,true,null,true]
 * </pre>
 *
 * Constraints:
 *  - 1 <= word.length, prefix.length <= 2000
 *  - word and prefix consist only of lowercase English letters.
 *  - At most 3 * 10^4 calls in total will be made to insert, search, and startsWith.
 *
 * Hint (spoiler - pehle khud try karo): TrieNode { TrieNode[26] children; boolean isEnd; }. search aur startsWith me bas fark: end par isEnd check.
 */
public class LC0208_ImplementTriePrefixTree {

    static class Trie {
        // TODO: TrieNode class + root

        public Trie() {
        }

        public void insert(String word) {
        }

        public boolean search(String word) {
            return false;
        }

        public boolean startsWith(String prefix) {
            return false;
        }
    }

    public static void main(String[] args) {
        LC0208_ImplementTriePrefixTree sol = new LC0208_ImplementTriePrefixTree();
        Check.start("LC0208_ImplementTriePrefixTree");
        Trie t = new Trie();
        t.insert("apple");
        Check.eq("true", () -> t.search("apple"));
        Check.eq("false", () -> t.search("app"));
        Check.eq("true", () -> t.startsWith("app"));
        t.insert("app");
        Check.eq("true", () -> t.search("app"));
        Check.summary();
    }
}
