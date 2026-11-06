package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g01_trees.s02_bst;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #701 - Insert into a Binary Search Tree  [Difficulty: Medium | Atlassian: last seen 1 year, frequency score 0.016]
 * Link   : https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Trees  >  BST Insert & Iterator
 *
 * You are given the root node of a binary search tree (BST) and a value to insert into the
 * tree. Return the root node of the BST after the insertion. It is guaranteed that the new
 * value does not exist in the original BST. Notice that there may exist multiple valid ways
 * for the insertion, as long as the tree remains a BST after insertion. You can return any of
 * them.
 *
 * Example 1:
 * <pre>
 * Input: root = [4,2,7,1,3], val = 5
 * Output: [4,2,7,1,3,5]
 * Explanation: Another accepted tree is [5,2,7,1,3,null,null,null,null,null,4].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [40,20,60,10,30,50,70], val = 25
 * Output: [40,20,60,10,30,50,70,null,null,25]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
 * Output: [4,2,7,1,3,5]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree will be in the range [0, 10^4].
 *  - -10^8 <= Node.val <= 10^8
 *  - All the values Node.val are unique.
 *  - -10^8 <= val <= 10^8
 *  - It's guaranteed that val does not exist in the original BST.
 *
 * Hint (spoiler - pehle khud try karo): BST me compare karke ek hi raasta milta hai: val < node.val to left, warna right. Jahan null mile wahin naya leaf laga do (existing nodes ko rotate karne ki zaroorat nahi). Iterative version me recursion stack bhi nahi lagta.
 */
public class LC0701_InsertIntoABinarySearchTree {

    // TODO: apna solution yahan likho
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return root;
    }

    static List<Integer> inorder(TreeNode n) {
        List<Integer> out = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        while (n != null || !st.isEmpty()) {
            while (n != null) { st.push(n); n = n.left; }
            n = st.pop();
            out.add(n.val);
            n = n.right;
        }
        return out;
    }

    static boolean isBst(TreeNode n, long lo, long hi) {
        if (n == null) return true;
        return n.val > lo && n.val < hi && isBst(n.left, lo, n.val) && isBst(n.right, n.val, hi);
    }

    public static void main(String[] args) {
        LC0701_InsertIntoABinarySearchTree sol = new LC0701_InsertIntoABinarySearchTree();
        Check.start("LC0701_InsertIntoABinarySearchTree");
        Check.eq("[1, 2, 3, 4, 5, 7]", () -> inorder(sol.insertIntoBST(TreeNode.of(4,2,7,1,3), 5)));
        Check.eq("[10, 20, 25, 30, 40, 50, 60, 70]", () -> inorder(sol.insertIntoBST(TreeNode.of(40,20,60,10,30,50,70), 25)));
        Check.eq("[0, 1, 2, 3, 4, 7]", () -> inorder(sol.insertIntoBST(TreeNode.of(4,2,7,1,3), 0)));
        Check.eq("[1, 2, 3, 4, 7, 100]", () -> inorder(sol.insertIntoBST(TreeNode.of(4,2,7,1,3), 100)));
        Check.eq("[1, 3, 4, 5, 6, 7, 8, 10, 13, 14]", () -> inorder(sol.insertIntoBST(TreeNode.of(8,3,10,1,6,null,14,null,null,4,7,13), 5)));
        Check.eq("[5, 6]", () -> inorder(sol.insertIntoBST(TreeNode.of(5), 6)));
        Check.eq("[4, 5]", () -> inorder(sol.insertIntoBST(TreeNode.of(5), 4)));
        Check.eq("[5]", () -> inorder(sol.insertIntoBST(null, 5)));   // empty tree: naya node hi root hai
        Check.eq(true, () -> isBst(sol.insertIntoBST(TreeNode.of(4, 2, 7, 1, 3), 6), Long.MIN_VALUE, Long.MAX_VALUE));   // BST property bani rehni chahiye
        Check.eq("[1, 3, 4, 5, 8, 9]", () -> { TreeNode r = null; for (int v : new int[]{5, 3, 8, 1, 4, 9}) r = sol.insertIntoBST(r, v); return inorder(r); });   // tree ko khaali se build karo
        Check.eq(true, () -> { TreeNode r = null; for (int v : new int[]{5, 3, 8, 1, 4, 9}) r = sol.insertIntoBST(r, v); return isBst(r, Long.MIN_VALUE, Long.MAX_VALUE); });
        Check.eq(3000, () -> { TreeNode r = null; for (int v = 0; v < 3000; v++) r = sol.insertIntoBST(r, v); return inorder(r).size(); });   // sorted inserts = lambi chain, recursion/loop dono sambhalo
        Check.summary();
    }
}
