package com.codekatha.machinecodingpractice.mine.dsaquest.p03_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #239 - Sliding Window Maximum  [Hard]
 * Link   : https://leetcode.com/problems/sliding-window-maximum/
 * Pattern: Sliding Window
 *
 * You are given an array of integers nums, there is a sliding window of size k which is moving
 * from the very left of the array to the very right. You can only see the k numbers in the
 * window. Each time the sliding window moves right by one position. Return the max sliding
 * window.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [1], k = 1
 * Output: [1]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - -10^4 <= nums[i] <= 10^4
 *  - 1 <= k <= nums.length
 *
 * Hint (spoiler - pehle khud try karo): Monotonic decreasing deque of indices: front = current max, out-of-window front hatao.
 */
public class LC0239_SlidingWindowMaximum {

    // TODO: apna solution yahan likho
    public int[] maxSlidingWindow(int[] nums, int k) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0239_SlidingWindowMaximum sol = new LC0239_SlidingWindowMaximum();
        System.out.println(Arrays.toString(sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3))); // [3, 3, 5, 5, 6, 7]
        System.out.println(Arrays.toString(sol.maxSlidingWindow(new int[]{1}, 1)));                 // [1]
    }
}
