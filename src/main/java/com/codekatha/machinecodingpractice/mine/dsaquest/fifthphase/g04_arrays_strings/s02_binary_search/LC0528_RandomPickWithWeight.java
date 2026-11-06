package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s02_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #528 - Random Pick with Weight  [Difficulty: Medium | Atlassian: last seen 1 year, frequency score 0.015]
 * Link   : https://leetcode.com/problems/random-pick-with-weight/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Binary Search Variants
 *
 * You are given a 0-indexed array of positive integers w where w[i] describes the weight of
 * the ith index. You need to implement the function pickIndex(), which randomly picks an index
 * in the range [0, w.length - 1] (inclusive) and returns it. The probability of picking an
 * index i is w[i] / sum(w). For example, if w = [1, 3], the probability of picking index 0 is
 * 1 / (1 + 3) = 0.25 (i.e., 25%), and the probability of picking index 1 is 3 / (1 + 3) = 0.75
 * (i.e., 75%).
 *
 * Example 1:
 * <pre>
 * Input: ["Solution","pickIndex"]
 *        [[[1]],[]]
 * Output: [null,0]
 * Explanation: Only one index, so pickIndex() always returns 0.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 *        [[[1,3]],[],[],[],[],[]]
 * Output: [null,1,1,1,1,0]
 * Explanation: Random question - multiple outputs are valid. Over many calls index 1 should come about 75% of the time and index 0 about 25%.
 * </pre>
 *
 * Constraints:
 *  - 1 <= w.length <= 10^4
 *  - 1 <= w[i] <= 10^5
 *  - pickIndex will be called at most 10^4 times.
 *  - Tests yahan statistical hain (lakhon picks, bahut dheeli tolerance) - sahi solution kabhi fail nahi hona chahiye.
 *
 * Hint (spoiler - pehle khud try karo): Prefix sums banao (w = [1,3] -> [1,4]). 1..total ke beech random number lo; wo number jis pehle prefix[i] >= number me aaye wahi index (binary search - lower bound). Weight jitna bada, utni badi range.
 */
public class LC0528_RandomPickWithWeight {

    static class Solution {
        // TODO: prefix sums + Random; pickIndex me binary search

        public Solution(int[] w) {
        }

        public int pickIndex() {
            return 0;
        }
    }

    // test helper: picks baar pickIndex bulao, har index ka count; range ke bahar index mile to null
    static int[] counts(Solution s, int n, int picks) {
        int[] c = new int[n];
        for (int i = 0; i < picks; i++) {
            int idx = s.pickIndex();
            if (idx < 0 || idx >= n) return null;
            c[idx]++;
        }
        return c;
    }

    public static void main(String[] args) {
        LC0528_RandomPickWithWeight sol = new LC0528_RandomPickWithWeight();
        Check.start("LC0528_RandomPickWithWeight");
        Check.eq(true, () -> { Solution s = new Solution(new int[]{1}); for (int i = 0; i < 1000; i++) if (s.pickIndex() != 0) return false; return true; });   // ek hi index
        Check.eq(true, () -> { int[] c = counts(new Solution(new int[]{1, 3}), 2, 100000); return c != null && Math.abs(c[1] / 100000.0 - 0.75) < 0.01; });   // [1,3] -> 75% index 1
        Check.eq(true, () -> { int[] c = counts(new Solution(new int[]{1, 1, 1, 1}), 4, 100000); if (c == null) return false; for (int x : c) if (Math.abs(x / 100000.0 - 0.25) > 0.01) return false; return true; });   // barabar weights
        Check.eq(true, () -> { int[] c = counts(new Solution(new int[]{3, 14, 1, 7}), 4, 200000); double[] p = {0.12, 0.56, 0.04, 0.28}; if (c == null) return false; for (int i = 0; i < 4; i++) if (Math.abs(c[i] / 200000.0 - p[i]) > 0.01) return false; return true; });   // 3:14:1:7
        Check.eq(true, () -> { int[] c = counts(new Solution(new int[]{100000, 1}), 2, 100000); return c != null && c[1] <= 30; });   // bahut chhota weight lagbhag kabhi nahi
        Check.eq(true, () -> { int[] c = counts(new Solution(new int[]{1, 1, 1}), 3, 30000); return c != null && c[0] > 0 && c[1] > 0 && c[2] > 0; });   // har index reachable (pehla aur aakhri bhi)
        Check.eq(true, () -> { int[] w = new int[10000]; Arrays.fill(w, 1); Solution s = new Solution(w); long sum = 0; for (int i = 0; i < 100000; i++) { int idx = s.pickIndex(); if (idx < 0 || idx >= 10000) return false; sum += idx; } return Math.abs(sum / 100000.0 - 4999.5) < 150; });   // 10^4 weights, range + average
        Check.summary();
    }
}
