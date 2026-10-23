package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #141 - Linked List Cycle  [Easy]
 * Link   : https://leetcode.com/problems/linked-list-cycle/
 * Pattern: Linked List
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it. There
 * is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer. Return true if there is a cycle in the linked list.
 * Otherwise, return false.
 *
 * Example 1:
 * <pre>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,2], pos = 0
 * Output: true
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: head = [1], pos = -1
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - The number of the nodes in the list is in the range [0, 10^4].
 *  - -10^5 <= Node.val <= 10^5
 *  - pos is -1 or a valid index in the linked-list.
 *  - Follow-up: can you solve it using O(1) (i.e. constant) memory?
 *
 * Hint (spoiler - pehle khud try karo): Floyd: slow 1 step, fast 2 step. Mil gaye to cycle. fast aur fast.next dono null-check.
 */
public class LC0141_LinkedListCycle {

    // TODO: apna solution yahan likho
    public boolean hasCycle(ListNode head) {
        return false;
    }

    public static void main(String[] args) {
        LC0141_LinkedListCycle sol = new LC0141_LinkedListCycle();
        ListNode a = ListNode.of(3,2,0,-4);
        a.next.next.next.next = a.next; // tail -> node index 1
        System.out.println(sol.hasCycle(a)); // true
        System.out.println(sol.hasCycle(ListNode.of(1))); // false
    }
}
