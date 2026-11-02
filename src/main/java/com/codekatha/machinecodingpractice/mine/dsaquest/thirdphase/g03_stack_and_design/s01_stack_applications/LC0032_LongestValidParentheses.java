package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g03_stack_and_design.s01_stack_applications;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #32 - Longest Valid Parentheses  [LeetCode: Hard | Cheatsheet: Round 2 F2F | Hard]
 * Link   : https://leetcode.com/problems/longest-valid-parentheses/
 * Group  : Stack & Design  >  Stack Applications
 *
 * Given a string containing just the characters '(' and ')', return the length of the longest
 * valid (well-formed) parentheses substring.
 *
 * Example 1:
 * <pre>
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = ""
 * Output: 0
 * </pre>
 *
 * Constraints:
 *  - 0 <= s.length <= 3 * 10^4
 *  - s[i] is '(', or ')'.
 *
 * Hint (spoiler - pehle khud try karo): Stack of indices: -1 se shuru; ')' pe pop, stack khaali ho to current index base bana do, warna length = i - stack.peek().
 */
public class LC0032_LongestValidParentheses {

    // TODO: apna solution yahan likho
    public int longestValidParentheses(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0032_LongestValidParentheses sol = new LC0032_LongestValidParentheses();
        Check.start("LC0032_LongestValidParentheses");
        Check.eq(2, () -> sol.longestValidParentheses("(()"));
        Check.eq(4, () -> sol.longestValidParentheses(")()())"));
        Check.eq(0, () -> sol.longestValidParentheses(""));
        Check.eq(2, () -> sol.longestValidParentheses("()(()"));
        Check.eq(6, () -> sol.longestValidParentheses("()(())"));
        Check.eq(0, () -> sol.longestValidParentheses("(((("));
        Check.eq(0, () -> sol.longestValidParentheses("))))"));
        Check.eq(4, () -> sol.longestValidParentheses("(()()"));
        Check.eq(4, () -> sol.longestValidParentheses(")()())()()("));
        Check.eq(4, () -> sol.longestValidParentheses("()()"));
        Check.eq(4, () -> sol.longestValidParentheses("(()))())("));
        Check.eq(6, () -> sol.longestValidParentheses("((()))"));
        Check.eq(2, () -> sol.longestValidParentheses("()"));
        Check.eq(0, () -> sol.longestValidParentheses(")("));
        Check.eq(2, () -> sol.longestValidParentheses("(()(((()"));
        Check.eq(30000, () -> sol.longestValidParentheses("()".repeat(15000))); // big input
        Check.summary();
    }
}
