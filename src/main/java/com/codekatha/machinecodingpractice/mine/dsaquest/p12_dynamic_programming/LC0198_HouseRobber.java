package com.codekatha.machinecodingpractice.mine.dsaquest.p12_dynamic_programming;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #198 - House Robber  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/house-robber/
 * Pattern: Dynamic Programming
 *
 * You are a professional robber planning to rob houses along a street. Each house has a
 * certain amount of money stashed, the only constraint stopping you from robbing each of them
 * is that adjacent houses have security systems connected and it will automatically contact
 * the police if two adjacent houses were broken into on the same night. Given an integer array
 * nums representing the amount of money of each house, return the maximum amount of money you
 * can rob tonight without alerting the police.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 100
 *  - 0 <= nums[i] <= 400
 *
 * Hint (spoiler - pehle khud try karo): Har ghar par choice: lun ya chhodun. dp[i] = max(dp[i-1], dp[i-2] + nums[i]). Do variables kaafi.
 */
public class LC0198_HouseRobber {

    // TODO: apna solution yahan likho
    public int rob(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0198_HouseRobber sol = new LC0198_HouseRobber();
        System.out.println(sol.rob(new int[]{1,2,3,1}));     // 4
        System.out.println(sol.rob(new int[]{2,7,9,3,1}));   // 12
    }
}
