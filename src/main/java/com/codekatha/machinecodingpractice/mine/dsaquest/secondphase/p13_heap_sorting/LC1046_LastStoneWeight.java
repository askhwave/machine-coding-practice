package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p13_heap_sorting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #1046 - Last Stone Weight  [Easy]
 * Link   : https://leetcode.com/problems/last-stone-weight/
 * Pattern: Heap / PriorityQueue / Top-K
 *
 * You are given an array of integers stones where stones[i] is the weight of the ith stone. We
 * are playing a game with the stones. On each turn, we choose the heaviest two stones and
 * smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The
 * result of this smash is: if x == y, both stones are destroyed, and if x != y, the stone of
 * weight x is destroyed, and the stone of weight y has new weight y - x. At the end of the
 * game, there is at most one stone left. Return the weight of the last remaining stone. If
 * there are no stones left, return 0.
 *
 * Example 1:
 * <pre>
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: stones = [1]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= stones.length <= 30
 *  - 1 <= stones[i] <= 1000
 *
 * Hint (spoiler - pehle khud try karo): Max-heap: PriorityQueue(Collections.reverseOrder()). Do pop, difference > 0 to wapas push.
 */
public class LC1046_LastStoneWeight {

    // TODO: apna solution yahan likho
    public int lastStoneWeight(int[] stones) {
        return 0;
    }

    public static void main(String[] args) {
        LC1046_LastStoneWeight sol = new LC1046_LastStoneWeight();
        System.out.println(sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
        System.out.println(sol.lastStoneWeight(new int[]{1}));             // 1
        System.out.println(sol.lastStoneWeight(new int[]{2,2}));           // 0
    }
}
