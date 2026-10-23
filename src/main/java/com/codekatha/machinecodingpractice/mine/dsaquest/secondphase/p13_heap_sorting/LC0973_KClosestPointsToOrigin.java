package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p13_heap_sorting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #973 - K Closest Points to Origin  [Medium]
 * Link   : https://leetcode.com/problems/k-closest-points-to-origin/
 * Pattern: Heap / PriorityQueue / Top-K
 *
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and
 * an integer k, return the k closest points to the origin (0, 0). The distance between two
 * points on the X-Y plane is the Euclidean distance (i.e., sqrt(x1 - x2)^2 + (y1 - y2)^2). You
 * may return the answer in any order. The answer is guaranteed to be unique (except for the
 * order that it is in).
 *
 * Example 1:
 * <pre>
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation: The distance between (1, 3) and the origin is sqrt(10). The distance between (-2, 2) and the origin is sqrt(8). Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * </pre>
 *
 * Constraints:
 *  - 1 <= k <= points.length <= 10^4
 *  - -10^4 <= xi, yi <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): sqrt ki zaroorat nahi, x*x + y*y compare. Size-k ka MAX-heap (sabse door wala bahar).
 */
public class LC0973_KClosestPointsToOrigin {

    // TODO: apna solution yahan likho
    public int[][] kClosest(int[][] points, int k) {
        return new int[0][0];
    }

    public static void main(String[] args) {
        LC0973_KClosestPointsToOrigin sol = new LC0973_KClosestPointsToOrigin();
        Check.start("LC0973_KClosestPointsToOrigin");
        Check.sameElements("[[-2, 2]]", () -> sol.kClosest(new int[][]{{1,3},{-2,2}}, 1));
        Check.sameElements("[[3, 3], [-2, 4]]", () -> sol.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2));
        Check.summary();
    }
}
