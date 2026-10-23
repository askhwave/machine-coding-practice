package com.codekatha.machinecodingpractice.mine.dsaquest.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #102 - Binary Tree Level Order Traversal  [Medium]
 * Link   : https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * Example 1:
 * <pre>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
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
 *  - -1000 <= Node.val <= 1000
 *
 * Hint (spoiler - pehle khud try karo): BFS template (queue + level size). Ye template #103, #199, #637 sab me chalega.
 */
public class LC0102_BinaryTreeLevelOrderTraversal {

    // TODO: apna solution yahan likho
    public List<List<Integer>> levelOrder(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0102_BinaryTreeLevelOrderTraversal sol = new LC0102_BinaryTreeLevelOrderTraversal();
        System.out.println(sol.levelOrder(TreeNode.of(3,9,20,null,null,15,7))); // [[3], [9, 20], [15, 7]]
        System.out.println(sol.levelOrder(TreeNode.of(1)));                     // [[1]]
        System.out.println(sol.levelOrder(null));                              // []
    }
}
