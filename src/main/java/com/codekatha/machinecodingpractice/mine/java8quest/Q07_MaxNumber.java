package com.codekatha.machinecodingpractice.mine.java8quest;


import java.util.Arrays;
import java.util.List;

/**
 * Q7. Find the maximum number in a list
 */
public class Q07_MaxNumber {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56, 3);

    public static void main(String[] args) {
        System.out.println("===== Q7: Find the maximum number in a list =====");

        // TODO: numbers me sabse bada number print karo
        int maxVal = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("maxVal: "+maxVal);


    }
}
