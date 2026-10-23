package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;

/**
 * Q18. Check if no elements match a condition (noneMatch)
 */
public class Q18_NoneMatch {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23);

    public static void main(String[] args) {
        System.out.println("===== Q18: Check if no elements match a condition (noneMatch) =====");

        // TODO: check karo ki numbers me koi bhi element negative nahi hai (true / false print karo)
        boolean isNoneNegative = numbers.stream().allMatch(x->x>=0);

        boolean isNoneNegative2 = numbers.stream().noneMatch(x->x<0);
        System.out.println(isNoneNegative);
        System.out.println(isNoneNegative2);

    }
}
