package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set14_sliding_window;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * LeetCode #239 - Sliding Window Maximum  [Hard]
 * Link   : https://leetcode.com/problems/sliding-window-maximum/
 * Pattern: Sliding Window
 * <p>
 * You are given an array of integers nums, there is a sliding window of size k which is moving
 * from the very left of the array to the very right. You can only see the k numbers in the
 * window. Each time the sliding window moves right by one position. Return the max sliding
 * window.
 * <p>
 * Example 1:
 * <pre>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: nums = [1], k = 1
 * Output: [1]
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 * <p>
 * Hint (spoiler - pehle khud try karo): Monotonic decreasing deque of indices: front = current max, out-of-window front hatao.
 */
public class LC0239_SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int r = 0; r < nums.length; r++) {
            // remove element from left if not part of window
            if (!dq.isEmpty() && dq.peekFirst() <= r - k) {
                dq.pollFirst();
            }
            // new element is big then remove smaller from dq and add new element in last
            // if code look big remove q empty check in mind
            while (!dq.isEmpty() && nums[r] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(r);

            if (r >= k - 1) {
                ans[r - k + 1] = nums[dq.peekFirst()];
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        LC0239_SlidingWindowMaximum sol = new LC0239_SlidingWindowMaximum();
        Check.start("LC0239_SlidingWindowMaximum");
        Check.eq("[3, 3, 5, 5, 6, 7]", () -> Arrays.toString(sol.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        Check.eq("[1]", () -> Arrays.toString(sol.maxSlidingWindow(new int[]{1}, 1)));
        Check.summary();
    }
}
