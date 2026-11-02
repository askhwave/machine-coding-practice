package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g04_linked_list.s01_reverse_merge_add;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #21 - Merge Two Sorted Lists  [LeetCode: Easy | Cheatsheet: Round 1 OA | Easy]
 * Link   : https://leetcode.com/problems/merge-two-sorted-lists/
 * Group  : Linked List  >  Reverse / Merge / Add
 * Revision: pehle bhi aa chuka hai (firstphase/set35_linked_list, secondphase/p08_linked_list). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into
 * one sorted list. The list should be made by splicing together the nodes of the first two
 * lists. Return the head of the merged linked list.
 *
 * Example 1:
 * <pre>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: list1 = [], list2 = []
 * Output: []
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in both lists is in the range [0, 50].
 *  - -100 <= Node.val <= 100
 *  - Both list1 and list2 are sorted in non-decreasing order.
 *
 * Hint (spoiler - pehle khud try karo): Dummy head + tail pointer: chhota node tail se jodte jao. Bacha hua list seedha attach.
 */
public class LC0021_MergeTwoSortedLists {

    // TODO: apna solution yahan likho
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return null;
    }

    public static void main(String[] args) {
        LC0021_MergeTwoSortedLists sol = new LC0021_MergeTwoSortedLists();
        Check.start("LC0021_MergeTwoSortedLists");
        Check.eq("1->1->2->3->4->4", () -> sol.mergeTwoLists(ListNode.of(1,2,4), ListNode.of(1,3,4)));
        Check.eq("0", () -> sol.mergeTwoLists(null, ListNode.of(0)));
        Check.summary();
    }
}
