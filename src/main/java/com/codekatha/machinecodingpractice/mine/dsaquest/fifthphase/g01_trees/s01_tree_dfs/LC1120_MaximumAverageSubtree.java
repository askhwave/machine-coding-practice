package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g01_trees.s01_tree_dfs;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1120 - Maximum Average Subtree  [Difficulty: Medium | Atlassian: last seen 1 year, frequency score 0.269]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/maximum-average-subtree/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Trees  >  Tree DFS (bottom-up)
 *
 * Given the root of a binary tree, return the maximum average value of a subtree of that tree.
 * Answers within 10^-5 of the actual answer will be accepted. A subtree of a tree is any node
 * of that tree plus all its descendants. The average value of a tree is the sum of its values,
 * divided by the number of nodes.
 *
 * Example 1:
 * <pre>
 * Input: root = [5,6,1]
 * Output: 6.00000
 * Explanation: For the node with value = 5 we have an average of (5 + 6 + 1) / 3 = 4. For the node with value = 6 we have an average of 6 / 1 = 6. For the node with value = 1 we have an average of 1 / 1 = 1. So the answer is 6 which is the maximum.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [0,null,1]
 * Output: 1.00000
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 10^4].
 *  - 0 <= Node.val <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Postorder: har node (sum, count) return kare. Average = sum / count; global max update karo. Sum ke liye long/double use karo (10^4 * 10^5 = 10^9 int ke kareeb).
 */
public class LC1120_MaximumAverageSubtree {

    // TODO: apna solution yahan likho
    public double maximumAverageSubtree(TreeNode root) {
        return 0.0;
    }

    public static void main(String[] args) {
        LC1120_MaximumAverageSubtree sol = new LC1120_MaximumAverageSubtree();
        Check.start("LC1120_MaximumAverageSubtree");
        Check.eq(6.0, () -> sol.maximumAverageSubtree(TreeNode.of(5,6,1)));
        Check.eq(1.0, () -> sol.maximumAverageSubtree(TreeNode.of(0,null,1)));
        Check.eq(7.0, () -> sol.maximumAverageSubtree(TreeNode.of(7)));
        Check.eq(7.0, () -> sol.maximumAverageSubtree(TreeNode.of(1,2,3,4,5,6,7)));
        Check.eq(20.8, () -> sol.maximumAverageSubtree(TreeNode.of(100,1,1,1,1)));
        Check.eq(4.0, () -> sol.maximumAverageSubtree(TreeNode.of(1,null,2,null,3,null,4)));
        Check.eq(100.0, () -> sol.maximumAverageSubtree(TreeNode.of(4,2,9,null,null,null,100)));
        Check.eq(96979.0, () -> sol.maximumAverageSubtree(TreeNode.of(81644,null,33481,97227,46993,90498,96979,null,85463,69473,3801)));
        Check.eq(58305.0, () -> sol.maximumAverageSubtree(TreeNode.of(95837,28407,null,53497,36632,null,null,23865,null,51044,null,20919,null,null,99867,null,9428,18188,80992,80930,58305,16606,null,17333)));
        Check.eq(98277.0, () -> sol.maximumAverageSubtree(TreeNode.of(88858,92756,null,44288,null,null,8653,40626,46576,null,40116,63012,null,91281,41391,24218,null,63074,61936,92362,null,23084,7471,33578,2997,98277,null,46877,null,52991,null,null,null,2368,71967,null,54896,null,null,47996)));
        Check.eq(90287.0, () -> sol.maximumAverageSubtree(TreeNode.of(97066,77851,45066,32795,59724,null,null,null,85323,55280,19087,7301,null,null,83666,null,null,null,null,null,4288,null,64692,43802,null,null,27139,null,17114,95900,73930,17403,82627,null,54240,null,null,null,13976,null,null,null,22127,null,56958,null,48889,null,19561,7703,55134,null,null,38641,null,null,18507,59395,null,81317,null,22189,null,null,68445,null,59446,63983,90287,null,95617,null,null,41641,62789,35918)));
        Check.summary();
    }
}
