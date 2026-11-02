package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g05_trees_and_graphs.s01_tree_bfs_dfs_shortest_path;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1334 - Find the City With the Smallest Number of Neighbors at a Threshold Distance  [LeetCode: Medium | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
 * Group  : Trees & Graphs  >  Tree DFS, Graph BFS & Shortest Path
 *
 * There are n cities numbered from 0 to n-1. Given the array edges where edges[i] = [fromi,
 * toi, weighti] represents a bidirectional and weighted edge between cities fromi and toi, and
 * given the integer distanceThreshold. Return the city with the smallest number of cities that
 * are reachable through some path and whose distance is at most distanceThreshold. If there
 * are multiple such cities, return the city with the greatest number. Notice that the distance
 * of a path connecting cities i and j is equal to the sum of the edges' weights along that
 * path.
 *
 * Example 1:
 * <pre>
 * Input: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
 * Output: 3
 * Explanation: City 0 -> [City 1, City 2], City 1 -> [City 0, City 2, City 3], City 2 -> [City 0, City 1, City 3], City 3 -> [City 1, City 2]. Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
 * Output: 0
 * Explanation: City 0 has 1 neighbor (city 1); cities 1..4 have 2 or 3.
 * </pre>
 *
 * Constraints:
 *  - 2 <= n <= 100
 *  - 1 <= edges.length <= n * (n - 1) / 2
 *  - edges[i].length == 3
 *  - 0 <= fromi < toi < n
 *  - 1 <= weighti, distanceThreshold <= 10^4
 *  - All pairs (fromi, toi) are distinct.
 *
 * Hint (spoiler - pehle khud try karo): All-pairs shortest path chahiye (n <= 100): Floyd-Warshall O(n^3). dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]). Phir har city ke liye count (dist <= threshold), min count, tie me bada index (<= se update).
 */
public class LC1334_FindTheCity {

    // TODO: apna solution yahan likho
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        return 0;
    }

    static int[][] chain(int n) {
        int[][] e = new int[n - 1][];
        for (int i = 0; i + 1 < n; i++) e[i] = new int[]{i, i + 1, 1};
        return e;
    }

    public static void main(String[] args) {
        LC1334_FindTheCity sol = new LC1334_FindTheCity();
        Check.start("LC1334_FindTheCity");
        Check.eq(3, () -> sol.findTheCity(4, new int[][]{{0,1,3},{1,2,1},{1,3,4},{2,3,1}}, 4));
        Check.eq(0, () -> sol.findTheCity(5, new int[][]{{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}}, 2));
        Check.eq(1, () -> sol.findTheCity(2, new int[][]{{0,1,5}}, 5));
        Check.eq(1, () -> sol.findTheCity(2, new int[][]{{0,1,5}}, 4));
        Check.eq(3, () -> sol.findTheCity(4, new int[][]{{0,1,1},{2,3,1}}, 10));
        Check.eq(2, () -> sol.findTheCity(3, new int[][]{{0,1,1},{1,2,1},{0,2,5}}, 1));
        Check.eq(2, () -> sol.findTheCity(3, new int[][]{{0,1,1},{1,2,1},{0,2,5}}, 2));
        Check.eq(5, () -> sol.findTheCity(6, new int[][]{{0,1,10},{0,2,1},{2,3,1},{1,3,1},{1,4,1},{4,5,10}}, 20));
        Check.eq(4, () -> sol.findTheCity(5, new int[][]{{0,1,1},{1,2,1},{2,3,1},{3,4,1}}, 2));
        Check.eq(3, () -> sol.findTheCity(4, new int[][]{{0,1,2},{1,2,2},{2,3,2},{0,3,1}}, 3));
        Check.eq(99, () -> sol.findTheCity(100, chain(100), 3));  // path graph: dono ends ke 3 neighbours, tie => bada index
        Check.summary();
    }
}
