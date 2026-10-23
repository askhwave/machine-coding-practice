package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q19. Flatten a list of lists using flatMap
 */
public class Q19_FlatMap {

    // ---------- Sample data ----------
    static final List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
    );

    public static void main(String[] args) {
        System.out.println("===== Q19: Flatten a list of lists using flatMap =====");

        // TODO: listOfLists ko flatten karke ek single List<Integer> banao
        List<Integer> flattenList = listOfLists.stream().flatMap(x -> x.stream()).toList();
        System.out.println(flattenList);

    }

    // ---------- Helper ----------
    // Usage: print("flat", result);
    static void print(String label, List<?> list) {
        System.out.println(label + " -> " + list.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }
}
