package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p14_bit_math;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #1688 - Count of Matches in Tournament  [Easy]
 * Link   : https://leetcode.com/problems/count-of-matches-in-tournament/
 * Pattern: Bit Manipulation & Math
 *
 * You are given an integer n, the number of teams in a tournament that has strange rules: if
 * the current number of teams is even, each team gets paired with another team. A total of n /
 * 2 matches are played, and n / 2 teams advance to the next round. If the current number of
 * teams is odd, one team randomly advances in the tournament, and the rest gets paired. A
 * total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next
 * round. Return the number of matches played in the tournament until a winner is decided.
 *
 * Example 1:
 * <pre>
 * Input: n = 7
 * Output: 6
 * Explanation: Details of the tournament: 1st Round: Teams = 7, Matches = 3, and 4 teams advance. 2nd Round: Teams = 4, Matches = 2, and 2 teams advance. 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner. Total number of matches = 3 + 2 + 1 = 6.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 14
 * Output: 13
 * </pre>
 *
 * Constraints:
 *  - 1 <= n <= 200
 *
 * Hint (spoiler - pehle khud try karo): Simulation bhi chalega, par ek line ka insight: har match me exactly ek team out. Winner ke alawa sab out -> n - 1.
 */
public class LC1688_CountOfMatchesInTournament {

    // TODO: apna solution yahan likho
    public int numberOfMatches(int n) {
        return 0;
    }

    public static void main(String[] args) {
        LC1688_CountOfMatchesInTournament sol = new LC1688_CountOfMatchesInTournament();
        Check.start("LC1688_CountOfMatchesInTournament");
        Check.eq("6", () -> sol.numberOfMatches(7));
        Check.eq("13", () -> sol.numberOfMatches(14));
        Check.summary();
    }
}
