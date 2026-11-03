package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set11_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #42 - Trapping Rain Water  [Hard]
 * Link   : https://leetcode.com/problems/trapping-rain-water/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is
 * 1, compute how much water it can trap after raining.
 * <p>
 * Example 1:
 * <pre>
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * </pre>
 * <p>
 * Constraints:
 * - n == height.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= height[i] <= 10^5
 * <p>
 * Hint (spoiler - pehle khud try karo): Har bar pe paani = min(maxLeft, maxRight) - height. Pehle prefix/suffix max arrays, phir two-pointer se O(1) space.
 */
public class LC0042_TrappingRainWater {

    // TODO: apna solution yahan likho
    public int trap(int[] height) {
        int n = height.length;

        if (n == 0 || n == 1) {
            return 0;
        }
        int lmax = 0;
        int rmax = 0;
//4, 2, 0, 3, 2, 5
        int l = 0;
        int r = n - 1;
        int ans = 0;
        while (l < r) {
            lmax = Math.max(lmax ,height[l]);
            rmax = Math.max(rmax,height[r]);

            if (lmax < rmax) {
                ans += lmax-height[l];
                l++;
            } else {
                ans += rmax-height[r];
                r--;
            }
        }
        return ans;
    }

    public int trapWithONspace(int[] height) {
        //[4,2,0,3,2,5]
        int n = height.length;

        if (n == 0 || n == 1) {
            return 0;
        }
        int[] maxLeftArray = new int[n];

        maxLeftArray[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeftArray[i] = Math.max(maxLeftArray[i - 1], height[i]);
        }

        int[] maxRightArray = new int[n];
        maxRightArray[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRightArray[i] = Math.max(maxRightArray[i + 1], height[i]);
        }

        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += Math.min(maxRightArray[i], maxLeftArray[i]) - height[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        LC0042_TrappingRainWater sol = new LC0042_TrappingRainWater();
        Check.start("LC0042_TrappingRainWater");
        Check.eq("6", () -> sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Check.eq("9", () -> sol.trap(new int[]{4, 2, 0, 3, 2, 5}));
        Check.summary();
    }
}
