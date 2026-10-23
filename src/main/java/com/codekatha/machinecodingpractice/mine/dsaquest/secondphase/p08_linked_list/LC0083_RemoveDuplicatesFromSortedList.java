package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #83 - Remove Duplicates from Sorted List  [Easy]
 * Link   : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Pattern: Linked List
 *
 * Given the head of a sorted linked list, delete all duplicates such that each element appears
 * only once. Return the linked list sorted as well.
 *
 * Example 1:
 * <pre>
 * Input: head = [1,1,2]
 * Output: [1,2]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the list is in the range [0, 300].
 *  - -100 <= Node.val <= 100
 *  - The list is guaranteed to be sorted in ascending order.
 *
 * Hint (spoiler - pehle khud try karo): cur.val == cur.next.val ho to cur.next = cur.next.next, warna cur aage.
 */
public class LC0083_RemoveDuplicatesFromSortedList {

    // TODO: apna solution yahan likho
    public ListNode deleteDuplicates(ListNode head) {
        return head;
    }

    public static void main(String[] args) {
        LC0083_RemoveDuplicatesFromSortedList sol = new LC0083_RemoveDuplicatesFromSortedList();
        System.out.println(sol.deleteDuplicates(ListNode.of(1,1,2)));       // 1->2
        System.out.println(sol.deleteDuplicates(ListNode.of(1,1,2,3,3)));   // 1->2->3
    }
}
