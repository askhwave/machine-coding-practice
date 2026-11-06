package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g01_trees.s02_bst;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #173 - Binary Search Tree Iterator  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.019]
 * Link   : https://leetcode.com/problems/binary-search-tree-iterator/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Trees  >  BST Insert & Iterator
 *
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a
 * binary search tree (BST): BSTIterator(TreeNode root) Initializes an object of the
 * BSTIterator class. The root of the BST is given as part of the constructor. The pointer
 * should be initialized to a non-existent number smaller than any element in the BST. boolean
 * hasNext() Returns true if there exists a number in the traversal to the right of the
 * pointer, otherwise returns false. int next() Moves the pointer to the right, then returns
 * the number at the pointer. Notice that by initializing the pointer to a non-existent
 * smallest number, the first call to next() will return the smallest element in the BST. You
 * may assume that next() calls will always be valid. That is, there will be at least a next
 * number in the in-order traversal when next() is called.
 *
 * Example 1:
 * <pre>
 * Input: ["BSTIterator","next","next","hasNext","next","hasNext","next","hasNext","next","hasNext"]
 *        [[[7,3,15,null,null,9,20]],[],[],[],[],[],[],[],[],[]]
 * Output: [null,3,7,true,9,true,15,true,20,false]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the tree is in the range [1, 10^5].
 *  - 0 <= Node.val <= 10^6
 *  - At most 10^5 calls will be made to hasNext, and next.
 *  - Follow up: could you implement next() and hasNext() to run in average O(1) time and use O(h) memory, where h is the height of the tree?
 *
 * Hint (spoiler - pehle khud try karo): Constructor me sirf left spine stack me daalo. next(): pop karo, phir popped node ke right child ki left spine push karo. hasNext = stack non-empty. Har node ek hi baar push/pop => amortized O(1), memory O(h).
 */
public class LC0173_BinarySearchTreeIterator {

    static class BSTIterator {
        // TODO: Deque<TreeNode> stack - left spine push karna ek helper me rakho

        public BSTIterator(TreeNode root) {
        }

        public int next() {
            return -1;
        }

        public boolean hasNext() {
            return false;
        }
    }

    static List<Integer> drain(BSTIterator it) {
        List<Integer> out = new ArrayList<>();
        while (it.hasNext()) out.add(it.next());
        return out;
    }

    static TreeNode balanced(int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) >>> 1;
        TreeNode n = new TreeNode(mid);
        n.left = balanced(lo, mid - 1);
        n.right = balanced(mid + 1, hi);
        return n;
    }

    public static void main(String[] args) {
        LC0173_BinarySearchTreeIterator sol = new LC0173_BinarySearchTreeIterator();
        Check.start("LC0173_BinarySearchTreeIterator");
        BSTIterator it = new BSTIterator(TreeNode.of(7, 3, 15, null, null, 9, 20));
        Check.eq(3, () -> it.next());
        Check.eq(7, () -> it.next());
        Check.eq(true, () -> it.hasNext());
        Check.eq(9, () -> it.next());
        Check.eq(true, () -> it.hasNext());
        Check.eq(15, () -> it.next());
        Check.eq(true, () -> it.hasNext());
        Check.eq(20, () -> it.next());
        Check.eq(false, () -> it.hasNext());
        BSTIterator one = new BSTIterator(TreeNode.of(42));   // single node
        Check.eq(true, () -> one.hasNext() && one.hasNext());   // hasNext state change nahi karta
        Check.eq(42, () -> one.next());
        Check.eq(false, () -> one.hasNext());
        BSTIterator left = new BSTIterator(TreeNode.of(5, 4, null, 3, null, 2, null, 1));   // sirf left chain
        Check.eq("[1, 2, 3, 4, 5]", () -> drain(left));
        BSTIterator right = new BSTIterator(TreeNode.of(1, null, 2, null, 3, null, 4));   // sirf right chain
        Check.eq("[1, 2, 3, 4]", () -> drain(right));
        BSTIterator mix = new BSTIterator(TreeNode.of(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13));
        Check.eq("[1, 3, 4, 6, 7, 8, 10, 13, 14]", () -> drain(mix));
        Check.eq(true, () -> { BSTIterator big = new BSTIterator(balanced(0, 99999)); for (int i = 0; i < 100000; i++) { if (!big.hasNext() || big.next() != i) return false; } return !big.hasNext(); });   // 10^5 nodes
        Check.summary();
    }
}
