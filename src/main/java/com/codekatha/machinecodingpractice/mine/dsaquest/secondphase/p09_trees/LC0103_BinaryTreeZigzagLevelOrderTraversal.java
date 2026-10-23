package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

import java.util.*;

/**
 * LeetCode #103 - Binary Tree Zigzag Level Order Traversal  [Medium]
 * Link   : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes'
 * values. (i.e., from left to right, then right to left for the next level and alternate
 * between).
 *
 * Example 1:
 * <pre>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1]
 * Output: [[1]]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: root = []
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [0, 2000].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): #102 jaisa hi, bas alternate level par list reverse (ya LinkedList me addFirst). Queue ka order mat badlo.
 */
public class LC0103_BinaryTreeZigzagLevelOrderTraversal {

    // TODO: apna solution yahan likho
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0103_BinaryTreeZigzagLevelOrderTraversal sol = new LC0103_BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(sol.zigzagLevelOrder(TreeNode.of(3,9,20,null,null,15,7))); // [[3], [20, 9], [15, 7]]
        System.out.println(sol.zigzagLevelOrder(TreeNode.of(1,2,3,4,null,null,5)));    // [[1], [3, 2], [4, 5]]
    }
}
