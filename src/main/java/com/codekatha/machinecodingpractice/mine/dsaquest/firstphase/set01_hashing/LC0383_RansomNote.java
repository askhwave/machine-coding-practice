package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set01_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * LeetCode #383 - Ransom Note  [Easy]
 * Link   : https://leetcode.com/problems/ransom-note/
 * Pattern: Hash Map / Set / Counting
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by
 * using the letters from magazine and false otherwise. Each letter in magazine can only be
 * used once in ransomNote.
 * <p>
 * Example 1:
 * <pre>
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * </pre>
 * <p>
 * Example 2:
 * <pre>
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * </pre>
 * <p>
 * Example 3:
 * <pre>
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * </pre>
 * <p>
 * Constraints:
 * - 1 <= ransomNote.length, magazine.length <= 10^5
 * - ransomNote and magazine consist of lowercase English letters.
 * <p>
 * Hint (spoiler - pehle khud try karo): Magazine ka count banao, note ke letters usme se ghatao; negative gaya to false.
 */
public class LC0383_RansomNote {

    // TODO: apna solution yahan likho
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] freqData = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            int idx = magazine.charAt(i) - 'a';
            freqData[idx]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if (freqData[idx] <= 0) {
                return false;
            }
            freqData[idx]--;
        }
        return true;
    }

    public static void main(String[] args) {
        LC0383_RansomNote sol = new LC0383_RansomNote();
        Check.start("LC0383_RansomNote");
        Check.eq("false", () -> sol.canConstruct("a", "b"));
        Check.eq("false", () -> sol.canConstruct("aa", "ab"));
        Check.eq("true", () -> sol.canConstruct("aa", "aab"));
        Check.summary();
    }
}
