package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g03_heap_and_ranking.s02_sorting_intervals_ranking;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #253 - Meeting Rooms II  [Difficulty: Medium | Atlassian: last seen 2 years, frequency score 0.122]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/meeting-rooms-ii/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Heap, Sorting & Ranking  >  Sorting, Intervals & Ranking
 *
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi],
 * return the minimum number of conference rooms required.
 *
 * Example 1:
 * <pre>
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: intervals = [[7,10],[2,4]]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= intervals.length <= 10^4
 *  - 0 <= starti < endi <= 10^6
 *  - Note: ek meeting ka end == doosri ka start ho to ek hi room chalega (touching meetings overlap nahi karte).
 *
 * Hint (spoiler - pehle khud try karo): Starts aur ends ko ALAG alag sort karo. Starts pe chalo: agar start >= sabse jaldi khatam hone wale end se, wo room reuse (end pointer aage), warna naya room. Alternative: min-heap of end times.
 */
public class LC0253_MeetingRoomsII {

    // TODO: apna solution yahan likho
    public int minMeetingRooms(int[][] intervals) {
        return 0;
    }

    public static void main(String[] args) {
        LC0253_MeetingRoomsII sol = new LC0253_MeetingRoomsII();
        Check.start("LC0253_MeetingRoomsII");
        Check.eq(2, () -> sol.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
        Check.eq(1, () -> sol.minMeetingRooms(new int[][]{{7,10},{2,4}}));
        Check.eq(1, () -> sol.minMeetingRooms(new int[][]{{1,2},{2,3}}));
        Check.eq(1, () -> sol.minMeetingRooms(new int[][]{{1,5}}));
        Check.eq(3, () -> sol.minMeetingRooms(new int[][]{{1,5},{1,5},{1,5}}));
        Check.eq(4, () -> sol.minMeetingRooms(new int[][]{{0,10},{1,9},{2,8},{3,7}}));
        Check.eq(1, () -> sol.minMeetingRooms(new int[][]{{1,4},{4,5},{5,6}}));
        Check.eq(2, () -> sol.minMeetingRooms(new int[][]{{9,10},{4,9},{4,17}}));
        Check.eq(1, () -> sol.minMeetingRooms(new int[][]{{13,15},{1,13}}));
        Check.eq(2, () -> sol.minMeetingRooms(new int[][]{{1,10},{2,3},{3,4},{4,5},{5,6},{6,7}}));
        Check.eq(6, () -> sol.minMeetingRooms(new int[][]{{0,16},{3,16},{4,6},{4,8},{17,18},{4,9},{1,3},{4,12}}));
        Check.eq(10, () -> sol.minMeetingRooms(new int[][]{{17,29},{14,28},{6,25},{2,6},{0,25},{28,30},{10,17},{6,17},{12,24},{19,23},{6,30},{6,20},{18,29},{17,18},{1,28}}));
        Check.eq(14, () -> sol.minMeetingRooms(new int[][]{{11,34},{8,22},{9,34},{1,7},{47,50},{28,49},{13,27},{27,39},{12,34},{41,45},{30,32},{16,38},{18,40},{36,43},{30,41},{13,20},{49,50},{11,47},{39,48},{43,46},{5,17},{12,14},{38,44},{44,45},{42,49},{18,38},{41,45},{7,37},{12,34},{28,41}}));
        Check.eq(23, () -> sol.minMeetingRooms(new int[][]{{6,78},{91,93},{34,47},{81,85},{24,50},{42,53},{91,94},{60,64},{63,96},{35,83},{78,94},{81,100},{4,19},{62,71},{92,100},{98,99},{32,95},{97,99},{44,60},{1,14},{48,86},{36,94},{22,28},{16,32},{72,100},{78,80},{78,85},{24,63},{88,91},{70,85},{71,94},{65,99},{90,99},{51,66},{67,80},{91,99},{39,85},{59,80},{17,65},{15,82},{44,92},{24,62},{88,95},{74,99},{21,27},{85,87},{93,97},{26,45},{31,80},{39,53},{54,100},{39,74},{75,83},{99,100},{94,95},{4,65},{78,87},{33,59},{55,100},{46,60}}));
        Check.eq(2501, () -> { int[][] iv = new int[10000][]; for (int i = 0; i < 10000; i++) iv[i] = new int[]{i, i + (i % 5000) + 1}; return sol.minMeetingRooms(iv); });   // 10^4 intervals, O(n log n)
        Check.summary();
    }
}
