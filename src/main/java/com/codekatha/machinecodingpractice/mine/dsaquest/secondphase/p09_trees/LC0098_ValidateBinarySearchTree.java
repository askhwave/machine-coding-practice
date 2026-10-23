package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #98 - Validate Binary Search Tree  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/validate-binary-search-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST). A
 * valid BST is defined as follows: the left subtree of a node contains only nodes with keys
 * less than the node's key; the right subtree of a node contains only nodes with keys greater
 * than the node's key; both the left and right subtrees must also be binary search trees.
 *
 * Example 1:
 * <pre>
 * Input: root = [2,1,3]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 10^4].
 *  - -2^31 <= Node.val <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): Sirf parent se compare karna kaafi nahi. (min, max) range pass karo - Long use karo (Integer.MIN_VALUE node ho sakta hai). Ya inorder sorted check.
 */
public class LC0098_ValidateBinarySearchTree {

    // TODO: apna solution yahan likho
    public boolean isValidBST(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        LC0098_ValidateBinarySearchTree sol = new LC0098_ValidateBinarySearchTree();
        Check.start("LC0098_ValidateBinarySearchTree");
        Check.eq("true", () -> sol.isValidBST(TreeNode.of(2,1,3)));
        Check.eq("false", () -> sol.isValidBST(TreeNode.of(5,1,4,null,null,3,6)));
        Check.eq("false", () -> sol.isValidBST(TreeNode.of(5,4,6,null,null,3,7)));
        Check.summary();
    }
}
