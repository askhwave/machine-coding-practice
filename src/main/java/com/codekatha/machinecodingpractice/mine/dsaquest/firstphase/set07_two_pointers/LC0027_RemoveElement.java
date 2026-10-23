package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set07_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #27 - Remove Element  [Easy]
 * Link   : https://leetcode.com/problems/remove-element/
 * Pattern: Two Pointers (opposite / same-direction / fast-slow)
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-
 * place. The order of the elements may be changed. Then return the number of elements in nums
 * which are not equal to val. Consider the number of elements in nums which are not equal to
 * val be k; to get accepted, you need to do the following things: change the array nums such
 * that the first k elements of nums contain the elements which are not equal to val. The
 * remaining elements of nums are not important as well as the size of nums. Return k.
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * </pre>
 *
 * Constraints:
 *  - 0 <= nums.length <= 100
 *  - 0 <= nums[i] <= 50
 *  - 0 <= val <= 100
 *
 * Hint (spoiler - pehle khud try karo): Read pointer sab dekhe, write pointer sirf val se alag elements likhe.
 */
public class LC0027_RemoveElement {

    // TODO: apna solution yahan likho
    public int removeElement(int[] nums, int val) {
        return 0;
    }

    public static void main(String[] args) {
        LC0027_RemoveElement sol = new LC0027_RemoveElement();
        Check.start("LC0027_RemoveElement");
        int[] a = {3,2,2,3};
        int k = sol.removeElement(a, 3);
        Check.eq("2 [2, 2]", () -> k + " " + Arrays.toString(Arrays.copyOf(a, k)));
        Check.summary();
    }
}
