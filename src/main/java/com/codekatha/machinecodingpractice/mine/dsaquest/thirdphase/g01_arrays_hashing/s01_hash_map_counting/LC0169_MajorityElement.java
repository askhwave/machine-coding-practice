package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g01_arrays_hashing.s01_hash_map_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #169 - Majority Element  [LeetCode: Easy | Cheatsheet: Round 2 F2F | Easy]
 * Link   : https://leetcode.com/problems/majority-element/
 * Group  : Arrays & Hashing  >  Hash Map & Counting
 * Revision: pehle bhi aa chuka hai (firstphase/set03_hashing, secondphase/p01_hashing_counting). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * Given an array nums of size n, return the majority element. The majority element is the
 * element that appears more than floor(n / 2) times. You may assume that the majority element
 * always exists in the array.
 *
 * Example 1:
 * <pre>
 * Input: nums = [3,2,3]
 * Output: 3
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * </pre>
 *
 * Constraints:
 *  - n == nums.length
 *  - 1 <= n <= 5 * 10^4
 *  - -10^9 <= nums[i] <= 10^9
 *  - Follow-up: solve it in linear time and O(1) space.
 *
 * Hint (spoiler - pehle khud try karo): Pehle HashMap count; phir Boyer-Moore voting (candidate + count) se O(1) space.
 */
public class LC0169_MajorityElement {

    // TODO: apna solution yahan likho
    public int majorityElement(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LC0169_MajorityElement sol = new LC0169_MajorityElement();
        Check.start("LC0169_MajorityElement");
        Check.eq("3", () -> sol.majorityElement(new int[]{3,2,3}));
        Check.eq("2", () -> sol.majorityElement(new int[]{2,2,1,1,1,2,2}));
        Check.summary();
    }
}
