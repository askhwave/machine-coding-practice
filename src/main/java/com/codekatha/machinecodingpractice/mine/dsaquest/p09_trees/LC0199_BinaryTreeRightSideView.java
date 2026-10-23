package com.codekatha.machinecodingpractice.mine.dsaquest.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #199 - Binary Tree Right Side View  [Medium]
 * Link   : https://leetcode.com/problems/binary-tree-right-side-view/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return
 * the values of the nodes you can see ordered from top to bottom.
 *
 * Example 1:
 * <pre>
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1,2,3,4,null,null,null,5]
 * Output: [1,3,4,5]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: root = [1,null,3]
 * Output: [1,3]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [0, 100].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): BFS me har level ka last node. DFS version: root, right, left order me jao, depth == list.size() par add.
 */
public class LC0199_BinaryTreeRightSideView {

    // TODO: apna solution yahan likho
    public List<Integer> rightSideView(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0199_BinaryTreeRightSideView sol = new LC0199_BinaryTreeRightSideView();
        System.out.println(sol.rightSideView(TreeNode.of(1,2,3,null,5,null,4)));        // [1, 3, 4]
        System.out.println(sol.rightSideView(TreeNode.of(1,2,3,4,null,null,null,5)));   // [1, 3, 4, 5]
        System.out.println(sol.rightSideView(TreeNode.of(1,null,3)));                   // [1, 3]
    }
}
