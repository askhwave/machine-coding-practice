package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g08_heap_and_intervals.s01_heap_top_k_and_merge;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #23 - Merge k Sorted Lists  [LeetCode: Hard | Cheatsheet: Round 2 F2F | Hard]
 * Link   : https://leetcode.com/problems/merge-k-sorted-lists/
 * Group  : Heap & Intervals  >  Heap: Top-K & K-way Merge
 *
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending
 * order. Merge all the linked-lists into one sorted linked-list and return it.
 *
 * Example 1:
 * <pre>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: lists = []
 * Output: []
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: lists = [[]]
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - k == lists.length
 *  - 0 <= k <= 10^4
 *  - 0 <= lists[i].length <= 500
 *  - -10^4 <= lists[i][j] <= 10^4
 *  - lists[i] is sorted in ascending order.
 *  - The sum of lists[i].length will not exceed 10^4.
 *
 * Hint (spoiler - pehle khud try karo): Min-heap mein har list ka current head rakho; poll karo, answer mein jodo, uska next heap mein daalo. O(N log k). Alternative: divide & conquer pairwise merge.
 */
public class LC0023_MergeKSortedLists {

    // TODO: apna solution yahan likho
    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

    // k single-node lists: values k, k-1, ..., 1
    static ListNode[] singles(int k) {
        ListNode[] a = new ListNode[k];
        for (int i = 0; i < k; i++) a[i] = new ListNode(k - i);
        return a;
    }

    // list must be exactly 1 -> 2 -> ... -> k
    static boolean isUpTo(ListNode head, int k) {
        int expect = 1;
        for (ListNode c = head; c != null; c = c.next) if (c.val != expect++) return false;
        return expect == k + 1;
    }

    public static void main(String[] args) {
        LC0023_MergeKSortedLists sol = new LC0023_MergeKSortedLists();
        Check.start("LC0023_MergeKSortedLists");
        Check.eq("1->1->2->3->4->4->5->6", () -> sol.mergeKLists(new ListNode[]{ListNode.of(1,4,5),ListNode.of(1,3,4),ListNode.of(2,6)}));
        Check.eq("null", () -> sol.mergeKLists(new ListNode[]{}));
        Check.eq("null", () -> sol.mergeKLists(new ListNode[]{null}));
        Check.eq("null", () -> sol.mergeKLists(new ListNode[]{null,null}));
        Check.eq("0->1", () -> sol.mergeKLists(new ListNode[]{ListNode.of(1),ListNode.of(0)}));
        Check.eq("-3->-2->-1->0->1->2->5->9", () -> sol.mergeKLists(new ListNode[]{ListNode.of(-3,-1,2),null,ListNode.of(-2,0,5,9),ListNode.of(1)}));
        Check.eq("5->6->7->8->9", () -> sol.mergeKLists(new ListNode[]{ListNode.of(5,6,7,8,9)}));
        Check.eq("1->1->1->1->1->1", () -> sol.mergeKLists(new ListNode[]{ListNode.of(1,1,1),ListNode.of(1,1),ListNode.of(1)}));
        Check.eq("-10000->0->10000", () -> sol.mergeKLists(new ListNode[]{ListNode.of(-10000),ListNode.of(10000),ListNode.of(0)}));
        Check.eq(true, () -> isUpTo(sol.mergeKLists(singles(10000)), 10000)); // 10^4 lists - har baar poori list merge karoge to slow
        Check.summary();
    }
}
