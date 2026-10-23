package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Q9. Find the first element of a list
 */
public class Q09_FirstElement {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56, 3);

    public static void main(String[] args) {
        System.out.println("===== Q9: Find the first element of a list =====");

        // TODO: numbers ka pehla element print karo
        Optional<Integer> firstElement = numbers.stream().findFirst();
        System.out.println(firstElement.get());

    }
}
