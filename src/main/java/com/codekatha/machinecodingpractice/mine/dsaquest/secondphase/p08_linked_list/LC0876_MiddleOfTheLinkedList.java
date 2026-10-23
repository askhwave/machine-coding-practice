package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #876 - Middle of the Linked List  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/middle-of-the-linked-list/
 * Pattern: Linked List
 *
 * Given the head of a singly linked list, return the middle node of the linked list. If there
 * are two middle nodes, return the second middle node.
 *
 * Example 1:
 * <pre>
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the list is in the range [1, 100].
 *  - 1 <= Node.val <= 100
 *
 * Hint (spoiler - pehle khud try karo): Slow 1 step, fast 2 step. Fast end par pahunche to slow middle par. (Fast-slow ka warm-up.)
 */
public class LC0876_MiddleOfTheLinkedList {

    // TODO: apna solution yahan likho
    public ListNode middleNode(ListNode head) {
        return head;
    }

    public static void main(String[] args) {
        LC0876_MiddleOfTheLinkedList sol = new LC0876_MiddleOfTheLinkedList();
        Check.start("LC0876_MiddleOfTheLinkedList");
        Check.eq("3->4->5", () -> sol.middleNode(ListNode.of(1,2,3,4,5)));
        Check.eq("4->5->6", () -> sol.middleNode(ListNode.of(1,2,3,4,5,6)));
        Check.summary();
    }
}
