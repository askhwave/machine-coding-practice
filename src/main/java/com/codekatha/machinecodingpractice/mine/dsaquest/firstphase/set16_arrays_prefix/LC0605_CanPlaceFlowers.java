package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set16_arrays_prefix;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #605 - Can Place Flowers  [Easy]
 * Link   : https://leetcode.com/problems/can-place-flowers/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * You have a long flowerbed in which some of the plots are planted, and some are not. However,
 * flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing 0's
 * and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new
 * flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 *
 * Example 1:
 * <pre>
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 * </pre>
 *
 * Constraints:
 *  - 1 <= flowerbed.length <= 2 * 10^4
 *  - flowerbed[i] is 0 or 1.
 *  - There are no two adjacent flowers in flowerbed.
 *  - 0 <= n <= flowerbed.length
 *
 * Hint (spoiler - pehle khud try karo): Left-to-right greedy: i, i-1, i+1 teeno 0 hon to plant kar do. Edges ka dhyaan.
 */
public class LC0605_CanPlaceFlowers {

    // TODO: apna solution yahan likho
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return false;
    }

    public static void main(String[] args) {
        LC0605_CanPlaceFlowers sol = new LC0605_CanPlaceFlowers();
        Check.start("LC0605_CanPlaceFlowers");
        Check.eq("true", () -> sol.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        Check.eq("false", () -> sol.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        Check.eq("true", () -> sol.canPlaceFlowers(new int[]{0}, 1));
        Check.summary();
    }
}
