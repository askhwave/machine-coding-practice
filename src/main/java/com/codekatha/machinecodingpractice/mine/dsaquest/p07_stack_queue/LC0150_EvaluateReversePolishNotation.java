package com.codekatha.machinecodingpractice.mine.dsaquest.p07_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #150 - Evaluate Reverse Polish Notation  [Medium]
 * Link   : https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Pattern: Stack & Queue
 *
 * You are given an array of strings tokens that represents an arithmetic expression in a
 * Reverse Polish Notation. Evaluate the expression. Return an integer that represents the
 * value of the expression. Note that the valid operators are '+', '-', '*', and '/'. Each
 * operand may be an integer or another expression. The division between two integers always
 * truncates toward zero. There will not be any division by zero. The answer and all the
 * intermediate calculations can be represented in a 32-bit integer.
 *
 * Example 1:
 * <pre>
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * </pre>
 *
 * Constraints:
 *  - 1 <= tokens.length <= 10^4
 *  - tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 *
 * Hint (spoiler - pehle khud try karo): Number push; operator aaye to b = pop(), a = pop(), push(a op b). Order (a-b, a/b) ka dhyaan! String compare equals() se.
 */
public class LC0150_EvaluateReversePolishNotation {

    // TODO: apna solution yahan likho
    public int evalRPN(String[] tokens) {
        return 0;
    }

    public static void main(String[] args) {
        LC0150_EvaluateReversePolishNotation sol = new LC0150_EvaluateReversePolishNotation();
        System.out.println(sol.evalRPN(new String[]{"2","1","+","3","*"}));        // 9
        System.out.println(sol.evalRPN(new String[]{"4","13","5","/","+"}));      // 6
        System.out.println(sol.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // 22
    }
}
