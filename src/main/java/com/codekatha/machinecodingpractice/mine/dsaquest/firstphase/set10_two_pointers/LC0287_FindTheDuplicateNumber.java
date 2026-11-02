package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set10_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #287 - Find the Duplicate Number  [Medium]
 * Link   : https://leetcode.com/problems/find-the-duplicate-number/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 * <p>
 * Given an array of integers nums containing n + 1 integers where each integer is in the range
 * [1, n] inclusive. There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra
 * space.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= n <= 10^5
 * - nums.length == n + 1
 * - 1 <= nums[i] <= n
 * - All the integers in nums appear only once except for precisely one integer which appears two or more times.
 * <p>
 * Hint (spoiler - pehle khud try karo): Array ko linked list socho: i -> nums[i]. Duplicate = cycle ka entry point (Floyd, #142 jaisa).
 */
public class LC0287_FindTheDuplicateNumber {

    // TODO: apna solution yahan likho
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public int findDuplicateWithArrayModification(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx] < 0) {
                ans = Math.abs(nums[i]);
            }
            nums[idx] = -nums[idx];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC0287_FindTheDuplicateNumber sol = new LC0287_FindTheDuplicateNumber();
        Check.start("LC0287_FindTheDuplicateNumber");
        Check.eq("2", () -> sol.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        Check.eq("3", () -> sol.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        Check.eq("3", () -> sol.findDuplicate(new int[]{3, 3, 3, 3, 3}));
        Check.summary();
    }
}
