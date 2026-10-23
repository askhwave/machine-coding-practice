package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Q10. Find any element from a list
 */
public class Q10_FindAnyElement {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56, 3);

    public static void main(String[] args) {
        System.out.println("===== Q10: Find any element from a list =====");

        // TODO: numbers me se koi bhi ek element print karo
        Optional<Integer> anyNum = numbers.stream().findAny();
        anyNum.ifPresent(System.out::println);

    }
}
