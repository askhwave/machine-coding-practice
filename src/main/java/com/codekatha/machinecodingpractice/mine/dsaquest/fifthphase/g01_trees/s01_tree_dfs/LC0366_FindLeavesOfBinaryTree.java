package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g01_trees.s01_tree_dfs;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #366 - Find Leaves of Binary Tree  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.529]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/find-leaves-of-binary-tree/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Trees  >  Tree DFS (bottom-up)
 *
 * Given the root of a binary tree, collect a tree's nodes as if you were doing this: Collect
 * all the leaf nodes. Remove all the leaf nodes. Repeat until the tree is empty.
 *
 * Example 1:
 * <pre>
 * Input: root = [1,2,3,4,5]
 * Output: [[4,5,3],[2],[1]]
 * Explanation: [[3,5,4],[2],[1]] and [[3,4,5],[2],[1]] are also accepted answers - order INSIDE one level does not matter, but the levels must come in this order.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: root = [1]
 * Output: [[1]]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 100].
 *  - -100 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): Node ka 'round number' = uski height (leaf = 0, parent = 1 + max(left, right)). Postorder me height nikalo aur result.get(height) me add karo - tree todne ki zaroorat nahi.
 */
public class LC0366_FindLeavesOfBinaryTree {

    // TODO: apna solution yahan likho
    public List<List<Integer>> findLeaves(TreeNode root) {
        return new ArrayList<>();
    }

    // test helper: har level ke andar order ignore (sort), levels ka order same rakhta hai
    static List<List<Integer>> sorted(List<List<Integer>> r) {
        List<List<Integer>> out = new ArrayList<>();
        for (List<Integer> l : r) {
            List<Integer> c = new ArrayList<>(l);
            Collections.sort(c);
            out.add(c);
        }
        return out;
    }

    public static void main(String[] args) {
        LC0366_FindLeavesOfBinaryTree sol = new LC0366_FindLeavesOfBinaryTree();
        Check.start("LC0366_FindLeavesOfBinaryTree");
        Check.eq("[[3, 4, 5], [2], [1]]", () -> sorted(sol.findLeaves(TreeNode.of(1,2,3,4,5))));
        Check.eq("[[1]]", () -> sorted(sol.findLeaves(TreeNode.of(1))));
        Check.eq("[[2], [1]]", () -> sorted(sol.findLeaves(TreeNode.of(1,2))));
        Check.eq("[[2], [1]]", () -> sorted(sol.findLeaves(TreeNode.of(1,null,2))));
        Check.eq("[[4, 5, 6, 7], [2, 3], [1]]", () -> sorted(sol.findLeaves(TreeNode.of(1,2,3,4,5,6,7))));
        Check.eq("[[4], [3], [2], [1]]", () -> sorted(sol.findLeaves(TreeNode.of(1,2,null,3,null,4))));
        Check.eq("[[0, 2, 4, 7, 9], [1, 8], [3], [5]]", () -> sorted(sol.findLeaves(TreeNode.of(5,3,8,1,4,7,9,0,2))));
        Check.eq("[[-89, -79, -51, 80], [-68, -4], [-6], [-42]]", () -> sorted(sol.findLeaves(TreeNode.of(-42,-6,null,-4,-68,-51,80,-89,-79))));
        Check.eq("[[-71, -3, 79, 85], [4, 21, 33, 94], [-32], [-95], [-41], [24], [-78], [3]]", () -> sorted(sol.findLeaves(TreeNode.of(3,null,-78,null,24,null,-41,94,-95,79,null,-32,33,null,null,4,21,null,-3,null,85,-71))));
        Check.eq("[[-76, -62, -50, -27, -21, 28, 59], [-9, 26, 64, 79], [-20, 36, 76], [-60, 53, 95], [-66, 9], [-9], [42], [13]]", () -> sorted(sol.findLeaves(TreeNode.of(13,-27,42,null,null,null,-9,9,-66,null,-60,95,53,-76,36,null,76,null,-20,null,null,79,null,-9,64,null,26,null,28,null,59,-50,-21,-62))));
        Check.summary();
    }
}
