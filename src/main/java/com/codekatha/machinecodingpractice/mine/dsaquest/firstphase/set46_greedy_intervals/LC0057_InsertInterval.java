package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set46_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #57 - Insert Interval  [Medium]
 * Link   : https://leetcode.com/problems/insert-interval/
 * Pattern: Greedy & Intervals
 *
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti,
 * endi] represent the start and the end of the ith interval and intervals is sorted in
 * ascending order by starti. You are also given an interval newInterval = [start, end] that
 * represents the start and end of another interval. Insert newInterval into intervals such
 * that intervals is still sorted in ascending order by starti and intervals still does not
 * have any overlapping intervals (merge overlapping intervals if necessary). Return intervals
 * after the insertion.
 *
 * Example 1:
 * <pre>
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * </pre>
 *
 * Constraints:
 *  - 0 <= intervals.length <= 10^4
 *  - intervals[i].length == 2
 *  - 0 <= starti <= endi <= 10^5
 *  - intervals is sorted by starti in ascending order.
 *  - newInterval.length == 2
 *  - 0 <= start <= end <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Teen phase me ek pass: (1) jo new se pehle khatam (end < new.start) copy, (2) overlapping ko merge, (3) baaki copy.
 */
public class LC0057_InsertInterval {

    // TODO: apna solution yahan likho
    public int[][] insert(int[][] intervals, int[] newInterval) {
        return new int[0][0];
    }

    public static void main(String[] args) {
        LC0057_InsertInterval sol = new LC0057_InsertInterval();
        Check.start("LC0057_InsertInterval");
        Check.eq("[[1, 5], [6, 9]]", () -> Arrays.deepToString(sol.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5})));
        Check.eq("[[1, 2], [3, 10], [12, 16]]", () -> Arrays.deepToString(sol.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
        Check.eq("[[5, 7]]", () -> Arrays.deepToString(sol.insert(new int[][]{}, new int[]{5,7})));
        Check.summary();
    }
}
