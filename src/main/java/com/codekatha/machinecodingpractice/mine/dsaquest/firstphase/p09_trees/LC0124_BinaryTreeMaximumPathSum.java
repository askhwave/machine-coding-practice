package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #124 - Binary Tree Maximum Path Sum  [Hard]
 * Link   : https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the
 * sequence has an edge connecting them. A node can only appear in the sequence at most once.
 * Note that the path does not need to pass through the root. The path sum of a path is the sum
 * of the node's values in the path. Given the root of a binary tree, return the maximum path
 * sum of any non-empty path.
 *
 * Example 1:
 * <pre>
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 3 * 10^4].
 *  - -1000 <= Node.val <= 1000
 *
 * Hint (spoiler - pehle khud try karo): Har node par do alag cheezein: (a) 'upar ko jaane wala' = val + max(0, best(left), best(right)); (b) 'yahin se guzarne wala' = val + max(0,L) + max(0,R) -> global max. Negative branch ignore.
 */
public class LC0124_BinaryTreeMaximumPathSum {

    // TODO: apna solution yahan likho
    public int maxPathSum(TreeNode root) {
        return 0;
    }

    public static void main(String[] args) {
        LC0124_BinaryTreeMaximumPathSum sol = new LC0124_BinaryTreeMaximumPathSum();
        System.out.println(sol.maxPathSum(TreeNode.of(1,2,3)));                        // 6
        System.out.println(sol.maxPathSum(TreeNode.of(-10,9,20,null,null,15,7)));       // 42
        System.out.println(sol.maxPathSum(TreeNode.of(-3)));                            // -3
    }
}
