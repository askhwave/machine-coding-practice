package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p13_heap_sorting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #215 - Kth Largest Element in an Array  [Medium]
 * Link   : https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Pattern: Heap / PriorityQueue / Top-K
 *
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Can you solve it without sorting?
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * </pre>
 *
 * Constraints:
 *  - 1 <= k <= nums.length <= 10^5
 *  - -10^4 <= nums[i] <= 10^4
 *
 * Hint (spoiler - pehle khud try karo): Min-heap of size k: O(n log k). Advanced: Quickselect O(n) average - partition ka idea.
 */
public class LC0215_KthLargestElementInAnArray {

    // TODO: apna solution yahan likho
    public int findKthLargest(int[] nums, int k) {
        return 0;
    }

    public static void main(String[] args) {
        LC0215_KthLargestElementInAnArray sol = new LC0215_KthLargestElementInAnArray();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2));       // 5
        System.out.println(sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));   // 4
    }
}
