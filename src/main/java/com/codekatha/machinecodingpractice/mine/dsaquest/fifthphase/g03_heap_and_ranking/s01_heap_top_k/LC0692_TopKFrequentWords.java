package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g03_heap_and_ranking.s01_heap_top_k;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #692 - Top K Frequent Words  [Difficulty: Medium | Atlassian: last seen 2 years, frequency score 0.008]
 * Link   : https://leetcode.com/problems/top-k-frequent-words/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Heap, Sorting & Ranking  >  Heap - Top K & Streaming Median
 *
 * Given an array of strings words and an integer k, return the k most frequent strings. Return
 * the answer sorted by the frequency from highest to lowest. Sort the words with the same
 * frequency by their lexicographical order.
 *
 * Example 1:
 * <pre>
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"]
 * Explanation: "i" and "love" are the two most frequent words. Note that "i" comes before "love" due to a lower alphabetical order.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
 * Output: ["the","is","sunny","day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 * </pre>
 *
 * Constraints:
 *  - 1 <= words.length <= 500
 *  - 1 <= words[i].length <= 10
 *  - words[i] consists of lowercase English letters.
 *  - k is in the range [1, The number of unique words[i]]
 *  - Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space?
 *
 * Hint (spoiler - pehle khud try karo): HashMap se count. Phir ya to sort (freq desc, word asc) ya size-k min-heap: heap me 'weak' element = kam freq, aur tie me lexicographically BADA word (wahi pehle nikalna hai). Poll karke list ko reverse karo.
 */
public class LC0692_TopKFrequentWords {

    // TODO: apna solution yahan likho
    public List<String> topKFrequent(String[] words, int k) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0692_TopKFrequentWords sol = new LC0692_TopKFrequentWords();
        Check.start("LC0692_TopKFrequentWords");
        Check.eq("[i, love]", () -> sol.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));
        Check.eq("[the, is, sunny, day]", () -> sol.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
        Check.eq("[a]", () -> sol.topKFrequent(new String[]{"a"}, 1));
        Check.eq("[a, b, c]", () -> sol.topKFrequent(new String[]{"b","a","c"}, 3));
        Check.eq("[a]", () -> sol.topKFrequent(new String[]{"b","a","c"}, 1));
        Check.eq("[x, y]", () -> sol.topKFrequent(new String[]{"x","y","x","y","z","z"}, 2));
        Check.eq("[a, aa]", () -> sol.topKFrequent(new String[]{"aaa","aa","a"}, 2));
        Check.eq("[i, love, coding]", () -> sol.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 3));
        Check.eq("[z, a]", () -> sol.topKFrequent(new String[]{"z","z","z","a","a","b"}, 2));
        Check.eq("[abc, ba, e]", () -> sol.topKFrequent(new String[]{"i","g","ba","e","f","e","c","ba","abc","abc","i","ab"}, 3));
        Check.eq("[g, a, ab, abc, ba]", () -> sol.topKFrequent(new String[]{"e","b","a","d","g","abc","g","e","i","ba","f","ab","ab","abc","g","c","i","a","c","ba"}, 5));
        Check.eq("[f, i, ab, ba, a, abc]", () -> sol.topKFrequent(new String[]{"d","c","abc","i","i","ba","ab","d","f","i","b","abc","ab","b","e","g","b","i","h","ab","j","c","ab","ba","g","i","f","a","g","f","j","a","ba","abc","f","a","h","f","j","ba"}, 6));
        Check.eq("[e, a, f, i, abc, d, j, b]", () -> sol.topKFrequent(new String[]{"a","g","d","b","i","d","d","i","f","a","e","b","ba","e","d","abc","j","i","i","i","c","e","ab","e","f","f","c","f","b","j","j","ba","e","f","a","a","ba","f","a","h","abc","e","h","ab","a","abc","d","e","e","b","abc","abc","h","a","j","j","i","ab","c","g"}, 8));
        Check.summary();
    }
}
