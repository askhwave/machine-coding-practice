package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s02_dp;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1223 - Dice Roll Simulation  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.102]
 * Link   : https://leetcode.com/problems/dice-roll-simulation/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Dynamic Programming
 *
 * A die simulator generates a random number from 1 to 6 for each roll. You introduced a
 * constraint to the generator such that it cannot roll the number i more than rollMax[i]
 * (1-indexed) consecutive times. Given an array of integers rollMax and an integer n, return
 * the number of distinct sequences that can be obtained with exact n rolls. Since the answer
 * may be too large, return it modulo 10^9 + 7. Two sequences are considered different if at
 * least one element differs from each other.
 *
 * Example 1:
 * <pre>
 * Input: n = 2, rollMax = [1,1,2,2,2,3]
 * Output: 34
 * Explanation: There will be 2 rolls of die, if there are no constraints on the die, there are 6 * 6 = 36 possible combinations. In this case, looking at rollMax array, the numbers 1 and 2 appear at most once consecutively, therefore sequences (1,1) and (2,2) cannot occur, so the final answer is 36-2 = 34.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 2, rollMax = [1,1,1,1,1,1]
 * Output: 30
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: n = 3, rollMax = [1,1,1,2,2,3]
 * Output: 181
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 5000
 *  - rollMax.length == 6
 *  - 1 <= rollMax[i] <= 15
 *
 * Hint (spoiler - pehle khud try karo): State = (kitne rolls ho chuke, last face, us face ka current run length). Agle roll pe: same face to run + 1 (agar <= rollMax), alag face to run = 1. dp[face][run] ko roll-by-roll aage badhao; modulo har jod pe. 'Alag face' wale transitions ke liye total - faceSum[face] ka trick O(6*15) per roll deta hai.
 */
public class LC1223_DiceRollSimulation {

    // TODO: apna solution yahan likho
    public int dieSimulator(int n, int[] rollMax) {
        return 0;
    }

    public static void main(String[] args) {
        LC1223_DiceRollSimulation sol = new LC1223_DiceRollSimulation();
        Check.start("LC1223_DiceRollSimulation");
        Check.eq(34, () -> sol.dieSimulator(2, new int[]{1,1,2,2,2,3}));
        Check.eq(30, () -> sol.dieSimulator(2, new int[]{1,1,1,1,1,1}));
        Check.eq(181, () -> sol.dieSimulator(3, new int[]{1,1,1,2,2,3}));
        Check.eq(6, () -> sol.dieSimulator(1, new int[]{1,1,1,1,1,1}));
        Check.eq(6, () -> sol.dieSimulator(1, new int[]{15,15,15,15,15,15}));
        Check.eq(216, () -> sol.dieSimulator(3, new int[]{15,15,15,15,15,15}));
        Check.eq(1082, () -> sol.dieSimulator(4, new int[]{1,2,3,1,2,3}));
        Check.eq(7200, () -> sol.dieSimulator(5, new int[]{2,2,2,2,2,2}));
        Check.eq(93750, () -> sol.dieSimulator(7, new int[]{1,1,1,1,1,1}));
        Check.eq(1103, () -> sol.dieSimulator(4, new int[]{3,3,1,4,3,1}));
        Check.eq(6110, () -> sol.dieSimulator(5, new int[]{4,1,3,1,2,2}));
        Check.eq(38937, () -> sol.dieSimulator(6, new int[]{4,4,2,2,1,2}));
        Check.eq(199823, () -> sol.dieSimulator(7, new int[]{4,2,4,1,1,4}));
        Check.eq(776377743, () -> sol.dieSimulator(100, new int[]{1,1,1,1,1,1}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.eq(902184762, () -> sol.dieSimulator(1000, new int[]{15,15,15,15,15,15}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.eq(549903798, () -> sol.dieSimulator(5000, new int[]{15,15,15,15,15,15}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.eq(82766332, () -> sol.dieSimulator(5000, new int[]{1,1,1,1,1,1}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.eq(484393830, () -> sol.dieSimulator(2500, new int[]{1,2,3,4,5,6}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.eq(170465732, () -> sol.dieSimulator(4000, new int[]{5,7,11,2,14,3}));   // bada n: O(n * 6 * 15) DP chahiye, enumeration nahi
        Check.summary();
    }
}
