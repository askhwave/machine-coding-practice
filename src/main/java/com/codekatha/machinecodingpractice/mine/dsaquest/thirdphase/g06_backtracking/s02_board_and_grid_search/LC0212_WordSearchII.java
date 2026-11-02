package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s02_board_and_grid_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #212 - Word Search II  [LeetCode: Hard | Cheatsheet: Round 1 OA | Hard]
 * Link   : https://leetcode.com/problems/word-search-ii/
 * Group  : Backtracking  >  Board / Grid Search
 *
 * Given an m x n board of characters and a list of strings words, return all words on the
 * board. Each word must be constructed from letters of sequentially adjacent cells, where
 * adjacent cells are horizontally or vertically neighboring. The same letter cell may not be
 * used more than once in a word.
 *
 * Example 1:
 * <pre>
 * Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: board = [["a","b"],["c","d"]], words = ["abcb"]
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - m == board.length
 *  - n == board[i].length
 *  - 1 <= m, n <= 12
 *  - board[i][j] is a lowercase English letter.
 *  - 1 <= words.length <= 3 * 10^4
 *  - 1 <= words[i].length <= 10
 *  - words[i] consists of lowercase English letters.
 *  - All the strings of words are unique.
 *
 * Hint (spoiler - pehle khud try karo): 79 ko har word ke liye chalaoge to slow. Saare words ka Trie banao, board ka ek DFS karo jo Trie ke saath saath chale; jahan word complete ho wahan result me daalo aur node.word = null (duplicate se bacho). Pruning: dead branch ko trie se hata do.
 */
public class LC0212_WordSearchII {

    // TODO: apna solution yahan likho
    public List<String> findWords(char[][] board, String[] words) {
        return new ArrayList<>();
    }

    static char[][] grid(String... rows) {
        char[][] g = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) g[i] = rows[i].toCharArray();
        return g;
    }

    public static void main(String[] args) {
        LC0212_WordSearchII sol = new LC0212_WordSearchII();
        Check.start("LC0212_WordSearchII");
        Check.sameElements("[eat, oath]", () -> sol.findWords(grid("oaan","etae","ihkr","iflv"), new String[]{"oath","pea","eat","rain"}));
        Check.sameElements("[]", () -> sol.findWords(grid("ab","cd"), new String[]{"abcb"}));
        Check.sameElements("[a, ab, abdc, ac, bd, cd]", () -> sol.findWords(grid("ab","cd"), new String[]{"ab","ac","bd","cd","abdc","abcd","dcba","a","e"}));
        Check.sameElements("[a]", () -> sol.findWords(grid("a"), new String[]{"a"}));
        Check.sameElements("[]", () -> sol.findWords(grid("a"), new String[]{"b"}));
        Check.sameElements("[a, aa]", () -> sol.findWords(grid("aa"), new String[]{"aa","aaa","a"}));
        Check.sameElements("[abcdefg, abe]", () -> sol.findWords(grid("abc","aed","afg"), new String[]{"abcdefg","gfedcbefg","abe","afd","ace"}));
        Check.sameElements("[eat, flv, ihfl, oate, oath, oathf, oathi, oathk]", () -> sol.findWords(grid("oaan","etae","ihkr","iflv"), new String[]{"oath","oathk","oathi","oathf","oate","eat","ihfl","flv","aeki"}));
        Check.eq(10, () -> {   // 12x12 sab 'a' board: har word alag DFS se bahut slow, Trie se ek hi DFS
            String[] w = new String[15];
            for (int i = 1; i <= 10; i++) w[i - 1] = "a".repeat(i);
            for (int i = 0; i < 5; i++) w[10 + i] = "a".repeat(8) + "b" + "a".repeat(i);
            char[][] b = new char[12][12];
            for (char[] row : b) Arrays.fill(row, 'a');
            return sol.findWords(b, w).size();
        });
        Check.summary();
    }
}
