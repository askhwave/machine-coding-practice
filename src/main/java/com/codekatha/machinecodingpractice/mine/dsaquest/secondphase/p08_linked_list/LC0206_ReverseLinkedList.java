package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #206 - Reverse Linked List  [Easy]
 * Link   : https://leetcode.com/problems/reverse-linked-list/
 * Pattern: Linked List
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * <pre>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,2]
 * Output: [2,1]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: head = []
 * Output: []
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the list is the range [0, 5000].
 *  - -5000 <= Node.val <= 5000
 *  - Follow-up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * Hint (spoiler - pehle khud try karo): prev, cur, next teen pointer. Pehle next save karo, phir link ulto. Dono iterative aur recursive likho.
 */
public class LC0206_ReverseLinkedList {

    // TODO: apna solution yahan likho
    public ListNode reverseList(ListNode head) {
        return head;
    }

    public static void main(String[] args) {
        LC0206_ReverseLinkedList sol = new LC0206_ReverseLinkedList();
        System.out.println(sol.reverseList(ListNode.of(1,2,3,4,5))); // 5->4->3->2->1
        System.out.println(sol.reverseList(ListNode.of(1,2)));       // 2->1
        System.out.println(sol.reverseList(null));                    // null
    }
}
