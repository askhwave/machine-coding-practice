package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set33_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #155 - Min Stack  [Medium]
 * Link   : https://leetcode.com/problems/min-stack/
 * Pattern: Stack & Queue
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant
 * time. Implement the MinStack class: MinStack() initializes the stack object. void push(int
 * val) pushes the element val onto the stack. void pop() removes the element on the top of the
 * stack. int top() gets the top element of the stack. int getMin() retrieves the minimum
 * element in the stack. You must implement a solution with O(1) time complexity for each
 * function.
 *
 * Example 1:
 * <pre>
 * Input: ["MinStack","push","push","push","getMin","pop","top","getMin"]
 *        [[],[-2],[0],[-3],[],[],[],[]]
 * Output: [null,null,null,null,-3,null,0,-2]
 * </pre>
 *
 * Constraints:
 *  - -2^31 <= val <= 2^31 - 1
 *  - Methods pop, top and getMin operations will always be called on non-empty stacks.
 *  - At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
 *
 * Hint (spoiler - pehle khud try karo): Har push ke saath 'ab tak ka min' bhi store karo (pair ya second stack).
 */
public class LC0155_MinStack {

    static class MinStack {
        // TODO: fields

        public MinStack() {
        }

        public void push(int val) {
        }

        public void pop() {
        }

        public int top() {
            return 0;
        }

        public int getMin() {
            return 0;
        }
    }

    public static void main(String[] args) {
        LC0155_MinStack sol = new LC0155_MinStack();
        Check.start("LC0155_MinStack");
        MinStack s = new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        Check.eq("-3", () -> s.getMin());
        s.pop();
        Check.eq("0", () -> s.top());
        Check.eq("-2", () -> s.getMin());
        Check.summary();
    }
}
