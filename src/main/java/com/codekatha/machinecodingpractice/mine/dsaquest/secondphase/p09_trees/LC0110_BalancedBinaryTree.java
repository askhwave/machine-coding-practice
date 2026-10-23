package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #110 - Balanced Binary Tree  [Easy]
 * Link   : https://leetcode.com/problems/balanced-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given a binary tree, determine if it is height-balanced. A height-balanced binary tree is a
 * binary tree in which the depth of the two subtrees of every node never differs by more than
 * one.
 *
 * Example 1:
 * <pre>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: root = []
 * Output: true
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [0, 5000].
 *  - -10^4 <= Node.val <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): O(n) trick: height function me imbalance mile to -1 return karo aur upar tak propagate karo.
 */
public class LC0110_BalancedBinaryTree {

    // TODO: apna solution yahan likho
    public boolean isBalanced(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        LC0110_BalancedBinaryTree sol = new LC0110_BalancedBinaryTree();
        System.out.println(sol.isBalanced(TreeNode.of(3,9,20,null,null,15,7)));         // true
        System.out.println(sol.isBalanced(TreeNode.of(1,2,2,3,3,null,null,4,4)));       // false
        System.out.println(sol.isBalanced(null));                                         // true
    }
}
