package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #226 - Invert Binary Tree  [Easy]
 * Link   : https://leetcode.com/problems/invert-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * Example 1:
 * <pre>
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: root = []
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [0, 100].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): Har node par left aur right swap, phir dono children par recursion.
 */
public class LC0226_InvertBinaryTree {

    // TODO: apna solution yahan likho
    public TreeNode invertTree(TreeNode root) {
        return root;
    }

    public static void main(String[] args) {
        LC0226_InvertBinaryTree sol = new LC0226_InvertBinaryTree();
        Check.start("LC0226_InvertBinaryTree");
        Check.eq("[4, 7, 2, 9, 6, 3, 1]", () -> sol.invertTree(TreeNode.of(4,2,7,1,3,6,9)));
        Check.eq("[2, 3, 1]", () -> sol.invertTree(TreeNode.of(2,1,3)));
        Check.summary();
    }
}
