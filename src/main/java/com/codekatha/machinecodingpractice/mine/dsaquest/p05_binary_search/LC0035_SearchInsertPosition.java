package com.codekatha.machinecodingpractice.mine.dsaquest.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #35 - Search Insert Position  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/search-insert-position/
 * Pattern: Binary Search (index + answer space)
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target
 * is found. If not, return the index where it would be if it were inserted in order. You must
 * write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^4
 *  - -10^4 <= nums[i] <= 10^4
 *  - nums contains distinct values sorted in ascending order.
 *  - -10^4 <= target <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): 'Lower bound' template: pehla index jahan nums[i] >= target. Ye template aage bahut kaam aayega.
 */
public class LC0035_SearchInsertPosition {

    // TODO: apna solution yahan likho
    public int searchInsert(int[] nums, int target) {
        return 0;
    }

    public static void main(String[] args) {
        LC0035_SearchInsertPosition sol = new LC0035_SearchInsertPosition();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2)); // 1
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 7)); // 4
    }
}
