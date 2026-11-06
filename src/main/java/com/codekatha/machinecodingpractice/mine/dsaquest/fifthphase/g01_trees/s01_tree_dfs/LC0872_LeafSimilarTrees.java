package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g01_trees.s01_tree_dfs;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #872 - Leaf-Similar Trees  [Difficulty: Easy | Atlassian: last seen 6 months, frequency score 0.018]
 * Link   : https://leetcode.com/problems/leaf-similar-trees/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Trees  >  Tree DFS (bottom-up)
 *
 * Consider all the leaves of a binary tree, from left to right order, the values of those
 * leaves form a leaf value sequence. Two binary trees are considered leaf-similar if their
 * leaf value sequence is the same. Return true if and only if the two given trees with root
 * nodes root1 and root2 are leaf-similar.
 *
 * Example 1:
 * <pre>
 * Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
 * Output: true
 * Explanation: Both leaf sequences are [6,7,4,9,8].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root1 = [1,2,3], root2 = [1,3,2]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in each tree will be in the range [1, 200].
 *  - Both of the given trees will have values in the range [0, 200].
 *
 * Hint (spoiler - pehle khud try karo): DFS (left before right) se leaf values list me jama karo, dono lists compare karo. Leaf = left aur right dono null. Follow-up: do iterators/stacks se O(h) memory me bhi ho sakta hai.
 */
public class LC0872_LeafSimilarTrees {

    // TODO: apna solution yahan likho
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return false;
    }

    public static void main(String[] args) {
        LC0872_LeafSimilarTrees sol = new LC0872_LeafSimilarTrees();
        Check.start("LC0872_LeafSimilarTrees");
        Check.eq(true, () -> sol.leafSimilar(TreeNode.of(3,5,1,6,2,9,8,null,null,7,4), TreeNode.of(3,5,1,6,7,4,2,null,null,null,null,null,null,9,8)));
        Check.eq(false, () -> sol.leafSimilar(TreeNode.of(1,2,3), TreeNode.of(1,3,2)));
        Check.eq(true, () -> sol.leafSimilar(TreeNode.of(1), TreeNode.of(1)));
        Check.eq(false, () -> sol.leafSimilar(TreeNode.of(1), TreeNode.of(2)));
        Check.eq(true, () -> sol.leafSimilar(TreeNode.of(1,2), TreeNode.of(1,null,2)));
        Check.eq(false, () -> sol.leafSimilar(TreeNode.of(1,2,3), TreeNode.of(1,2)));
        Check.eq(false, () -> sol.leafSimilar(TreeNode.of(4,2,6,1,3,5,7), TreeNode.of(9,1,8,null,3,5,null,null,null,null,null,null,7)));
        Check.eq(true, () -> sol.leafSimilar(TreeNode.of(1,2,null,3), TreeNode.of(7,null,5,4,null,3)));
        Check.eq(false, () -> sol.leafSimilar(TreeNode.of(5,3,8,null,4), TreeNode.of(1,null,9,4,null)));
        Check.eq(true, () -> sol.leafSimilar(TreeNode.of(2,1,3), TreeNode.of(2,1,3,null,null,null,null)));
        Check.summary();
    }
}
