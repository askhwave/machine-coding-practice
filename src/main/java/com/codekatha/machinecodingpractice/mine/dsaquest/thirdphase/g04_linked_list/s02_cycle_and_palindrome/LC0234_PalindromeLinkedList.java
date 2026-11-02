package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g04_linked_list.s02_cycle_and_palindrome;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #234 - Palindrome Linked List  [LeetCode: Easy | Cheatsheet: Round 2 F2F | Easy]
 * Link   : https://leetcode.com/problems/palindrome-linked-list/
 * Group  : Linked List  >  Cycle & Palindrome (fast-slow)
 * Revision: pehle bhi aa chuka hai (secondphase/p08_linked_list). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * Given the head of a singly linked list, return true if it is a palindrome or false
 * otherwise.
 *
 * Example 1:
 * <pre>
 * Input: head = [1,2,2,1]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: head = [1,2]
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - The number of nodes in the list is in the range [1, 10^5].
 *  - 0 <= Node.val <= 9
 *  - Follow-up: Could you do it in O(n) time and O(1) space?
 *
 * Hint (spoiler - pehle khud try karo): Middle dhundo (#876), doosra half reverse karo (#206), dono half compare. Ek hi problem me teen patterns.
 */
public class LC0234_PalindromeLinkedList {

    // TODO: apna solution yahan likho
    public boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args) {
        LC0234_PalindromeLinkedList sol = new LC0234_PalindromeLinkedList();
        Check.start("LC0234_PalindromeLinkedList");
        Check.eq("true", () -> sol.isPalindrome(ListNode.of(1,2,2,1)));
        Check.eq("false", () -> sol.isPalindrome(ListNode.of(1,2)));
        Check.eq("true", () -> sol.isPalindrome(ListNode.of(1,2,3,2,1)));
        Check.summary();
    }
}
