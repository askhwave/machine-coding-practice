package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s01_backtracking;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #22 - Generate Parentheses  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.004]
 * Link   : https://leetcode.com/problems/generate-parentheses/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Backtracking
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed
 * parentheses.
 *
 * Example 1:
 * <pre>
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 1
 * Output: ["()"]
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 8
 *
 * Hint (spoiler - pehle khud try karo): Backtracking with counts: open < n to '(' laga sakte ho; close < open to ')' laga sakte ho. Isse galat prefix kabhi banta hi nahi (pruning), baad me validity check nahi chahiye. Total = Catalan number.
 */
public class LC0022_GenerateParentheses {

    // TODO: apna solution yahan likho
    public List<String> generateParenthesis(int n) {
        return new ArrayList<>();
    }

    // test helper: expected count, sab distinct, har string balanced aur length 2n
    static boolean okParens(List<String> r, int n, int expected) {
        if (r.size() != expected || new HashSet<>(r).size() != expected) return false;
        for (String s : r) {
            if (s.length() != 2 * n) return false;
            int bal = 0;
            for (char c : s.toCharArray()) {
                bal += c == '(' ? 1 : -1;
                if (bal < 0) return false;
            }
            if (bal != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LC0022_GenerateParentheses sol = new LC0022_GenerateParentheses();
        Check.start("LC0022_GenerateParentheses");
        Check.sameElements("[()]", () -> sol.generateParenthesis(1));
        Check.sameElements("[(()), ()()]", () -> sol.generateParenthesis(2));
        Check.sameElements("[((())), (()()), (())(), ()(()), ()()()]", () -> sol.generateParenthesis(3));
        Check.sameElements("[(((()))), ((()())), ((())()), ((()))(), (()(())), (()()()), (()())(), (())(()), (())()(), ()((())), ()(()()), ()(())(), ()()(()), ()()()()]", () -> sol.generateParenthesis(4));
        Check.eq(true, () -> okParens(sol.generateParenthesis(5), 5, 42));   // n=5: 42 (Catalan) distinct, balanced strings
        Check.eq(true, () -> okParens(sol.generateParenthesis(6), 6, 132));   // n=6: 132 (Catalan) distinct, balanced strings
        Check.eq(true, () -> okParens(sol.generateParenthesis(7), 7, 429));   // n=7: 429 (Catalan) distinct, balanced strings
        Check.eq(true, () -> okParens(sol.generateParenthesis(8), 8, 1430));   // n=8: 1430 (Catalan) distinct, balanced strings
        Check.summary();
    }
}
