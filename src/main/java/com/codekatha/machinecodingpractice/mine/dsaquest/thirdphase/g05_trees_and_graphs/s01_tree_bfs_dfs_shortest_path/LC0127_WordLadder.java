package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g05_trees_and_graphs.s01_tree_bfs_dfs_shortest_path;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #127 - Word Ladder  [LeetCode: Hard | Cheatsheet: Round 2 F2F | Medium]
 * Link   : https://leetcode.com/problems/word-ladder/
 * Group  : Trees & Graphs  >  Tree DFS, Graph BFS & Shortest Path
 *
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is
 * a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that: every adjacent pair of
 * words differs by a single letter; every si for 1 <= i <= k is in wordList (note that
 * beginWord does not need to be in wordList); sk == endWord. Given two words, beginWord and
 * endWord, and a dictionary wordList, return the number of words in the shortest
 * transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 *
 * Example 1:
 * <pre>
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 * </pre>
 *
 * Constraints:
 *  - 1 <= beginWord.length <= 10
 *  - endWord.length == beginWord.length
 *  - 1 <= wordList.length <= 5000
 *  - wordList[i].length == beginWord.length
 *  - beginWord, endWord, and wordList[i] consist of lowercase English letters.
 *  - beginWord != endWord
 *  - All the words in wordList are unique.
 *
 * Hint (spoiler - pehle khud try karo): Words = nodes, ek letter ka difference = edge; unweighted shortest path => BFS (level = answer). Neighbours: har position pe a-z try karo aur set me dekho (O(L * 26) per word), visited = set se remove.
 */
public class LC0127_WordLadder {

    // TODO: apna solution yahan likho
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return 0;
    }

    public static void main(String[] args) {
        LC0127_WordLadder sol = new LC0127_WordLadder();
        Check.start("LC0127_WordLadder");
        Check.eq(5, () -> sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log","cog")));
        Check.eq(0, () -> sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log")));
        Check.eq(2, () -> sol.ladderLength("a", "c", List.of("a","b","c")));
        Check.eq(0, () -> sol.ladderLength("hot", "dog", List.of("hot","dog")));
        Check.eq(2, () -> sol.ladderLength("hit", "hot", List.of("hot")));
        Check.eq(4, () -> sol.ladderLength("red", "tax", List.of("ted","tex","red","tax","tad","den","rex","pee")));
        Check.eq(5, () -> sol.ladderLength("qa", "sq", List.of("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye")));
        Check.eq(3, () -> sol.ladderLength("hot", "dog", List.of("hot","dog","dot")));
        Check.eq(2, () -> sol.ladderLength("lost", "cost", List.of("most","fist","lost","cost","fish")));
        Check.eq(7, () -> sol.ladderLength("game", "thee", List.of("frye","heat","tree","thee","game","free","hell","fame","faye")));
        Check.summary();
    }
}
