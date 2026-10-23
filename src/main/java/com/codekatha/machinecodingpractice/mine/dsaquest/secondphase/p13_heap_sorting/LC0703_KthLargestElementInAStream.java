package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p13_heap_sorting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #703 - Kth Largest Element in a Stream  [Easy]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * Pattern: Heap / PriorityQueue / Top-K
 *
 * You are part of a university admissions office and need to keep track of the kth highest
 * test score from applicants in real-time. Design a class to find the kth largest element in a
 * stream. Note that it is the kth largest element in the sorted order, not the kth distinct
 * element. Implement KthLargest class: KthLargest(int k, int[] nums) initializes the object
 * with the integer k and the stream of test scores nums. int add(int val) adds a new test
 * score val to the stream and returns the element representing the kth largest element in the
 * pool of test scores so far.
 *
 * Example 1:
 * <pre>
 * Input: ["KthLargest","add","add","add","add","add"]
 *        [[3,[4,5,8,2]],[3],[5],[10],[9],[4]]
 * Output: [null,4,5,5,8,8]
 * </pre>
 *
 * Constraints:
 *  - 0 <= nums.length <= 10^4
 *  - 1 <= k <= nums.length + 1
 *  - -10^4 <= nums[i] <= 10^4
 *  - -10^4 <= val <= 10^4
 *  - At most 10^4 calls will be made to add.
 *
 * Hint (spoiler - pehle khud try karo): Size-k ka MIN-heap rakho. Top hi kth largest hai. Size > k ho to poll().
 */
public class LC0703_KthLargestElementInAStream {

    static class KthLargest {
        // TODO: fields (PriorityQueue)

        public KthLargest(int k, int[] nums) {
        }

        public int add(int val) {
            return 0;
        }
    }

    public static void main(String[] args) {
        LC0703_KthLargestElementInAStream sol = new LC0703_KthLargestElementInAStream();
        KthLargest kl = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(kl.add(3));  // 4
        System.out.println(kl.add(5));  // 5
        System.out.println(kl.add(10)); // 5
        System.out.println(kl.add(9));  // 8
        System.out.println(kl.add(4));  // 8
    }
}
