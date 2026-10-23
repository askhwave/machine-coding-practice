package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set41_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1971 - Find if Path Exists in Graph  [Easy]
 * Link   : https://leetcode.com/problems/find-if-path-exists-in-graph/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n -
 * 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where
 * each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi.
 * Every vertex pair is connected by at most one edge, and no vertex has an edge to itself. You
 * want to determine if there is a valid path that exists from vertex source to vertex
 * destination. Given edges and the integers n, source, and destination, return true if there
 * is a valid path from source to destination, or false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 2 * 10^5
 *  - 0 <= edges.length <= 2 * 10^5
 *  - edges[i].length == 2
 *  - 0 <= ui, vi <= n - 1
 *  - ui != vi
 *  - 0 <= source, destination <= n - 1
 *  - There are no duplicate edges and no self edges.
 *
 * Hint (spoiler - pehle khud try karo): Adjacency list banao (undirected: dono taraf), phir BFS/DFS with visited. Alternative: Union-Find.
 */
public class LC1971_FindIfPathExistsInGraph {

    // TODO: apna solution yahan likho
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        return false;
    }

    public static void main(String[] args) {
        LC1971_FindIfPathExistsInGraph sol = new LC1971_FindIfPathExistsInGraph();
        Check.start("LC1971_FindIfPathExistsInGraph");
        Check.eq("true", () -> sol.validPath(3, new int[][]{{0,1},{1,2},{2,0}}, 0, 2));
        Check.eq("false", () -> sol.validPath(6, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5));
        Check.summary();
    }
}
