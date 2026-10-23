package com.codekatha.machinecodingpractice.mine.dsaquest.p09_trees;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #637 - Average of Levels in Binary Tree  [Easy]
 * Link   : https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * Pattern: Binary Trees (DFS / BFS)
 *
 * Given the root of a binary tree, return the average value of the nodes on each level in the
 * form of an array. Answers within 10^-5 of the actual answer will be accepted.
 *
 * Example 1:
 * <pre>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [3.00000,14.50000,11.00000]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [3,9,20,15,7]
 * Output: [3.00000,14.50000,11.00000]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 10^4].
 *  - -2^31 <= Node.val <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): BFS level-by-level: loop se pehle size = queue.size() lo. Sum ko long/double me lo (overflow).
 */
public class LC0637_AverageOfLevelsInBinaryTree {

    // TODO: apna solution yahan likho
    public List<Double> averageOfLevels(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0637_AverageOfLevelsInBinaryTree sol = new LC0637_AverageOfLevelsInBinaryTree();
        System.out.println(sol.averageOfLevels(TreeNode.of(3,9,20,null,null,15,7))); // [3.0, 14.5, 11.0]
        System.out.println(sol.averageOfLevels(TreeNode.of(3,9,20,15,7)));           // [3.0, 14.5, 11.0]
    }
}
