package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p04_array_prefix_kadane;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #274 - H-Index  [Medium]
 * Link   : https://leetcode.com/problems/h-index/
 * Pattern: Arrays: Prefix/Suffix, Kadane, In-place tricks
 *
 * Given an array of integers citations where citations[i] is the number of citations a
 * researcher received for their ith paper, return the researcher's h-index. According to the
 * definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such
 * that the given researcher has published at least h papers that have each been cited at least
 * h times.
 *
 * Example 1:
 * <pre>
 * Input: citations = [3,0,6,1,5]
 * Output: 3
 * Explanation: The researcher has 5 papers with 3, 0, 6, 1, 5 citations respectively. Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: citations = [1,3,1]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - n == citations.length
 *  - 1 <= n <= 5000
 *  - 0 <= citations[i] <= 1000
 *
 * Hint (spoiler - pehle khud try karo): Sort karke ya counting array (citations > n ko n me clamp) se O(n).
 */
public class LC0274_HIndex {

    // TODO: apna solution yahan likho
    public int hIndex(int[] citations) {
        return 0;
    }

    public static void main(String[] args) {
        LC0274_HIndex sol = new LC0274_HIndex();
        System.out.println(sol.hIndex(new int[]{3,0,6,1,5})); // 3
        System.out.println(sol.hIndex(new int[]{1,3,1}));     // 1
    }
}
