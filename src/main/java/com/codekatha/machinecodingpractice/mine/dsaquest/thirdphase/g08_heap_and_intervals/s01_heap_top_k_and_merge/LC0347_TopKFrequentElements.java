package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g08_heap_and_intervals.s01_heap_top_k_and_merge;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #347 - Top K Frequent Elements  [LeetCode: Medium | Cheatsheet: Round 2 F2F | Medium]
 * Link   : https://leetcode.com/problems/top-k-frequent-elements/
 * Group  : Heap & Intervals  >  Heap: Top-K & K-way Merge
 * Revision: pehle bhi aa chuka hai (secondphase/p13_heap_sorting). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may
 * return the answer in any order.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
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
 *  - k is in the range [1, the number of unique elements in the array].
 *  - It is guaranteed that the answer is unique.
 *  - Follow-up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * Hint (spoiler - pehle khud try karo): Freq map + min-heap size k. Follow-up (better than n log n): bucket sort - index = frequency.
 */
public class LC0347_TopKFrequentElements {

    // TODO: apna solution yahan likho
    public int[] topKFrequent(int[] nums, int k) {
        return new int[0];
    }

    public static void main(String[] args) {
        LC0347_TopKFrequentElements sol = new LC0347_TopKFrequentElements();
        Check.start("LC0347_TopKFrequentElements");
        Check.eq("[1, 2]", () -> Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
        Check.eq("[1]", () -> Arrays.toString(sol.topKFrequent(new int[]{1}, 1)));
        Check.summary();
    }
}
