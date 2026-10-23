package com.codekatha.machinecodingpractice.mine.dsaquest.p11_greedy_intervals;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #135 - Candy  [Hard]
 * Link   : https://leetcode.com/problems/candy/
 * Pattern: Greedy & Intervals
 *
 * There are n children standing in a line. Each child is assigned a rating value given in the
 * integer array ratings. You are giving candies to these children subjected to the following
 * requirements: each child must have at least one candy; children with a higher rating get
 * more candies than their neighbors. Return the minimum number of candies you need to have to
 * distribute the candies to the children.
 *
 * Example 1:
 * <pre>
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively. The third child gets 1 candy because it satisfies the above two conditions.
 * </pre>
 *
 * Constraints:
 *  - n == ratings.length
 *  - 1 <= n <= 2 * 10^4
 *  - 0 <= ratings[i] <= 2 * 10^4
 *
 * Hint (spoiler - pehle khud try karo): Do pass: left->right (left neighbor se bada to +1), right->left (right neighbor se bada to max(current, right+1)).
 */
public class LC0135_Candy {

    // TODO: apna solution yahan likho
    public int candy(int[] ratings) {
        return 0;
    }

    public static void main(String[] args) {
        LC0135_Candy sol = new LC0135_Candy();
        System.out.println(sol.candy(new int[]{1,0,2})); // 5
        System.out.println(sol.candy(new int[]{1,2,2})); // 4
        System.out.println(sol.candy(new int[]{1,3,2,2,1})); // 7
    }
}
