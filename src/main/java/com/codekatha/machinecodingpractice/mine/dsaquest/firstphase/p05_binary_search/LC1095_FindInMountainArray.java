package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p05_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1095 - Find in Mountain Array  [Hard]
 * Link   : https://leetcode.com/problems/find-in-mountain-array/
 * Pattern: Binary Search (index + answer space)
 *
 * (This problem is an interactive problem.) You may recall that an array arr is a mountain
 * array if and only if arr.length >= 3 and there exists some i with 0 < i < arr.length - 1
 * such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] and arr[i] > arr[i + 1] > ... >
 * arr[arr.length - 1]. Given a mountain array mountainArr, return the minimum index such that
 * mountainArr.get(index) == target. If such an index does not exist, return -1. You cannot
 * access the mountain array directly. You may only access the array using a MountainArray
 * interface: MountainArray.get(k) returns the element of the array at index k (0-indexed);
 * MountainArray.length() returns the length of the array. Submissions making more than 100
 * calls to MountainArray.get will be judged Wrong Answer.
 *
 * Example 1:
 * <pre>
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * </pre>
 *
 * Constraints:
 *  - 3 <= mountainArr.length() <= 10^4
 *  - 0 <= target <= 10^9
 *  - 0 <= mountainArr.get(index) <= 10^9
 *
 * Hint (spoiler - pehle khud try karo): 3 binary searches: (1) peak dhundo (#852), (2) left ascending half me search, (3) na mile to right descending half me.
 */
public class LC1095_FindInMountainArray {

    // LeetCode ka MountainArray interface - local testing ke liye simple implementation.
    static class MountainArray {
        private final int[] arr;
        MountainArray(int[] arr) { this.arr = arr; }
        public int get(int index) { return arr[index]; }
        public int length() { return arr.length; }
    }

    // TODO: apna solution yahan likho
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return -1;
    }

    public static void main(String[] args) {
        LC1095_FindInMountainArray sol = new LC1095_FindInMountainArray();
        MountainArray m1 = new MountainArray(new int[]{1,2,3,4,5,3,1});
        System.out.println(sol.findInMountainArray(3, m1)); // 2
        MountainArray m2 = new MountainArray(new int[]{0,1,2,4,2,1});
        System.out.println(sol.findInMountainArray(3, m2)); // -1
    }
}
