package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #104 - Maximum Depth of Binary Tree  [Easy]
 * Link   : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, return its maximum depth. A binary tree's maximum depth is
 * the number of nodes along the longest path from the root node down to the farthest leaf
 * node.
 *
 * Example 1:
 * <pre>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1,null,2]
 * Output: 2
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [0, 10^4].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): 1 + max(left, right), null = 0. Ye 'post-order return value' pattern ka base hai.
 */
public class LC0104_MaximumDepthOfBinaryTree {

    // TODO: apna solution yahan likho
    public int maxDepth(TreeNode root) {
        return 0;
    }

    public static void main(String[] args) {
        LC0104_MaximumDepthOfBinaryTree sol = new LC0104_MaximumDepthOfBinaryTree();
        System.out.println(sol.maxDepth(TreeNode.of(3,9,20,null,null,15,7))); // 3
        System.out.println(sol.maxDepth(TreeNode.of(1,null,2)));              // 2
        System.out.println(sol.maxDepth(null));                               // 0
    }
}
