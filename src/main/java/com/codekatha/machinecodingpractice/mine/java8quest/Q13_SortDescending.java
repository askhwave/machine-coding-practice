package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q13. Sort a list in descending order
 */
public class Q13_SortDescending {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(45, 12, 89, 7, 56, 23, 3);

    public static void main(String[] args) {
        System.out.println("===== Q13: Sort a list in descending order =====");

        // TODO: numbers ko bade se chhote ke order me sort karke List banao
        List<Integer> numsDesc1 =  numbers.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> numsDesc2 =  numbers.stream().sorted((x,y)->y.compareTo(x)).toList();

        print("numsDesc1",numsDesc1);
        print("numsDesc2",numsDesc2);

    }

    // ---------- Helper ----------
    // Usage: print("sorted", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
