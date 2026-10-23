package com.codekatha.machinecodingpractice.mine.dsaquest.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #547 - Number of Provinces  [Medium]
 * Link   : https://leetcode.com/problems/number-of-provinces/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * There are n cities. Some of them are connected, while some are not. If city a is connected
 * directly with city b, and city b is connected directly with city c, then city a is connected
 * indirectly with city c. A province is a group of directly or indirectly connected cities and
 * no other cities outside of the group. You are given an n x n matrix isConnected where
 * isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and
 * isConnected[i][j] = 0 otherwise. Return the total number of provinces.
 *
 * Example 1:
 * <pre>
 * Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 200
 *  - n == isConnected.length
 *  - n == isConnected[i].length
 *  - isConnected[i][j] is 1 or 0.
 *  - isConnected[i][i] == 1
 *  - isConnected[i][j] == isConnected[j][i]
 *
 * Hint (spoiler - pehle khud try karo): Matrix hi adjacency matrix hai. Har unvisited city par DFS, count++. Union-Find se bhi karo.
 */
public class LC0547_NumberOfProvinces {

    // TODO: apna solution yahan likho
    public int findCircleNum(int[][] isConnected) {
        return 0;
    }

    public static void main(String[] args) {
        LC0547_NumberOfProvinces sol = new LC0547_NumberOfProvinces();
        System.out.println(sol.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}})); // 2
        System.out.println(sol.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); // 3
    }
}
