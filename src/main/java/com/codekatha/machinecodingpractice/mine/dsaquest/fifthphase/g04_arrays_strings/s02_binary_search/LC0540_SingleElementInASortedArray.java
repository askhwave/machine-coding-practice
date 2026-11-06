package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g04_arrays_strings.s02_binary_search;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #540 - Single Element in a Sorted Array  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.043]
 * Link   : https://leetcode.com/problems/single-element-in-a-sorted-array/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Arrays & Strings  >  Binary Search Variants
 *
 * You are given a sorted array consisting of only integers where every element appears exactly
 * twice, except for one element which appears exactly once. Return the single element that
 * appears only once. Your solution must run in O(log n) time and O(1) space.
 *
 * Example 1:
 * <pre>
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 10^5
 *  - 0 <= nums[i] <= 10^5
 *
 * Hint (spoiler - pehle khud try karo): Pairs ka pattern: single se pehle pair (even, odd) index pe hota hai, single ke baad (odd, even). Binary search me mid ko even bana lo; nums[mid] == nums[mid+1] hai to single right me (lo = mid + 2), warna left me (hi = mid).
 */
public class LC0540_SingleElementInASortedArray {

    // TODO: apna solution yahan likho
    public int singleNonDuplicate(int[] nums) {
        return -1;
    }

    // test helper: values 0..vals-1, har value 2 baar, sirf `single` ek baar
    static int[] build(int vals, int single) {
        int[] a = new int[2 * vals - 1];
        int k = 0;
        for (int v = 0; v < vals; v++) {
            a[k++] = v;
            if (v != single) a[k++] = v;
        }
        return a;
    }

    public static void main(String[] args) {
        LC0540_SingleElementInASortedArray sol = new LC0540_SingleElementInASortedArray();
        Check.start("LC0540_SingleElementInASortedArray");
        Check.eq(2, () -> sol.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
        Check.eq(10, () -> sol.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
        Check.eq(1, () -> sol.singleNonDuplicate(new int[]{1}));
        Check.eq(2, () -> sol.singleNonDuplicate(new int[]{1,1,2}));
        Check.eq(1, () -> sol.singleNonDuplicate(new int[]{1,2,2}));
        Check.eq(3, () -> sol.singleNonDuplicate(new int[]{1,1,2,2,3}));
        Check.eq(0, () -> sol.singleNonDuplicate(new int[]{0,1,1,2,2}));
        Check.eq(116, () -> sol.singleNonDuplicate(new int[]{116,129,129}));
        Check.eq(142, () -> sol.singleNonDuplicate(new int[]{86,86,142}));
        Check.eq(136, () -> sol.singleNonDuplicate(new int[]{4,4,98,98,122,122,136}));
        Check.eq(115, () -> sol.singleNonDuplicate(new int[]{38,38,40,40,115,155,155,172,172,195,195}));
        Check.eq(78, () -> sol.singleNonDuplicate(new int[]{0,0,33,33,56,56,73,73,78,81,81,91,91,174,174,184,184}));
        Check.eq(19, () -> sol.singleNonDuplicate(new int[]{19,46,46,54,54,76,76,84,84,131,131,143,143,148,148,154,154,183,183,192,192,199,199}));
        Check.eq(197, () -> sol.singleNonDuplicate(new int[]{4,4,47,47,59,59,62,62,98,98,114,114,142,142,166,166,178,178,183,183,187,187,197}));
        Check.eq(74, () -> sol.singleNonDuplicate(new int[]{15,15,25,25,29,29,41,41,46,46,47,47,48,48,57,57,68,68,70,70,74,78,78,89,89,109,109,110,110,118,118,149,149,169,169,184,184,189,189,199,199}));
        Check.eq(0, () -> sol.singleNonDuplicate(build(50000, 0)));        // 99999 elements, single sabse pehle
        Check.eq(25000, () -> sol.singleNonDuplicate(build(50000, 25000)));  // beech me
        Check.eq(49999, () -> sol.singleNonDuplicate(build(50000, 49999)));  // sabse aakhir me
        Check.summary();
    }
}
