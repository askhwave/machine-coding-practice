package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g05_trees_and_graphs.s01_tree_bfs_dfs_shortest_path;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #101 - Symmetric Tree  [LeetCode: Easy | Cheatsheet: Round 2 F2F | Easy]
 * Link   : https://leetcode.com/problems/symmetric-tree/
 * Group  : Trees & Graphs  >  Tree DFS, Graph BFS & Shortest Path
 *
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric
 * around its center).
 *
 * Example 1:
 * <pre>
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 1000].
 *  - -100 <= Node.val <= 100
 *  - Follow up: Could you solve it both recursively and iteratively?
 *
 * Hint (spoiler - pehle khud try karo): isMirror(a, b): dono null -> true; ek null -> false; a.val == b.val && isMirror(a.left, b.right) && isMirror(a.right, b.left).
 */
public class LC0101_SymmetricTree {

    // TODO: apna solution yahan likho
    public boolean isSymmetric(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        LC0101_SymmetricTree sol = new LC0101_SymmetricTree();
        Check.start("LC0101_SymmetricTree");
        Check.eq(true, () -> sol.isSymmetric(TreeNode.of(1,2,2,3,4,4,3)));
        Check.eq(false, () -> sol.isSymmetric(TreeNode.of(1,2,2,null,3,null,3)));
        Check.eq(true, () -> sol.isSymmetric(TreeNode.of(1)));
        Check.eq(false, () -> sol.isSymmetric(TreeNode.of(1,2,3)));
        Check.eq(true, () -> sol.isSymmetric(TreeNode.of(1,2,2)));
        Check.eq(true, () -> sol.isSymmetric(TreeNode.of(1,2,2,null,3,3)));  // left.right mirrors right.left
        Check.eq(false, () -> sol.isSymmetric(TreeNode.of(1,2,2,2,null,2)));  // left.left must mirror right.right, not right.left
        Check.eq(false, () -> sol.isSymmetric(TreeNode.of(1,2,2,3,4,3,4)));   // same shape, wrong values
        Check.eq(true, () -> sol.isSymmetric(TreeNode.of(1,2,2,3,null,null,3,4,null,null,4)));
        Check.summary();
    }
}
