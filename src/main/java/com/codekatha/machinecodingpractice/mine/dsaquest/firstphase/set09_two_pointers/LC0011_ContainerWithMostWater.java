package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set09_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #11 - Container With Most Water  [Medium]
 * Link   : https://leetcode.com/problems/container-with-most-water/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * You are given an integer array height of length n. There are n vertical lines drawn such
 * that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that
 * together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store. Notice that you may not slant the
 * container.
 * <p>
 * Example 1:
 * <pre>
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: height = [1,1]
 * Output: 1
 * </pre>
 * <p>
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 * <p>
 * Hint (spoiler - pehle khud try karo): Dono end se shuru; chhoti deewar hi bottleneck hai, wahi pointer andar badhao. Kyun? Soch ke dekho.
 */
public class LC0011_ContainerWithMostWater {

    // TODO: apna solution yahan likho
    public int maxArea(int[] height) {
        //height = [1,8,6,2,5,4,8,3,7]

        int i = 0;
        int j = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i <= j) {

            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(area, maxArea);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        LC0011_ContainerWithMostWater sol = new LC0011_ContainerWithMostWater();
        Check.start("LC0011_ContainerWithMostWater");
        Check.eq("49", () -> sol.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Check.eq("1", () -> sol.maxArea(new int[]{1, 1}));
        Check.summary();
    }
}
