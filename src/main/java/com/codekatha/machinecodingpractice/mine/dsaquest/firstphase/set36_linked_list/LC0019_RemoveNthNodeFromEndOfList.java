package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set36_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #19 - Remove Nth Node From End of List  [Medium]
 * Link   : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Pattern: Linked List
 *
 * Given the head of a linked list, remove the nth node from the end of the list and return its
 * head.
 *
 * Example 1:
 * <pre>
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1], n = 1
 * Output: []
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: head = [1,2], n = 1
 * Output: [1]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the list is sz.
 *  - 1 <= sz <= 30
 *  - 0 <= Node.val <= 100
 *  - 1 <= n <= sz
 *  - Follow-up: Could you do this in one pass?
 *
 * Hint (spoiler - pehle khud try karo): Dummy node + fast ko n+1 step aage, phir dono saath chalao. Head hi delete ho to dummy bachata hai.
 */
public class LC0019_RemoveNthNodeFromEndOfList {

    // TODO: apna solution yahan likho
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return head;
    }

    public static void main(String[] args) {
        LC0019_RemoveNthNodeFromEndOfList sol = new LC0019_RemoveNthNodeFromEndOfList();
        Check.start("LC0019_RemoveNthNodeFromEndOfList");
        Check.eq("1->2->3->5", () -> sol.removeNthFromEnd(ListNode.of(1,2,3,4,5), 2));
        Check.eq("null", () -> sol.removeNthFromEnd(ListNode.of(1), 1));
        Check.eq("1", () -> sol.removeNthFromEnd(ListNode.of(1,2), 1));
        Check.eq("2", () -> sol.removeNthFromEnd(ListNode.of(1,2), 2));
        Check.summary();
    }
}
