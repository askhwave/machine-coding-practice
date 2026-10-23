package com.codekatha.machinecodingpractice.mine.dsaquest.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #142 - Linked List Cycle II  [Medium]
 * Link   : https://leetcode.com/problems/linked-list-cycle-ii/
 * Pattern: Linked List
 *
 * Given the head of a linked list, return the node where the cycle begins. If there is no
 * cycle, return null. There is a cycle in a linked list if there is some node in the list that
 * can be reached again by continuously following the next pointer. Do not modify the linked
 * list.
 *
 * Example 1:
 * <pre>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,2], pos = 0
 * Output: tail connects to node index 0
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: head = [1], pos = -1
 * Output: no cycle
 * </pre>
 *
 * Constraints:
 *  - The number of the nodes in the list is in the range [0, 10^4].
 *  - -10^5 <= Node.val <= 10^5
 *  - pos is -1 or a valid index in the linked-list.
 *  - Follow-up: can you solve it using O(1) (i.e. constant) memory?
 *
 * Hint (spoiler - pehle khud try karo): Floyd phase 1: meeting point. Phase 2: ek pointer head se, ek meeting point se, dono 1-1 step -> jahan milen wahi cycle start. (Math prove karna try karo.)
 */
public class LC0142_LinkedListCycleII {

    // TODO: apna solution yahan likho
    public ListNode detectCycle(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        LC0142_LinkedListCycleII sol = new LC0142_LinkedListCycleII();
        ListNode a = ListNode.of(3,2,0,-4);
        a.next.next.next.next = a.next; // tail -> node index 1 (val 2)
        ListNode start = sol.detectCycle(a);
        System.out.println(start == null ? "no cycle" : "cycle starts at val " + start.val); // 2
    }
}
