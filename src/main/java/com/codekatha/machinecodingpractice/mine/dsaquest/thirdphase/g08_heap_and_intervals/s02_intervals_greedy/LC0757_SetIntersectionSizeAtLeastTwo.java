package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g08_heap_and_intervals.s02_intervals_greedy;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #757 - Set Intersection Size At Least Two  [LeetCode: Hard | Cheatsheet: Round 1 OA | Hard]
 * Link   : https://leetcode.com/problems/set-intersection-size-at-least-two/
 * Group  : Heap & Intervals  >  Intervals (sort + greedy)
 *
 * You are given a 2D integer array intervals where intervals[i] = [starti, endi] represents
 * all the integers from starti to endi inclusively. A containing set is an array nums where
 * each interval from intervals has at least two integers in nums. For example, if intervals =
 * [[1,3], [3,7], [8,9]], then [1,2,3,4,5,6,7,8,9] and [2,3,4,8,9] are containing sets. Return
 * the minimum possible size of a containing set.
 *
 * Example 1:
 * <pre>
 * Input: intervals = [[1,3],[3,7],[8,9]]
 * Output: 5
 * Explanation: let nums = [2, 3, 4, 8, 9]. It can be shown that there cannot be any containing array of size 4.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: intervals = [[1,3],[1,4],[2,5],[3,5]]
 * Output: 3
 * Explanation: let nums = [2, 3, 4]. It can be shown that there cannot be any containing array of size 2.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: intervals = [[1,2],[2,3],[2,4],[4,5]]
 * Output: 5
 * Explanation: let nums = [1, 2, 3, 4, 5]. It can be shown that there cannot be any containing array of size 4.
 * </pre>
 *
 * Constraints:
 *  - 1 <= intervals.length <= 3000
 *  - intervals[i].length == 2
 *  - 0 <= starti < endi <= 10^8
 *
 * Hint (spoiler - pehle khud try karo): End ke hisaab se sort karo (end ascending, tie me start descending). Do sabse bade chune hue points (a < b) track karo. Naya interval: start > b => 2 naye points (e-1, e); start > a => 1 naya point (e). Greedy: points jitne right me, aage ke intervals ko utna fayda.
 */
public class LC0757_SetIntersectionSizeAtLeastTwo {

    // TODO: apna solution yahan likho
    public int intersectionSizeTwo(int[][] intervals) {
        return 0;
    }

    static int[][] disjoint(int k) {
        int[][] a = new int[k][];
        for (int i = 0; i < k; i++) a[i] = new int[]{3 * i, 3 * i + 1};
        return a;
    }

    public static void main(String[] args) {
        LC0757_SetIntersectionSizeAtLeastTwo sol = new LC0757_SetIntersectionSizeAtLeastTwo();
        Check.start("LC0757_SetIntersectionSizeAtLeastTwo");
        Check.eq(5, () -> sol.intersectionSizeTwo(new int[][]{{1,3},{3,7},{8,9}}));
        Check.eq(3, () -> sol.intersectionSizeTwo(new int[][]{{1,3},{1,4},{2,5},{3,5}}));
        Check.eq(5, () -> sol.intersectionSizeTwo(new int[][]{{1,2},{2,3},{2,4},{4,5}}));
        Check.eq(2, () -> sol.intersectionSizeTwo(new int[][]{{1,2}}));
        Check.eq(2, () -> sol.intersectionSizeTwo(new int[][]{{1,5}}));
        Check.eq(2, () -> sol.intersectionSizeTwo(new int[][]{{1,2},{1,2}}));
        Check.eq(4, () -> sol.intersectionSizeTwo(new int[][]{{0,1},{2,3}}));
        Check.eq(4, () -> sol.intersectionSizeTwo(new int[][]{{1,3},{2,4},{3,5},{4,6}}));
        Check.eq(6, () -> sol.intersectionSizeTwo(new int[][]{{1,10},{2,3},{4,5},{6,7}}));
        Check.eq(4, () -> sol.intersectionSizeTwo(new int[][]{{2,10},{3,7},{3,15},{4,11},{6,12},{6,16},{7,16},{8,16}}));
        Check.eq(2, () -> sol.intersectionSizeTwo(new int[][]{{1,4},{2,3},{2,5}}));
        Check.eq(4, () -> sol.intersectionSizeTwo(new int[][]{{0,5},{1,2},{3,4}}));
        Check.eq(6000, () -> sol.intersectionSizeTwo(disjoint(3000)));  // 3000 disjoint intervals => 2 each
        Check.summary();
    }
}
