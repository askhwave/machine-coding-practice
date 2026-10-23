package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set39_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree  [Medium]
 * Link   : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given
 * nodes in the BST. According to the definition of LCA on Wikipedia: The lowest common
 * ancestor is defined between two nodes p and q as the lowest node in T that has both p and q
 * as descendants (where we allow a node to be a descendant of itself).
 *
 * Example 1:
 * <pre>
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself.
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [2, 10^5].
 *  - -10^9 <= Node.val <= 10^9
 *  - All Node.val are unique.
 *  - p != q
 *  - p and q will exist in the BST.
 *
 * Hint (spoiler - pehle khud try karo): BST property: dono p,q root se chhote -> left; dono bade -> right; warna root hi split point = LCA. Iterative O(1) space.
 */
public class LC0235_LowestCommonAncestorOfABinarySearchTree {

    // TODO: apna solution yahan likho
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }

    public static void main(String[] args) {
        LC0235_LowestCommonAncestorOfABinarySearchTree sol = new LC0235_LowestCommonAncestorOfABinarySearchTree();
        Check.start("LC0235_LowestCommonAncestorOfABinarySearchTree");
        TreeNode root = TreeNode.of(6,2,8,0,4,7,9,null,null,3,5);
        Check.eq("6", () -> sol.lowestCommonAncestor(root, root.left, root.right).val);
        Check.eq("2", () -> sol.lowestCommonAncestor(root, root.left, root.left.right).val);
        Check.summary();
    }
}
