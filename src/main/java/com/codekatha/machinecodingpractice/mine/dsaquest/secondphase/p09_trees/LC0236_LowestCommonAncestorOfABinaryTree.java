package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #236 - Lowest Common Ancestor of a Binary Tree  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * The lowest common ancestor is defined between two nodes p and q as the lowest node in T that
 * has both p and q as descendants (where we allow a node to be a descendant of itself).
 *
 * Example 1:
 * <pre>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself.
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [2, 10^5].
 *  - -10^9 <= Node.val <= 10^9
 *  - All Node.val are unique.
 *  - p != q
 *  - p and q will exist in the tree.
 *
 * Hint (spoiler - pehle khud try karo): #235 jaisa BST property nahi hai. Post-order: null/p/q mile to return node; left aur right dono non-null -> current node LCA.
 */
public class LC0236_LowestCommonAncestorOfABinaryTree {

    // TODO: apna solution yahan likho
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }

    public static void main(String[] args) {
        LC0236_LowestCommonAncestorOfABinaryTree sol = new LC0236_LowestCommonAncestorOfABinaryTree();
        TreeNode root = TreeNode.of(3,5,1,6,2,0,8,null,null,7,4);
        System.out.println(sol.lowestCommonAncestor(root, root.left, root.right).val);                  // 3
        System.out.println(sol.lowestCommonAncestor(root, root.left, root.left.right.right).val);       // 5
    }
}
