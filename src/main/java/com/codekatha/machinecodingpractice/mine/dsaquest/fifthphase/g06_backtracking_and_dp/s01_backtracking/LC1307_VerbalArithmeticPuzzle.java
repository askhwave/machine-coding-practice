package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s01_backtracking;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1307 - Verbal Arithmetic Puzzle  [Difficulty: Hard | Atlassian: last seen older, frequency score 0.000]
 * Link   : https://leetcode.com/problems/verbal-arithmetic-puzzle/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Backtracking
 *
 * Given an equation, represented by words on the left side and the result on the right side.
 * You need to check if the equation is solvable under the following rules: Each character is
 * decoded as one digit (0 - 9). No two characters can map to the same digit. Each words[i] and
 * result are decoded as one number without leading zeros. Sum of numbers on the left side
 * (words) will equal to the number on the right side (result). Return true if the equation is
 * solvable, otherwise return false.
 *
 * Example 1:
 * <pre>
 * Input: words = ["SEND","MORE"], result = "MONEY"
 * Output: true
 * Explanation: Map 'S'-> 9, 'E'->5, 'N'->6, 'D'->7, 'M'->1, 'O'->0, 'R'->8, 'Y'->2. Such that: "SEND" + "MORE" = "MONEY", 9567 + 1085 = 10652.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: words = ["SIX","SEVEN","SEVEN"], result = "TWENTY"
 * Output: true
 * Explanation: Map 'S'-> 6, 'I'->5, 'X'->0, 'E'->8, 'V'->7, 'N'->2, 'T'->1, 'W'->3, 'Y'->4. Such that: "SIX" + "SEVEN" + "SEVEN" = "TWENTY", 650 + 68782 + 68782 = 138214.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: words = ["LEET","CODE"], result = "POINT"
 * Output: false
 * Explanation: There is no possible mapping to satisfy the equation, so we return false. Note that two different characters cannot map to the same digit.
 * </pre>
 *
 * Constraints:
 *  - 2 <= words.length <= 5
 *  - 1 <= words[i].length, result.length <= 7
 *  - words[i], result contain only uppercase English letters.
 *  - The number of different characters used in the expression is at most 10.
 *  - Leading zero sirf tab mana hai jab number ek se zyada digits ka ho (single letter word 0 ho sakta hai).
 *
 * Hint (spoiler - pehle khud try karo): Har letter ka WEIGHT nikalo: words me uski place values (+10^pos) aur result me (-10^pos) ka sum. Phir sab letters ke liye digit assign karte hue sum(weight * digit) == 0 dhundo (backtracking, used[] digits, leading letters pe 0 nahi). Column-wise carry wala version zyada tez hai par weights wala likhna aasan hai.
 */
public class LC1307_VerbalArithmeticPuzzle {

    // TODO: apna solution yahan likho
    public boolean isSolvable(String[] words, String result) {
        return false;
    }

    public static void main(String[] args) {
        LC1307_VerbalArithmeticPuzzle sol = new LC1307_VerbalArithmeticPuzzle();
        Check.start("LC1307_VerbalArithmeticPuzzle");
        Check.eq(true, () -> sol.isSolvable(new String[]{"SEND","MORE"}, "MONEY"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"SIX","SEVEN","SEVEN"}, "TWENTY"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"LEET","CODE"}, "POINT"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"THIS","IS","TOO"}, "FUNNY"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"A","B"}, "A"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"A","B"}, "CC"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"AA","BB"}, "CC"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"CBA","CBA"}, "CBA"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"ZZ","ZZ"}, "ZZZ"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"A","B","C"}, "D"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"AB","B"}, "AC"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"BB","CC"}, "AAA"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"ABCDEFG","H"}, "IJ"));
        Check.eq(true, () -> sol.isSolvable(new String[]{"ABCDE","FGHIJ"}, "HJBCE"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"ABCDE","FGHIJ"}, "ABCDE"));
        Check.eq(false, () -> sol.isSolvable(new String[]{"AB","CD","EF","GH","IJ"}, "AAAAA"));
        Check.summary();
    }
}
