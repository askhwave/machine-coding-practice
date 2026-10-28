package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set03_hashing;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Extra test cases for LC0448_FindAllNumbersDisappearedInAnArray.
 * Run this main() after writing your solution there (it calls that class, so nothing to copy).
 */
public class LC0448_ExtraTests {

    public static void main(String[] args) {
        LC0448_FindAllNumbersDisappearedInAnArray sol = new LC0448_FindAllNumbersDisappearedInAnArray();
        Check.start("LC0448 extra tests");

        // the two examples
        Check.sameElements("[5, 6]", () -> sol.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        Check.sameElements("[2]", () -> sol.findDisappearedNumbers(new int[]{1,1}));

        // n = 1: nothing can be missing
        Check.sameElements("[]", () -> sol.findDisappearedNumbers(new int[]{1}));
        // permutations: nothing missing
        Check.sameElements("[]", () -> sol.findDisappearedNumbers(new int[]{1,2,3,4,5}));
        Check.sameElements("[]", () -> sol.findDisappearedNumbers(new int[]{5,4,3,2,1}));
        // missing the smallest / the largest number
        Check.sameElements("[1]", () -> sol.findDisappearedNumbers(new int[]{2,2}));
        Check.sameElements("[1]", () -> sol.findDisappearedNumbers(new int[]{2,3,4,5,5}));
        Check.sameElements("[3]", () -> sol.findDisappearedNumbers(new int[]{1,2,2}));
        // many duplicates
        Check.sameElements("[2, 3, 4]", () -> sol.findDisappearedNumbers(new int[]{1,1,1,1}));
        Check.sameElements("[1, 2, 3, 4]", () -> sol.findDisappearedNumbers(new int[]{5,5,5,5,5}));
        Check.sameElements("[1, 2]", () -> sol.findDisappearedNumbers(new int[]{3,3,3}));
        Check.sameElements("[3, 4]", () -> sol.findDisappearedNumbers(new int[]{2,1,2,1}));
        // duplicates next to each other / unsorted
        Check.sameElements("[3, 6]", () -> sol.findDisappearedNumbers(new int[]{5,4,4,2,1,1}));
        Check.sameElements("[2, 4, 6]", () -> sol.findDisappearedNumbers(new int[]{1,1,3,3,5,5}));
        // example 1 again (catches solutions that keep state between calls, e.g. a field-level set/array)
        Check.sameElements("[5, 6]", () -> sol.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));

        // big input (performance): O(n^2) solutions (e.g. list.contains in a loop) will be very slow here
        Check.eq(99999, () -> {
            int[] big = new int[100000];
            Arrays.fill(big, 1);
            return sol.findDisappearedNumbers(big).size();      // missing 2..100000
        });
        Check.eq(0, () -> {
            int[] big = new int[100000];
            for (int i = 0; i < big.length; i++) big[i] = big.length - i;   // permutation, reversed
            return sol.findDisappearedNumbers(big).size();
        });

        Check.summary();
    }
}
