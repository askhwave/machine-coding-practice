package com.codekatha.machinecodingpractice.mine.dsaquest.fourthphase.g01_coding.s03_graph_chain_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Atlassian reported question - Longest Song Chain  [Round 2 | Coding]
 * Group  : Coding  >  Graph Search: Longest Chain (BFS / DFS)
 * Source : candidate-reported Atlassian interview questions (shared by Aman). Statement reconstructed from garbled notes -
 *           assumptions are written in the Constraints; clarify them with the interviewer like in a real round.
 *
 * Our local radio station is running a show where the songs are ordered in a very specific
 * way. The last word of the title of one song must match the first word of the title of the
 * next song - for example, "Silent Running" could be followed by "Running to Stand Still". No
 * song may be played more than once. Given a list of songs and a starting song, find the
 * longest chain of songs that begins with that song, and the last word of each song title
 * matches the first word of the next one. Write a function that returns the longest such
 * chain. If multiple equivalent chains exist, return any of them.
 *
 * Example 1:
 * <pre>
 * songs = ["Silent Running","Running to Stand Still","Still Waiting","Waiting for the Sun","Sun Is Shining","Shining Star","Star Wars"], start = "Silent Running"
 * Output: all 7 songs in this order
 * </pre>
 *
 * Example 2:
 * <pre>
 * songs = ["X Y","Y A","Y B","B C","C D","A Z"], start = "X Y"
 * Output: ["X Y","Y B","B C","C D"]   (length 4)
 * Explanation: greedily taking "Y A" first gives only X Y -> Y A -> A Z (length 3).
 * </pre>
 *
 * Constraints / assumptions:
 *  - Titles are unique; words are separated by spaces; word match is case-insensitive
 *  - Small input (~20 songs): the longest simple path problem is exponential in general
 *  - If the start song is not in the list, return an empty list
 *  - The chain includes the start song itself
 *
 * Hint (spoiler - pehle khud try karo): Songs = nodes, edge A -> B agar last word(A) == first word(B). Longest simple path: har path explore karni padti hai - DFS + backtracking (used[] mark/unmark) ya BFS jisme queue me poori path rakho (last level ki path = longest). Greedy (pehla match uthana) galat hai.
 */
public class Round2_LongestSongChain {

    // TODO: apna solution yahan likho (chain me start song bhi shamil hai)
    public List<String> longestChain(List<String> songs, String start) {
        return new ArrayList<>();
    }

    // chain: exactly `len` songs, start se shuru, koi repeat nahi, har link: last word == next first word
    static boolean validChain(List<String> songs, String start, List<String> chain, int len) {
        if (chain == null || chain.size() != len || !chain.get(0).equals(start)) return false;
        if (new HashSet<>(chain).size() != chain.size() || !songs.containsAll(chain)) return false;
        for (int i = 0; i + 1 < chain.size(); i++) {
            String[] a = chain.get(i).trim().split("\\s+"), b = chain.get(i + 1).trim().split("\\s+");
            if (!a[a.length - 1].equalsIgnoreCase(b[0])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Round2_LongestSongChain sol = new Round2_LongestSongChain();
        Check.start("Round2_LongestSongChain");
        Check.eq(true, () -> validChain(List.of("Silent Running","Running to Stand Still","Still Waiting","Waiting for the Sun","Sun Is Shining","Shining Star","Star Wars"), "Silent Running", sol.longestChain(List.of("Silent Running","Running to Stand Still","Still Waiting","Waiting for the Sun","Sun Is Shining","Shining Star","Star Wars"), "Silent Running"), 7));
        Check.eq(true, () -> validChain(List.of("A B","B C","B D","C E","D E","E F"), "A B", sol.longestChain(List.of("A B","B C","B D","C E","D E","E F"), "A B"), 4));
        Check.eq(true, () -> validChain(List.of("A B","B A"), "A B", sol.longestChain(List.of("A B","B A"), "A B"), 2));
        Check.eq(true, () -> validChain(List.of("X Y","Y A","Y B","B C","C D","A Z"), "X Y", sol.longestChain(List.of("X Y","Y A","Y B","B C","C D","A Z"), "X Y"), 4));
        Check.eq(true, () -> validChain(List.of("Only One","Two Three"), "Only One", sol.longestChain(List.of("Only One","Two Three"), "Only One"), 1));
        Check.eq(true, () -> validChain(List.of("hello World","world peace","Peace Train","train Home"), "hello World", sol.longestChain(List.of("hello World","world peace","Peace Train","train Home"), "hello World"), 4));
        Check.eq(true, () -> validChain(List.of("Go Home","Home Run","Run Go","Run Away","Away Home","Home Go"), "Go Home", sol.longestChain(List.of("Go Home","Home Run","Run Go","Run Away","Away Home","Home Go"), "Go Home"), 5));
        Check.eq("[]", () -> sol.longestChain(List.of("A B","B C"), "Missing Song"));   // start list me nahi
        Check.summary();
    }
}
