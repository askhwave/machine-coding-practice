package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g08_heap_and_intervals.s02_intervals_greedy;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #56 - Merge Intervals  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/merge-intervals/
 * Group  : Heap & Intervals  >  Intervals (sort + greedy)
 * Revision: pehle bhi aa chuka hai (secondphase/p11_greedy_intervals). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping
 * intervals, and return an array of the non-overlapping intervals that cover all the intervals
 * in the input.
 *
 * Example 1:
 * <pre>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * </pre>
 *
 * Constraints:
 *  - 1 <= intervals.length <= 10^4
 *  - intervals[i].length == 2
 *  - 0 <= starti <= endi <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Start se sort. Phir last merged interval se compare: start <= last.end to end = max(end), warna naya interval. #57 ka foundation.
 */
public class LC0056_MergeIntervals {

    // TODO: apna solution yahan likho
    public int[][] merge(int[][] intervals) {
        return new int[0][0];
    }

    public static void main(String[] args) {
        LC0056_MergeIntervals sol = new LC0056_MergeIntervals();
        Check.start("LC0056_MergeIntervals");
        Check.eq("[[1, 6], [8, 10], [15, 18]]", () -> Arrays.deepToString(sol.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
        Check.eq("[[1, 5]]", () -> Arrays.deepToString(sol.merge(new int[][]{{1,4},{4,5}})));
        Check.summary();
    }
}
