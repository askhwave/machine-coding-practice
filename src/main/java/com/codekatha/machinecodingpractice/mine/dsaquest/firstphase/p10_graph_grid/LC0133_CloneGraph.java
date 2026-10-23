package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p10_graph_grid;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #133 - Clone Graph  [Medium]
 * Link   : https://leetcode.com/problems/clone-graph/
 * Pattern: Graphs & Grid (DFS / BFS / Union-Find)
 *
 * Given a reference of a node in a connected undirected graph. Return a deep copy (clone) of
 * the graph. Each node in the graph contains a value (int) and a list (List[Node]) of its
 * neighbors. (In this project the node class is GraphNode, see common package; it is called
 * Node on LeetCode.) For simplicity, each node's value is the same as the node's index
 * (1-indexed). The given node will always be the first node with val = 1. You must return the
 * copy of the given node as a reference to the cloned graph.
 *
 * Example 1:
 * <pre>
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 * Explanation: 4 nodes; node 1's neighbors are 2 and 4, and so on.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: adjList = [[]]
 * Output: [[]]  (one node with no neighbors)
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: adjList = []
 * Output: []  (empty graph)
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the graph is in the range [0, 100].
 *  - 1 <= Node.val <= 100
 *  - Node.val is unique for each node.
 *  - There are no repeated edges and no self-loops in the graph.
 *  - The Graph is connected and all nodes can be visited starting from the given node.
 *
 * Hint (spoiler - pehle khud try karo): HashMap&lt;original, clone>. Node pehle se map me ho to wahi return (cycle yahin tootta hai), warna clone banao, map me daalo, phir neighbors clone karo.
 */
public class LC0133_CloneGraph {

    // TODO: apna solution yahan likho
    public GraphNode cloneGraph(GraphNode node) {
        return null;
    }

    public static void main(String[] args) {
        LC0133_CloneGraph sol = new LC0133_CloneGraph();
        GraphNode g = GraphNode.build(new int[][]{{2,4},{1,3},{2,4},{1,3}});
        GraphNode c = sol.cloneGraph(g);
        System.out.println(GraphNode.dump(c));        // 1:[2, 4] 2:[1, 3] 3:[2, 4] 4:[1, 3]
        System.out.println(c != g);                   // true (alag object hona chahiye)
    }
}
