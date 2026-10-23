package com.codekatha.machinecodingpractice.mine.dsaquest.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #875 - Koko Eating Bananas  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/koko-eating-bananas/
 * Pattern: Binary Search (index + answer space)
 *
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours. Koko can decide her bananas-per-hour
 * eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that
 * pile. If the pile has less than k bananas, she eats all of them instead and will not eat any
 * more bananas during this hour. Return the minimum integer k such that she can eat all the
 * bananas within h hours.
 *
 * Example 1:
 * <pre>
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 * </pre>
 *
 * Constraints:
 *  - 1 <= piles.length <= 10^4
 *  - piles.length <= h <= 10^9
 *  - 1 <= piles[i] <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): Binary search on ANSWER (speed 1..max pile). canFinish(speed) monotonic hai. ceil(pile/speed) sum karo.
 */
public class LC0875_KokoEatingBananas {

    // TODO: apna solution yahan likho
    public int minEatingSpeed(int[] piles, int h) {
        return 0;
    }

    public static void main(String[] args) {
        LC0875_KokoEatingBananas sol = new LC0875_KokoEatingBananas();
        System.out.println(sol.minEatingSpeed(new int[]{3,6,7,11}, 8));          // 4
        System.out.println(sol.minEatingSpeed(new int[]{30,11,23,4,20}, 5));     // 30
        System.out.println(sol.minEatingSpeed(new int[]{30,11,23,4,20}, 6));     // 23
    }
}
