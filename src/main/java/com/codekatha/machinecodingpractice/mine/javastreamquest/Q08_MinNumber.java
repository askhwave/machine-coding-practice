package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;

/**
 * Q8. Find the minimum number in a list
 */
public class Q08_MinNumber {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56, 3);

    public static void main(String[] args) {
        System.out.println("===== Q8: Find the minimum number in a list =====");

        int min1 = numbers.stream().min((x1,x2)-> x1.compareTo(x2)).get();

        int min2 = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();

        int min3 = numbers.stream().reduce(Integer::min).get();

        System.out.println("Ans: " + min1);
        System.out.println("Ans: " + min2);
        System.out.println("Ans: " + min3);

        // TODO: numbers me sabse chhota number print karo

    }
}
