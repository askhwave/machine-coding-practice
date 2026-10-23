package com.codekatha.machinecodingpractice.mine.dsaquest.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #162 - Find Peak Element  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/find-peak-element/
 * Pattern: Binary Search (index + answer space)
 *
 * A peak element is an element that is strictly greater than its neighbors. Given a 0-indexed
 * integer array nums, find a peak element, and return its index. If the array contains
 * multiple peaks, return the index to any of the peaks. You may imagine that nums[-1] =
 * nums[n] = -infinity. You must write an algorithm that runs in O(log n) time.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,2,3,1]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 1000
 *  - -2^31 <= nums[i] <= 2^31 - 1
 *  - nums[i] != nums[i + 1] for all valid i.
 *
 * Hint (spoiler - pehle khud try karo): #852 ka general version: slope dekho. Chadhai right me hai to peak right me zaroor hai.
 */
public class LC0162_FindPeakElement {

    // TODO: apna solution yahan likho
    public int findPeakElement(int[] nums) {
        return -1;
    }

    public static void main(String[] args) {
        LC0162_FindPeakElement sol = new LC0162_FindPeakElement();
        System.out.println(sol.findPeakElement(new int[]{1,2,3,1}));         // 2
        System.out.println(sol.findPeakElement(new int[]{1,2,1,3,5,6,4}));   // 1 or 5
    }
}
