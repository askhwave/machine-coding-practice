package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #278 - First Bad Version  [Easy]
 * Link   : https://leetcode.com/problems/first-bad-version/
 * Pattern: Binary Search (index + answer space)
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check. Since each
 * version is developed based on the previous version, all the versions after a bad version are
 * also bad. Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad
 * one, which causes all the following ones to be bad. You are given an API bool
 * isBadVersion(version) which returns whether version is bad. Implement a function to find the
 * first bad version. You should minimize the number of calls to the API.
 *
 * Example 1:
 * <pre>
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation: call isBadVersion(3) -> false, isBadVersion(5) -> true, isBadVersion(4) -> true. Then 4 is the first bad version.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: n = 1, bad = 1
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 1 <= bad <= n <= 2^31 - 1
 *
 * Hint (spoiler - pehle khud try karo): Lower-bound template: pehla index jahan isBadVersion true. (lo + hi) overflow hoga - mid = lo + (hi-lo)/2.
 */
public class LC0278_FirstBadVersion {

    // LeetCode me isBadVersion() pehle se milta hai. Yahan local testing ke liye simulate kiya hai.
    int bad;
    boolean isBadVersion(int version) {
        return version >= bad;
    }

    // TODO: apna solution yahan likho
    public int firstBadVersion(int n) {
        return -1;
    }

    public static void main(String[] args) {
        LC0278_FirstBadVersion sol = new LC0278_FirstBadVersion();
        sol.bad = 4;
        System.out.println(sol.firstBadVersion(5)); // 4
        sol.bad = 1;
        System.out.println(sol.firstBadVersion(1)); // 1
        sol.bad = 1702766719;
        System.out.println(sol.firstBadVersion(2126753390)); // 1702766719
    }
}
