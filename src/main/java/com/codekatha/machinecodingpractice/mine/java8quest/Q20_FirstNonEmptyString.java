package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Q20. Find the first non-empty string in a list
 */
public class Q20_FirstNonEmptyString {

    // ---------- Sample data ----------
    static final List<String> words = Arrays.asList("", "", "Aman", "", "Ankit", "Riya");

    public static void main(String[] args) {
        System.out.println("===== Q20: Find the first non-empty string in a list =====");

        // TODO: words me pehli non-empty string print karo
        Optional<String> firstNonEmpty = words.stream().filter(s -> !s.equals("")).findFirst();
        firstNonEmpty.ifPresent(System.out::println);

    }
}
