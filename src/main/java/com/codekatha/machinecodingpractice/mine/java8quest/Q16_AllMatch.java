package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;

/**
 * Q16. Check if all elements match a condition (allMatch)
 */
public class Q16_AllMatch {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

    public static void main(String[] args) {
        System.out.println("===== Q16: Check if all elements match a condition (allMatch) =====");

        // TODO: check karo ki numbers ke saare elements even hain ya nahi (true / false print karo)
        boolean allMatch = numbers.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allMatch);

    }
}
