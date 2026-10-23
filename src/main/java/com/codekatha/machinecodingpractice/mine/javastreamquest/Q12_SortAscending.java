package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q12. Sort a list in ascending order
 */
public class Q12_SortAscending {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(45, 12, 89, 7, 56, 23, 3);

    public static void main(String[] args) {
        System.out.println("===== Q12: Sort a list in ascending order =====");

        // TODO: numbers ko chhote se bade ke order me sort karke List banao

        List<Integer> numbersAsc = numbers.stream().sorted().toList();
        print("numbersAsc: ",numbersAsc);


    }

    // ---------- Helper ----------
    // Usage: print("sorted", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
