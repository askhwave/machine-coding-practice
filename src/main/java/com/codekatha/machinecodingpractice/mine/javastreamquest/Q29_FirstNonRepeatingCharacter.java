package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q29. Find the first non-repeating character in a string
 */
public class Q29_FirstNonRepeatingCharacter {

    // ---------- Sample data ----------
    static final String text = "swiss";

    public static void main(String[] args) {
        System.out.println("===== Q29: Find the first non-repeating character in a string =====");

        // TODO: text me pehla aisa character print karo jo sirf ek hi baar aaya ho
        char character = text.chars().mapToObj(v -> (char) v).collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream().filter(val -> val.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse('-');
        System.out.println(character);

    }
}
