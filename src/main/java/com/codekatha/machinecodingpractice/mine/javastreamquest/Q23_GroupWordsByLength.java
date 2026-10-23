package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q23. Group words by their lengths
 */
public class Q23_GroupWordsByLength {

    // ---------- Sample data ----------
    static final List<String> words = Arrays.asList("java", "stream", "map", "list", "set", "filter", "spring", "api");

    public static void main(String[] args) {
        System.out.println("===== Q23: Group words by their lengths =====");

        // TODO: words ko unki length ke hisaab se group karo, aur print karo
        var map = words.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.toList()
        ));
        System.out.println(map);

    }
}
