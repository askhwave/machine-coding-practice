package com.codekatha.machinecodingpractice.mine.dsaquest.fourthphase.g01_coding.s02_hashing_pairs;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Atlassian reported question - Two Songs That Add Up To Seven Minutes  [Round 2 | Coding]
 * Group  : Coding  >  Hashing: Pair With Target Sum
 * Source : candidate-reported Atlassian interview questions (shared by Aman). Statement reconstructed from garbled notes -
 *           assumptions are written in the Constraints; clarify them with the interviewer like in a real round.
 *
 * We have a catalog of song titles (and their lengths) that we play at a local radio station.
 * We have been asked to play two of those songs in a row, and they must add up to exactly
 * seven minutes long. Given a list of songs and their durations, write a function that returns
 * the names of any two distinct songs that add up to exactly seven minutes. If there is no
 * such pair, return an empty collection.
 *
 * Example 1:
 * <pre>
 * songs = [("A",200s), ("B",220s), ("C",100s), ("D",50s)]
 * Output: ["A","B"]   (200 + 220 = 420 seconds = 7 minutes)
 * </pre>
 *
 * Example 2:
 * <pre>
 * songs = [("X",210s)]
 * Output: []   (a song cannot be paired with itself)
 * </pre>
 *
 * Example 3:
 * <pre>
 * songs = [("X",210s), ("Y",210s)]
 * Output: ["X","Y"]   (two different songs may have the same duration)
 * </pre>
 *
 * Constraints / assumptions:
 *  - Durations are in seconds, so the target is 7 * 60 = 420
 *  - Titles are unique; 'distinct' means two different entries in the list
 *  - Up to ~10^5 songs
 *  - Follow-ups to discuss: durations given as "mm:ss" strings; return ALL pairs; the target is a parameter
 *
 * Hint (spoiler - pehle khud try karo): Two Sum jaisa: ek pass me complement map (seconds -> title). Pehle lookup (420 - current), phir current ko map me daalo, tabhi 210 + 210 (alag songs) sahi chalega aur ek song khud ke saath pair nahi banega.
 */
public class Round2_TwoSongsSevenMinutes {

    record Song(String title, int seconds) {
    }

    // TODO: apna solution yahan likho (2 titles return karo, pair na mile to khaali list)
    public List<String> twoSongsSevenMinutes(List<Song> songs) {
        return new ArrayList<>();
    }

    // songs("A", 200, "B", 220) -> [Song(A,200), Song(B,220)]
    static List<Song> songs(Object... kv) {
        List<Song> l = new ArrayList<>();
        for (int i = 0; i < kv.length; i += 2) l.add(new Song((String) kv[i], (Integer) kv[i + 1]));
        return l;
    }

    // n songs of the same duration (+ optional extra two songs at the end)
    static List<Song> many(int n, int sec, int[] extra) {
        List<Song> l = new ArrayList<>();
        for (int i = 0; i < n; i++) l.add(new Song("s" + i, sec));
        if (extra != null) for (int e : extra) l.add(new Song("e" + e, e));
        return l;
    }

    // result: 2 alag songs, dono list me, total exactly 420 seconds
    static boolean validPair(List<Song> songs, List<String> res) {
        if (res == null || res.size() != 2 || res.get(0).equals(res.get(1))) return false;
        int sum = 0;
        for (String t : res) {
            Song f = null;
            for (Song s : songs) if (s.title().equals(t)) f = s;
            if (f == null) return false;
            sum += f.seconds();
        }
        return sum == 420;
    }

    public static void main(String[] args) {
        Round2_TwoSongsSevenMinutes sol = new Round2_TwoSongsSevenMinutes();
        Check.start("Round2_TwoSongsSevenMinutes");
        Check.eq(true, () -> validPair(songs("A", 200, "B", 220, "C", 100, "D", 50), sol.twoSongsSevenMinutes(songs("A", 200, "B", 220, "C", 100, "D", 50))));
        Check.eq(true, () -> validPair(songs("Intro", 180, "Ballad", 240, "Rock", 300), sol.twoSongsSevenMinutes(songs("Intro", 180, "Ballad", 240, "Rock", 300))));
        Check.eq(true, () -> validPair(songs("X", 210, "Y", 210), sol.twoSongsSevenMinutes(songs("X", 210, "Y", 210))));
        Check.eq(true, () -> validPair(songs("A", 419, "B", 1), sol.twoSongsSevenMinutes(songs("A", 419, "B", 1))));
        Check.eq(true, () -> validPair(songs("A", 100, "B", 320, "C", 90), sol.twoSongsSevenMinutes(songs("A", 100, "B", 320, "C", 90))));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(songs()));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(songs("X", 210)));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(songs("X", 210, "Y", 100)));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(songs("A", 419, "B", 2)));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(songs("A", 100, "B", 100, "C", 100)));
        Check.eq("[]", () -> sol.twoSongsSevenMinutes(many(60000, 500, null)));   // n^2 pairs yahan slow hongi: complement map use karo
        Check.eq(true, () -> { List<Song> l = many(60000, 500, new int[]{100, 320}); return validPair(l, sol.twoSongsSevenMinutes(l)); });
        Check.summary();
    }
}
