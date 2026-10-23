package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q4. Find squares of even numbers
 */
public class Q04_SquaresOfEvenNumbers {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q4: Find squares of even numbers =====");

        // TODO: numbers me se even numbers ke squares ki List banao
        print("SquareOfEvenNums",
                numbers.stream().filter(x->x%2==0)
                        .map(val -> val*val).toList()
                );

    }

    // ---------- Helper ----------
    // Usage: print("squares", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
