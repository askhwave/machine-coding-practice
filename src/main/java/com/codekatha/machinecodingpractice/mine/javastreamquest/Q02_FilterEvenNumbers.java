package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q2. Filter even numbers from a list
 */
public class Q02_FilterEvenNumbers {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q2: Filter even numbers from a list =====");

        // TODO: numbers me se even numbers ki List banao

        List<Integer> evenNumbers= numbers.stream().filter(v->v%2==0).toList();
        print("evenNumbers",evenNumbers);
    }

    // ---------- Helper ----------
    // Usage: print("evens", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
