package com.codekatha.machinecodingpractice.mine.dsaquest.common;

import java.util.*;

/** Node for Clone Graph (LeetCode calls it Node). Helper: GraphNode.build(adjList) with 1-indexed adjacency. */
public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() { val = 0; neighbors = new ArrayList<>(); }
    public GraphNode(int val) { this.val = val; neighbors = new ArrayList<>(); }

    /** adjList[i] = neighbours of node (i+1), e.g. {{2,4},{1,3},{2,4},{1,3}}. Returns node 1 (or null). */
    public static GraphNode build(int[][] adjList) {
        if (adjList.length == 0) return null;
        GraphNode[] nodes = new GraphNode[adjList.length + 1];
        for (int i = 1; i <= adjList.length; i++) nodes[i] = new GraphNode(i);
        for (int i = 1; i <= adjList.length; i++)
            for (int nb : adjList[i - 1]) nodes[i].neighbors.add(nodes[nb]);
        return nodes[1];
    }

    /** BFS print: "1:[2, 4] 2:[1, 3] ..." sorted by val - handy to compare original vs clone. */
    public static String dump(GraphNode start) {
        if (start == null) return "null";
        Map<Integer, GraphNode> seen = new TreeMap<>();
        Deque<GraphNode> dq = new ArrayDeque<>();
        dq.add(start);
        seen.put(start.val, start);
        while (!dq.isEmpty()) {
            GraphNode cur = dq.poll();
            for (GraphNode nb : cur.neighbors)
                if (seen.putIfAbsent(nb.val, nb) == null) dq.add(nb);
        }
        StringBuilder sb = new StringBuilder();
        for (GraphNode n : seen.values()) {
            List<Integer> vs = new ArrayList<>();
            for (GraphNode nb : n.neighbors) vs.add(nb.val);
            sb.append(n.val).append(":").append(vs).append(" ");
        }
        return sb.toString().trim();
    }
}
