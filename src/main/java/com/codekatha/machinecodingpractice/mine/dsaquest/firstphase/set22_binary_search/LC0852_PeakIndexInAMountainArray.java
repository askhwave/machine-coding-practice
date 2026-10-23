package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set22_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #852 - Peak Index in a Mountain Array  [Medium]
 * Link   : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Pattern: Binary Search (index + answer space)
 *
 * You are given an integer mountain array arr of length n where the values increase to a peak
 * element and then decrease. Return the index of the peak element. Your task is to solve it in
 * O(log(n)) time complexity.
 *
 * Example 1:
 * <pre>
 * Input: arr = [0,1,0]
 * Output: 1
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: arr = [0,2,1,0]
 * Output: 1
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: arr = [0,10,5,2]
 * Output: 1
 * </pre>
 *
 * Constraints:
 *  - 3 <= arr.length <= 10^5
 *  - 0 <= arr[i] <= 10^6
 *  - arr is guaranteed to be a mountain array.
 *
 * Hint (spoiler - pehle khud try karo): arr[mid] < arr[mid+1] hai to peak right me, warna mid ya left me.
 */
public class LC0852_PeakIndexInAMountainArray {

    // TODO: apna solution yahan likho
    public int peakIndexInMountainArray(int[] arr) {
        return -1;
    }

    public static void main(String[] args) {
        LC0852_PeakIndexInAMountainArray sol = new LC0852_PeakIndexInAMountainArray();
        Check.start("LC0852_PeakIndexInAMountainArray");
        Check.eq("1", () -> sol.peakIndexInMountainArray(new int[]{0,1,0}));
        Check.eq("1", () -> sol.peakIndexInMountainArray(new int[]{0,2,1,0}));
        Check.eq("1", () -> sol.peakIndexInMountainArray(new int[]{0,10,5,2}));
        Check.summary();
    }
}
