package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;

/**
 * Q17. Check if any element matches a condition (anyMatch)
 */
public class Q17_AnyMatch {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23);

    public static void main(String[] args) {
        System.out.println("===== Q17: Check if any element matches a condition (anyMatch) =====");

        // TODO: check karo ki numbers me koi bhi element 50 se bada hai ya nahi (true / false print karo)
        boolean anyMatch = numbers.stream().anyMatch(x->x>50);
        System.out.println(anyMatch);

    }
}
