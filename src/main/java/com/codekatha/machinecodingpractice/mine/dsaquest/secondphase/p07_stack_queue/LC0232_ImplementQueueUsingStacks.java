package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p07_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #232 - Implement Queue using Stacks  [Easy]
 * Link   : https://leetcode.com/problems/implement-queue-using-stacks/
 * Pattern: Stack & Queue
 *
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue
 * should support all the functions of a normal queue (push, peek, pop, and empty). Implement
 * the MyQueue class: void push(int x) pushes element x to the back of the queue. int pop()
 * removes the element from the front of the queue and returns it. int peek() returns the
 * element at the front of the queue. boolean empty() returns true if the queue is empty, false
 * otherwise.
 *
 * Example 1:
 * <pre>
 * Input: ["MyQueue","push","push","peek","pop","empty"]
 *        [[],[1],[2],[],[],[]]
 * Output: [null,null,null,1,1,false]
 * </pre>
 *
 * Constraints:
 *  - 1 <= x <= 9
 *  - At most 100 calls will be made to push, pop, peek, and empty.
 *  - All the calls to pop and peek are valid.
 *  - Follow-up: amortized O(1) time per operation - n operations total take O(n) time.
 *
 * Hint (spoiler - pehle khud try karo): Do stacks: in aur out. out khali ho tabhi in se transfer - tab amortized O(1) milta hai.
 */
public class LC0232_ImplementQueueUsingStacks {

    static class MyQueue {
        // TODO: two stacks (Deque<Integer> as Stack)

        public MyQueue() {
        }

        public void push(int x) {
        }

        public int pop() {
            return 0;
        }

        public int peek() {
            return 0;
        }

        public boolean empty() {
            return true;
        }
    }

    public static void main(String[] args) {
        LC0232_ImplementQueueUsingStacks sol = new LC0232_ImplementQueueUsingStacks();
        Check.start("LC0232_ImplementQueueUsingStacks");
        MyQueue q = new MyQueue();
        q.push(1); q.push(2);
        Check.eq("1", () -> q.peek());
        Check.eq("1", () -> q.pop());
        Check.eq("false", () -> q.empty());
        Check.summary();
    }
}
