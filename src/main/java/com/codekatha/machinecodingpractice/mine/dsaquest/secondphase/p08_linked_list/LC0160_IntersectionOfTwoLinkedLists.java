package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #160 - Intersection of Two Linked Lists  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Pattern: Linked List
 *
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two
 * lists intersect. If the two linked lists have no intersection at all, return null. The
 * linked lists must retain their original structure after the function returns.
 *
 * Example 1:
 * <pre>
 * Input: listA = [4,1,8,4,5], listB = [5,6,1,8,4,5] (they share the tail 8->4->5)
 * Output: Intersected at '8'
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: listA = [2,6,4], listB = [1,5]
 * Output: No intersection (null)
 * </pre>
 *
 * Constraints:
 *  - The number of nodes of listA is in the range m.
 *  - The number of nodes of listB is in the range n.
 *  - 1 <= m, n <= 3 * 10^4
 *  - 1 <= Node.val <= 10^5
 *  - Follow-up: could you write a solution that runs in O(m + n) time and use only O(1) memory?
 *
 * Hint (spoiler - pehle khud try karo): Do pointers: A khatam to B ke head par, B khatam to A ke head par. Dono ka total path barabar - milenge ya dono null.
 */
public class LC0160_IntersectionOfTwoLinkedLists {

    // TODO: apna solution yahan likho
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return null;
    }

    public static void main(String[] args) {
        LC0160_IntersectionOfTwoLinkedLists sol = new LC0160_IntersectionOfTwoLinkedLists();
        Check.start("LC0160_IntersectionOfTwoLinkedLists");
        ListNode common = ListNode.of(8,4,5);
        ListNode a = new ListNode(4, new ListNode(1, common));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(1, common)));
        ListNode r = sol.getIntersectionNode(a, b);
        Check.eq("8", () -> r == null ? "null" : "Intersected at " + r.val);
        Check.eq("null", () -> sol.getIntersectionNode(ListNode.of(2,6,4), ListNode.of(1,5)));
        Check.summary();
    }
}
