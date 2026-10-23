package com.codekatha.machinecodingpractice.mine.dsaquest.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #443 - String Compression  [Medium]
 * Link   : https://leetcode.com/problems/string-compression/
 * Pattern: String Manipulation & Simulation
 *
 * Given an array of characters chars, compress it using the following algorithm: Begin with an
 * empty string s. For each group of consecutive repeating characters in chars: if the group's
 * length is 1, append the character to s; otherwise, append the character followed by the
 * group's length. The compressed string s should not be returned separately, but instead, be
 * stored in the input character array chars. Note that group lengths that are 10 or longer
 * will be split into multiple characters in chars. After you are done modifying the input
 * array, return the new length of the array. You must write an algorithm that uses only
 * constant extra space.
 *
 * Example 1:
 * <pre>
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: chars = ["a"]
 * Output: Return 1, and the first character of the input array should be: ["a"]
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"]
 * </pre>
 *
 * Constraints:
 *  - 1 <= chars.length <= 2000
 *  - chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
 *
 * Hint (spoiler - pehle khud try karo): Read pointer group ki length gino, write pointer char + count ke digits likhe (10+ ke liye digits alag karke).
 */
public class LC0443_StringCompression {

    // TODO: apna solution yahan likho
    public int compress(char[] chars) {
        return 0;
    }

    public static void main(String[] args) {
        LC0443_StringCompression sol = new LC0443_StringCompression();
        char[] a = {'a','a','b','b','c','c','c'};
        int k = sol.compress(a);
        System.out.println(k + " " + new String(a, 0, k)); // 6 a2b2c3
        char[] b = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        k = sol.compress(b);
        System.out.println(k + " " + new String(b, 0, k)); // 4 ab12
    }
}
