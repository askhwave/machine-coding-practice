package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1431 - Kids With the Greatest Number of Candies  [Easy]
 * Link   : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * There are n kids with candies. You are given an integer array candies, where each candies[i]
 * represents the number of candies the ith kid has, and an integer extraCandies, denoting the
 * number of extra candies that you have. Return a boolean array result of length n, where
 * result[i] is true if, after giving the ith kid all the extraCandies, they will have the
 * greatest number of candies among all the kids, or false otherwise. Note that multiple kids
 * can have the greatest number of candies.
 *
 * Example 1:
 * <pre>
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 * </pre>
 *
 * Constraints:
 *  - n == candies.length
 *  - 2 <= n <= 100
 *  - 1 <= candies[i] <= 100
 *  - 1 <= extraCandies <= 50
 *
 * Hint (spoiler - pehle khud try karo): Pehle global max nikalo, phir candies[i] + extra >= max.
 */
public class LC1431_KidsWithTheGreatestNumberOfCandies {

    // TODO: apna solution yahan likho
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC1431_KidsWithTheGreatestNumberOfCandies sol = new LC1431_KidsWithTheGreatestNumberOfCandies();
        Check.start("LC1431_KidsWithTheGreatestNumberOfCandies");
        Check.eq("[true, true, true, false, true]", () -> sol.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        Check.eq("[true, false, false, false, false]", () -> sol.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        Check.eq("[true, false, true]", () -> sol.kidsWithCandies(new int[]{12,1,12}, 10));
        Check.summary();
    }
}
