package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g06_backtracking.s02_board_and_grid_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #79 - Word Search  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/word-search/
 * Group  : Backtracking  >  Board / Grid Search
 *
 * Given an m x n grid of characters board and a string word, return true if word exists in the
 * grid. The word can be constructed from letters of sequentially adjacent cells, where
 * adjacent cells are horizontally or vertically neighboring. The same letter cell may not be
 * used more than once.
 *
 * Example 1:
 * <pre>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - m == board.length
 *  - n = board[i].length
 *  - 1 <= m, n <= 6
 *  - 1 <= word.length <= 15
 *  - board and word consists of only lowercase and uppercase English letters.
 *  - Follow up: Could you use search pruning to make your solution faster with a larger board?
 *
 * Hint (spoiler - pehle khud try karo): Har cell se DFS: board[r][c] == word[k] check, cell ko temporarily mark ('#') karo, 4 directions try karo, wapas aate waqt restore karo (un-choose).
 */
public class LC0079_WordSearch {

    // TODO: apna solution yahan likho
    public boolean exist(char[][] board, String word) {
        return false;
    }

    static char[][] grid(String... rows) {
        char[][] g = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) g[i] = rows[i].toCharArray();
        return g;
    }

    public static void main(String[] args) {
        LC0079_WordSearch sol = new LC0079_WordSearch();
        Check.start("LC0079_WordSearch");
        Check.eq(true, () -> sol.exist(grid("ABCE","SFCS","ADEE"), "ABCCED"));
        Check.eq(true, () -> sol.exist(grid("ABCE","SFCS","ADEE"), "SEE"));
        Check.eq(false, () -> sol.exist(grid("ABCE","SFCS","ADEE"), "ABCB"));
        Check.eq(true, () -> sol.exist(grid("a"), "a"));
        Check.eq(false, () -> sol.exist(grid("a"), "b"));
        Check.eq(false, () -> sol.exist(grid("aa"), "aaa"));
        Check.eq(true, () -> sol.exist(grid("ab","cd"), "acdb"));
        Check.eq(false, () -> sol.exist(grid("ab","cd"), "abcd"));
        Check.eq(true, () -> sol.exist(grid("ab"), "ba"));
        Check.eq(true, () -> sol.exist(grid("ABCE","SFES","ADEE"), "ABCESEEEFS"));
        Check.eq(false, () -> sol.exist(grid("abc","def"), "abefcd"));
        Check.eq(true, () -> sol.exist(grid("CAA","AAA","BCD"), "AAB"));
        Check.eq(false, () -> sol.exist(grid("aaaaaa","aaaaaa","aaaaaa","aaaaaa","aaaaaa","aaaaaa"), "aaaaaaaaaaaaaab")); // pruning + early exit na ho to slow
        Check.summary();
    }
}
