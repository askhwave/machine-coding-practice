package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s01_greedy_and_scans;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #860 - Lemonade Change  [Difficulty: Easy | Atlassian: last seen 1 year, frequency score 0.397]
 * Link   : https://leetcode.com/problems/lemonade-change/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Greedy & Two-pass Scans
 *
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from
 * you and order one at a time (in the order specified by bills). Each customer will only buy
 * one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change
 * to each customer so that the net transaction is that the customer pays $5. Note that you do
 * not have any change in hand at first. Given an integer array bills where bills[i] is the
 * bill the ith customer pays, return true if you can provide every customer with the correct
 * change, or false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: bills = [5,5,5,10,20]
 * Output: true
 * Explanation: From the first 3 customers, we collect three $5 bills in order. From the fourth customer, we collect a $10 bill and give back a $5. From the fifth customer, we give a $10 bill and a $5 bill. Since all customers got correct change, we output true.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: bills = [5,5,10,10,20]
 * Output: false
 * Explanation: From the first two customers in order, we collect two $5 bills. For the next two customers in order, we collect a $10 bill and give back a $5 bill. For the last customer, we can not give the change of $15 back because we only have two $10 bills. Since not every customer received the correct change, the answer is false.
 * </pre>
 *
 * Constraints:
 *  - 1 <= bills.length <= 10^5
 *  - bills[i] is either 5, 10, or 20.
 *
 * Hint (spoiler - pehle khud try karo): Sirf do cheezein count karo: fives aur tens ($20 kabhi change me nahi dena padta). $20 pe pehle 10+5 do (kyunki 5 zyada kaam aate hain), na ho to 5+5+5. Greedy sahi hai kyunki $5 ka use $10 se zyada flexible hai.
 */
public class LC0860_LemonadeChange {

    // TODO: apna solution yahan likho
    public boolean lemonadeChange(int[] bills) {
        return false;
    }

    public static void main(String[] args) {
        LC0860_LemonadeChange sol = new LC0860_LemonadeChange();
        Check.start("LC0860_LemonadeChange");
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,5,10,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,5,10,10,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,5,5,5,20,20,5,5,20,5}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,10,10,5,20,5,10,5,5}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,10,5,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,5,5,20,10}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,10,5,20}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,5,5,10,20,10}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,5,5,5,10,20,10,10}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,5,5,10,20,10,20}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,5,5,10,5,20,10,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,10,10,20,10,20,10,5,20,10,20,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,5,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,20,5,5,5}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,10,5,5,5,5,5,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,20,10,5,5,5,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,10,5,20,5,5,10,20,10,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,5,5,5,20,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,5,5,5,5,10,10,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,20,5,20,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,10,10,5,5,10,5,10,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,10,10,5,5,5,20,10,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,5,5,5,10,10,10,10,5}));
        Check.eq(true, () -> sol.lemonadeChange(new int[]{5,10,5,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,20,10,5,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,20,10,10,10,5,10,20,20,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,20,5,5,20,10,5,5,20,10,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,20,10,10,5,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,20,10,5,5,10,10,20,5,20,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,10,10,5,10,20,20,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,5,20,10,20,5,10,20,5,10,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,5,20,5,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,20,20,5,10,10,10,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,5,10,5,20,10,5,10,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,5,5,10,10,10,10,5,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{5,20,5,20,10,5,20,5,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,5,5,5,10,10,5,10,5,20}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,10,10,5,5,5}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{20,10,5,10,10,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{20,5,5,5,5,10,10,20,10}));
        Check.eq(false, () -> sol.lemonadeChange(new int[]{10,20,10,5,5,5,5}));
        Check.summary();
    }
}
