package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q30. Find the frequency of characters in a string
 */
public class Q30_CharacterFrequency {

    // ---------- Sample data ----------
    static final String text = "programming";

    public static void main(String[] args) {
        System.out.println("===== Q30: Find the frequency of characters in a string =====");

        // TODO: text ke har character ki frequency print karo, jaise {p=1, r=2, ...}
        var map = text.chars().mapToObj(ch -> (char)ch )
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(map);

    }
}
