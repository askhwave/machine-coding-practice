package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q24. Count occurrences of each element in a list
 */
public class Q24_CountOccurrences {

    // ---------- Sample data ----------
    static final List<String> fruits = Arrays.asList("apple", "banana", "apple", "mango", "banana", "apple", "grapes");

    public static void main(String[] args) {
        System.out.println("===== Q24: Count occurrences of each element in a list =====");

        // TODO: fruits me har fruit kitni baar aaya hai, uska count print karo
        Map<String,Long> map = fruits.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);

    }
}
