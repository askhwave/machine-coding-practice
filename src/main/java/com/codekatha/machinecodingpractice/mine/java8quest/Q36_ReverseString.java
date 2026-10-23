package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Q36. Reverse a string using streams
 */
public class Q36_ReverseString {

    // ---------- Sample data ----------
    static final String text = "hello streams";

    public static void main(String[] args) {
        System.out.println("===== Q36: Reverse a string using streams =====");

        // TODO: text ko stream use karke reverse karo (StringBuilder.reverse() mat lagana)
        // Expected: smaerts olleh

        String InplaceTest = Arrays.stream(text.split("\\s+"))
                .map(v -> new StringBuilder(v).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(InplaceTest);

        String s2 = IntStream.range(0,text.length())
                .mapToObj(i -> String.valueOf(text.charAt(text.length()-i-1)))
                        .collect(Collectors.joining());
        System.out.println(s2);






    }
}
