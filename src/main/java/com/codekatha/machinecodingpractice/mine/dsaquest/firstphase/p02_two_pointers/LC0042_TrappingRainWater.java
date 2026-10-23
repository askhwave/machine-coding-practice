package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p02_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #42 - Trapping Rain Water  [Hard]
 * Link   : https://leetcode.com/problems/trapping-rain-water/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is
 * 1, compute how much water it can trap after raining.
 *
 * Example 1:
 * <pre>
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * </pre>
 *
 * Constraints:
 *  - n == height.length
 *  - 1 <= n <= 2 * 10^4
 *  - 0 <= height[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Har bar pe paani = min(maxLeft, maxRight) - height. Pehle prefix/suffix max arrays, phir two-pointer se O(1) space.
 */
public class LC0042_TrappingRainWater {

    // TODO: apna solution yahan likho
    public int trap(int[] height) {
        return 0;
    }

    public static void main(String[] args) {
        LC0042_TrappingRainWater sol = new LC0042_TrappingRainWater();
        System.out.println(sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
        System.out.println(sol.trap(new int[]{4,2,0,3,2,5}));             // 9
    }
}
