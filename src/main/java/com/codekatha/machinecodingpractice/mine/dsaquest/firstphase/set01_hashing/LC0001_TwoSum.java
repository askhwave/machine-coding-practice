package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set01_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1 - Two Sum  [Easy]
 * Link   : https://leetcode.com/problems/two-sum/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given an array of integers nums and an integer target, return the indices of the two numbers
 * such that they add up to target. You may assume that each input has exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * </pre>
 * <p>
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Only one valid answer exists.
 * <p>
 * Hint (spoiler - pehle khud try karo): Har number ke liye socho: target - num pehle dekha hai kya? Map: value -> index.
 */
public class LC0001_TwoSum {

    // TODO: apna solution yahan likho
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int compliment = target - curr;
            if (map.containsKey(compliment)) {
                int idx = map.get(compliment);
                return new int[]{idx, i};
            }
            map.put(curr, i);
        }

        return new int[] {-1,-1};
    }

    public LC0001_TwoSum() {
        super();
    }

    public static void main(String[] args) {
        LC0001_TwoSum sol = new LC0001_TwoSum();
        Check.start("LC0001_TwoSum");
        Check.sameElements("[0, 1]", () -> sol.twoSum(new int[]{2, 7, 11, 15}, 9));
        Check.sameElements("[1, 2]", () -> sol.twoSum(new int[]{3, 2, 4}, 6));
        Check.sameElements("[0, 1]", () -> sol.twoSum(new int[]{3, 3}, 6));
        Check.summary();
    }
}
