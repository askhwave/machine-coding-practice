package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Q22. Partition numbers into even and odd lists
 */
public class Q22_PartitionEvenOdd {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q22: Partition numbers into even and odd lists =====");

        // TODO: numbers ko even aur odd ki 2 alag lists me baanto, aur print karo
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(v -> v % 2 == 0));
        System.out.println(map);

    }
}
