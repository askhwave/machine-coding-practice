package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g05_stack_parsing.s01_stack_parsing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #227 - Basic Calculator II  [Difficulty: Medium | Atlassian: last seen 2 years, frequency score 0.012]
 * Link   : https://leetcode.com/problems/basic-calculator-ii/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Stack & Parsing  >  Decode & Calculate
 *
 * Given a string s which represents an expression, evaluate this expression and return its
 * value. The integer division should truncate toward zero. You may assume that the given
 * expression is always valid. All intermediate results will be in the range of [-2^31, 2^31 -
 * 1]. Note: You are not allowed to use any built-in function which evaluates strings as
 * mathematical expressions, such as eval().
 *
 * Example 1:
 * <pre>
 * Input: s = "3+2*2"
 * Output: 7
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: s = " 3/2 "
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: s = " 3+5 / 2 "
 * Output: 5
 * </pre>
 *
 * Constraints:
 *  - 1 <= s.length <= 3 * 10^5
 *  - s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
 *  - s represents a valid expression.
 *  - All the integers in the expression are non-negative integers in the range [0, 2^31 - 1].
 *  - The answer is guaranteed to fit in a 32-bit integer.
 *
 * Hint (spoiler - pehle khud try karo): Parentheses nahi hain to ek pass: current number banao, jab operator (ya end) aaye to PICHHLE operator se resolve: + / - par last term ko total me jod do aur naya term shuru; * / par last term ko turant update (isliye last term alag track karo). Spaces skip.
 */
public class LC0227_BasicCalculatorII {

    // TODO: apna solution yahan likho
    public int calculate(String s) {
        return 0;
    }

    public static void main(String[] args) {
        LC0227_BasicCalculatorII sol = new LC0227_BasicCalculatorII();
        Check.start("LC0227_BasicCalculatorII");
        Check.eq(7, () -> sol.calculate("3+2*2"));
        Check.eq(1, () -> sol.calculate(" 3/2 "));
        Check.eq(5, () -> sol.calculate(" 3+5 / 2 "));
        Check.eq(42, () -> sol.calculate("42"));
        Check.eq(1, () -> sol.calculate("1-1+1"));
        Check.eq(13, () -> sol.calculate("14-3/2"));
        Check.eq(2147483647, () -> sol.calculate("2147483647"));
        Check.eq(-2147483647, () -> sol.calculate("0-2147483647"));
        Check.eq(5, () -> sol.calculate("1+2*3-4/2"));
        Check.eq(36, () -> sol.calculate("  12  *  3  "));
        Check.eq(25000000, () -> sol.calculate("100000000/1/2/2"));
        Check.eq(2147441940, () -> sol.calculate("46341*46340"));
        Check.eq(7, () -> sol.calculate("0*5+7"));
        Check.eq(7, () -> sol.calculate("7-0/3"));
        Check.eq(-1, () -> sol.calculate("1-5/2"));
        Check.eq(6, () -> sol.calculate("8/3*3"));
        Check.eq(2, () -> sol.calculate("2*3*4/6+1-9/3"));
        Check.eq(1, () -> sol.calculate("5-3-1"));
        Check.eq(2, () -> sol.calculate("100/10/5"));
        Check.eq(0, () -> sol.calculate(" 40/  25/  5  4  "));
        Check.eq(1803, () -> sol.calculate(" 28  *6 3+ 4  0- 72/5  3 "));
        Check.eq(53, () -> sol.calculate(" 6  2+ 89  -98  +  21/84 "));
        Check.eq(103, () -> sol.calculate("57+  4 6"));
        Check.eq(488, () -> sol.calculate(" 7  6/14  /  5 1-82+  38*1 5 "));
        Check.eq(3188, () -> sol.calculate("8 1 *4  0 -  52  "));
        Check.eq(1173, () -> sol.calculate(" 7 1 *14 +90 -6 7/  88  + 8  9 "));
        Check.eq(216, () -> sol.calculate("7  1 +8 6  +34+  2  5"));
        Check.eq(-2772, () -> sol.calculate(" 3  3  -  55*  51  + 8  6/ 5 7 - 6  4  /  57"));
        Check.eq(-79, () -> sol.calculate("5 4 -5  3 -80"));
        Check.eq(-76, () -> sol.calculate("1  4  -  90+ 28  /9/10  -6 2/67"));
        Check.eq(2181, () -> sol.calculate("8  1  *  2  7+ 5 +6 2 -7 3"));
        Check.eq(28, () -> sol.calculate("7 8 -  36 +  29+  5  0-9  3"));
        Check.eq(29, () -> sol.calculate("64-35 "));
        Check.eq(150000, () -> sol.calculate("1+".repeat(149999) + "1"));   // 3 * 10^5 length string: O(n) chahiye
        Check.summary();
    }
}
