package com.codekatha.machinecodingpractice.mine.dsaquest.common;

/** Singly linked list node (LeetCode style). Helper: ListNode.of(1,2,3) -> 1->2->3 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode of(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        int guard = 0;
        while (cur != null && guard++ < 1000) {
            sb.append(cur.val);
            if (cur.next != null) sb.append("->");
            cur = cur.next;
        }
        if (guard >= 1000) sb.append("...(cycle?)");
        return sb.toString();
    }
}
