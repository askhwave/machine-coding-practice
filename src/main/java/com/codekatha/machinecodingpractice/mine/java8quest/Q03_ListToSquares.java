package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q3. Convert list of numbers to their squares
 */
public class Q03_ListToSquares {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q3: Convert list of numbers to their squares =====");

        // TODO: numbers ke squares ki List banao
        List<Integer> squareNums1 = numbers.stream()
                .mapToInt(x->x*x).boxed().toList();

        List<Integer> squareNums2 = numbers.stream()
                .map(x->x*x).toList();

        print("squareNums1",squareNums1);
        print("squareNums2",squareNums2);



    }

    // ---------- Helper ----------
    // Usage: print("squares", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
