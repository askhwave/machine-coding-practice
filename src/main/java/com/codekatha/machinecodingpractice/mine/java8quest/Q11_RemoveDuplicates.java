package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q11. Remove duplicates / find distinct elements
 */
public class Q11_RemoveDuplicates {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(5, 3, 5, 1, 3, 9, 1, 7, 9, 5);

    public static void main(String[] args) {
        System.out.println("===== Q11: Remove duplicates / find distinct elements =====");

        // TODO: numbers se duplicates hata kar List banao
        List<Integer> distinctList = numbers.stream().distinct().toList();
        print("distinctList: ",distinctList);

    }

    // ---------- Helper ----------
    // Usage: print("distinct", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
