package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p08_linked_list;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import com.codekatha.machinecodingpractice.mine.dsaquest.common.ListNode;

/**
 * LeetCode #2 - Add Two Numbers  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/add-two-numbers/
 * Pattern: Linked List
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order, and each of their nodes contains a single digit. Add the two
 * numbers and return the sum as a linked list. You may assume the two numbers do not contain
 * any leading zero, except the number 0 itself.
 *
 * Example 1:
 * <pre>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in each linked list is in the range [1, 100].
 *  - 0 <= Node.val <= 9
 *  - It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * Hint (spoiler - pehle khud try karo): Dummy + carry. Loop tab tak jab tak l1, l2 ya carry me se kuch bacha ho. Last carry mat bhoolna.
 */
public class LC0002_AddTwoNumbers {

    // TODO: apna solution yahan likho
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String[] args) {
        LC0002_AddTwoNumbers sol = new LC0002_AddTwoNumbers();
        Check.start("LC0002_AddTwoNumbers");
        Check.eq("7->0->8", () -> sol.addTwoNumbers(ListNode.of(2,4,3), ListNode.of(5,6,4)));
        Check.eq("0", () -> sol.addTwoNumbers(ListNode.of(0), ListNode.of(0)));
        Check.eq("8->9->9->9->0->0->0->1", () -> sol.addTwoNumbers(ListNode.of(9,9,9,9,9,9,9), ListNode.of(9,9,9,9)));
        Check.summary();
    }
}
