package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #543 - Diameter of Binary Tree  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/diameter-of-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, return the length of the diameter of the tree. The diameter
 * of a binary tree is the length of the longest path between any two nodes in a tree. This
 * path may or may not pass through the root. The length of a path between two nodes is
 * represented by the number of edges between them.
 *
 * Example 1:
 * <pre>
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1,2]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 10^4].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): #104 height function ke saath ek global max: har node par leftH + rightH. (#124 ka chhota bhai.)
 */
public class LC0543_DiameterOfBinaryTree {

    // TODO: apna solution yahan likho
    public int diameterOfBinaryTree(TreeNode root) {
        return 0;
    }

    public static void main(String[] args) {
        LC0543_DiameterOfBinaryTree sol = new LC0543_DiameterOfBinaryTree();
        Check.start("LC0543_DiameterOfBinaryTree");
        Check.eq("3", () -> sol.diameterOfBinaryTree(TreeNode.of(1,2,3,4,5)));
        Check.eq("1", () -> sol.diameterOfBinaryTree(TreeNode.of(1,2)));
        Check.summary();
    }
}
