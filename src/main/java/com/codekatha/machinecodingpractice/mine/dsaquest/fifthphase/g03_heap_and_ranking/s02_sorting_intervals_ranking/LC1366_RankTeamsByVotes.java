package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g03_heap_and_ranking.s02_sorting_intervals_ranking;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1366 - Rank Teams by Votes  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.072]
 * Link   : https://leetcode.com/problems/rank-teams-by-votes/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Heap, Sorting & Ranking  >  Sorting, Intervals & Ranking
 *
 * In a special ranking system, each voter gives a rank from highest to lowest to all teams
 * participating in the competition. The ordering of teams is decided by who received the most
 * position-one votes. If two or more teams tie in the first position, we consider the second
 * position to resolve the conflict, if they tie again, we continue this process until the ties
 * are resolved. If two or more teams are still tied after considering all positions, we rank
 * them alphabetically based on their team letter. You are given an array of strings votes
 * which is the votes of all voters in the ranking systems. Sort all teams according to the
 * ranking system described above. Return a string of all teams sorted by the ranking system.
 *
 * Example 1:
 * <pre>
 * Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
 * Output: "ACB"
 * Explanation: Team A was ranked first place by 5 voters. No other team was voted as first place, so team A is the first team. Team B was ranked second by 2 voters and ranked third by 3 voters. Team C was ranked second by 3 voters and ranked third by 2 voters. As most of the voters ranked C second, team C is the second team, and team B is the third.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: votes = ["WXYZ","XYZW"]
 * Output: "XWYZ"
 * Explanation: X is the winner due to the tie-breaking rule. X has the same votes as W for the first position, but X has one vote in the second position, while W does not have any votes in the second position.
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
 * Output: "ZMNAGUEDSJYLBOPHRQICWFXTVK"
 * Explanation: Only one voter, so their votes are used for the ranking.
 * </pre>
 *
 * Constraints:
 *  - 1 <= votes.length <= 1000
 *  - 1 <= votes[i].length <= 26
 *  - votes[i].length == votes[j].length for 0 <= i, j < votes.length.
 *  - votes[i][j] is an English uppercase letter.
 *  - votes[i] has unique characters.
 *  - All characters of votes[i] are present in votes[j] for all 0 <= i, j < votes.length.
 *
 * Hint (spoiler - pehle khud try karo): int[26][positions] count matrix: count[team][pos] = us position pe kitne votes. Teams ko comparator se sort karo: pos 0 se aage tak jis ka count zyada wo aage; sab barabar to letter ascending.
 */
public class LC1366_RankTeamsByVotes {

    // TODO: apna solution yahan likho
    public String rankTeams(String[] votes) {
        return "";
    }

    public static void main(String[] args) {
        LC1366_RankTeamsByVotes sol = new LC1366_RankTeamsByVotes();
        Check.start("LC1366_RankTeamsByVotes");
        Check.eq("ACB", () -> sol.rankTeams(new String[]{"ABC","ACB","ABC","ACB","ACB"}));
        Check.eq("XWYZ", () -> sol.rankTeams(new String[]{"WXYZ","XYZW"}));
        Check.eq("ZMNAGUEDSJYLBOPHRQICWFXTVK", () -> sol.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
        Check.eq("A", () -> sol.rankTeams(new String[]{"A"}));
        Check.eq("ABC", () -> sol.rankTeams(new String[]{"BCA","CAB","CBA","ABC","ACB","BAC"}));
        Check.eq("ACB", () -> sol.rankTeams(new String[]{"ABC","CBA"}));
        Check.eq("M", () -> sol.rankTeams(new String[]{"M","M","M","M"}));   // poora tie: alphabetical
        Check.eq("ACB", () -> sol.rankTeams(new String[]{"ACB","BCA","ACB","ABC","CAB"}));
        Check.eq("DBCA", () -> sol.rankTeams(new String[]{"DACB","BCAD","DBAC","BCDA","CABD","DBCA"}));
        Check.eq("EBDCA", () -> sol.rankTeams(new String[]{"EACBD","BCDEA","DEBCA","BDCAE","ECBAD","EDCAB","EBCAD","ECABD"}));
        Check.eq("BAECDF", () -> sol.rankTeams(new String[]{"EFCDAB","BAFCED","BEFCDA","BDCEFA","BECFAD","ACEDFB","CBAEDF","ACDFBE","AEBDCF","DECBAF"}));
        Check.eq("ECDBFA", () -> sol.rankTeams(new String[]{"CDEFAB","ECDABF","EBFACD"}));
        Check.eq("CGUXNBWRAHKFETLZPQYISDVJOM", () -> sol.rankTeams(new String[]{"UBHEZWYSKQJCAFNILMPRGTODXV","CNAFKPLBQRSUZOYTDHXIEWJMVG","XWNTLQEIZVGDKORABMSUYHCJPF","GRCKBFPDLIZJWONHVXYSUAEMQT"}));
        Check.eq("BA", () -> sol.rankTeams(new String[]{"BA","AB","BA","BA","BA","AB","BA"}));
        Check.eq("EHDFABGC", () -> sol.rankTeams(new String[]{"HBCFGADE","EHFGADCB","DCHGABEF","EHACGDBF","FDHECAGB","GCEFDHBA","AGDBFCHE","BADGECFH","EBHFCAGD","DABHFGCE","DHAFECGB","HDEGBFCA","CDEHABFG","HGCEDBAF","DBCFAEGH","BDCGEAFH","AGHDCEFB","DFCGHBAE","EAFHBDCG","EDABHGFC","FHCBAGDE","DHBEGFAC","EHACFBGD","BCGHDAEF","FEDAHCGB","EDHCGABF","EACGDFHB","GHFACBDE","AEBGFDCH","FHEBDGAC","FEACGBDH","HDBCEGAF","EFGHABCD","HCADGFEB","CEFAHDBG","EGAFCHBD","EFBADGCH","GHAFEBCD","EBCHDAFG","HFADEBCG"}));
        Check.summary();
    }
}
