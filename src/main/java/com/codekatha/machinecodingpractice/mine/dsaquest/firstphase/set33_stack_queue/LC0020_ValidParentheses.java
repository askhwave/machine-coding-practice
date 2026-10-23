package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set33_stack_queue;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #20 - Valid Parentheses  [Easy]
 * Link   : https://leetcode.com/problems/valid-parentheses/
 * Pattern: Stack & Queue
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
 * if the input string is valid. An input string is valid if: open brackets must be closed by
 * the same type of brackets, open brackets must be closed in the correct order, and every
 * close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * <pre>
 * Input: s = "()"
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = "()[]{}"
 * Output: true
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = "(]"
 * Output: false
 * </pre>
 *
 * Example 4:
 * <pre>
 * Input: s = "([])"
 * Output: true
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 10^4
 *  - s consists of parentheses only '()[]{}'.
 *
 * Hint (spoiler - pehle khud try karo): Opening par push, closing par stack top se match. End me stack khali hona chahiye. Empty stack par pop mat karo.
 */
public class LC0020_ValidParentheses {

    // TODO: apna solution yahan likho
    public boolean isValid(String s) {
        return false;
    }

    public static void main(String[] args) {
        LC0020_ValidParentheses sol = new LC0020_ValidParentheses();
        Check.start("LC0020_ValidParentheses");
        Check.eq("true", () -> sol.isValid("()"));
        Check.eq("true", () -> sol.isValid("()[]{}"));
        Check.eq("false", () -> sol.isValid("(]"));
        Check.eq("true", () -> sol.isValid("([])"));
        Check.eq("false", () -> sol.isValid("]"));
        Check.summary();
    }
}
