package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Q31. Merge two streams or lists
 */
public class Q31_MergeTwoLists {

    // ---------- Sample data ----------
    static final List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    static final List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

    public static void main(String[] args) {
        System.out.println("===== Q31: Merge two streams or lists =====");

        // TODO: list1 aur list2 ko merge karke ek List banao (duplicates ke saath)
        List<Integer> list = Stream.of(list1,list2).flatMap(List::stream).toList();
        System.out.println(list);

    }

    // ---------- Helper ----------
    // Usage: print("merged", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
