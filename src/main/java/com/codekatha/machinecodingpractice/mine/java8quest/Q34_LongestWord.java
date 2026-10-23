package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Q34. Find the longest word in a sentence (ignoring case/punctuation)
 */
public class Q34_LongestWord {

    // ---------- Sample data ----------
    static final String sentence = "Java streams, lambdas; and Optional are fun!";

    public static void main(String[] args) {
        System.out.println("===== Q34: Find the longest word in a sentence (ignoring case/punctuation) =====");

        // TODO: sentence ka sabse lamba word print karo (punctuation hatao, lowercase me)
        // Expected: optional
        Arrays.stream(
                sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

    }
}
