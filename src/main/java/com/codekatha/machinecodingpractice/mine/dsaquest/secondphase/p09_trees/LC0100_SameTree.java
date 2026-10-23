package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.TreeNode;

/**
 * LeetCode #100 - Same Tree  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/same-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the roots of two binary trees p and q, write a function to check if they are the same
 * or not. Two binary trees are considered the same if they are structurally identical, and the
 * nodes have the same value.
 *
 * Example 1:
 * <pre>
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in both trees is in the range [0, 100].
 *  - -10^4 <= Node.val <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Dono null -> true; ek null -> false; val alag -> false; warna dono sides recurse. Is order me check likho.
 */
public class LC0100_SameTree {

    // TODO: apna solution yahan likho
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
    }

    public static void main(String[] args) {
        LC0100_SameTree sol = new LC0100_SameTree();
        System.out.println(sol.isSameTree(TreeNode.of(1,2,3), TreeNode.of(1,2,3)));          // true
        System.out.println(sol.isSameTree(TreeNode.of(1,2), TreeNode.of(1,null,2)));         // false
        System.out.println(sol.isSameTree(TreeNode.of(1,2,1), TreeNode.of(1,1,2)));          // false
    }
}
