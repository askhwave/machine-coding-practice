package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #435 - Non-overlapping Intervals  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/non-overlapping-intervals/
 * Pattern: Greedy & Intervals
 *
 * Given an array of intervals intervals where intervals[i] = [starti, endi], return the
 * minimum number of intervals you need to remove to make the rest of the intervals non-
 * overlapping. Note that intervals which only touch at a point are non-overlapping. For
 * example, [1, 2] and [2, 3] are non-overlapping.
 *
 * Example 1:
 * <pre>
 * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
 * Output: 1
 * Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: intervals = [[1,2],[1,2],[1,2]]
 * Output: 2
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: intervals = [[1,2],[2,3]]
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 1 <= intervals.length <= 10^5
 *  - intervals[i].length == 2
 *  - -5 * 10^4 <= starti < endi <= 5 * 10^4
 *
 * Hint (spoiler - pehle khud try karo): END time se sort (activity selection). Jo pehle khatam hota hai wahi rakho; overlap mile to count++ (remove).
 */
public class LC0435_NonOverlappingIntervals {

    // TODO: apna solution yahan likho
    public int eraseOverlapIntervals(int[][] intervals) {
        return 0;
    }

    public static void main(String[] args) {
        LC0435_NonOverlappingIntervals sol = new LC0435_NonOverlappingIntervals();
        System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}})); // 1
        System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{1,2},{1,2}}));         // 2
        System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{2,3}}));               // 0
    }
}
