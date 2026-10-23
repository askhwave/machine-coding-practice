package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q15. Join strings in a list into a single comma-separated string
 */
public class Q15_JoinStrings {

    // ---------- Sample data ----------
    static final List<String> names = Arrays.asList("Aman", "Ankit", "Riya", "Rahul", "Sneha");

    public static void main(String[] args) {
        System.out.println("===== Q15: Join strings into a single comma-separated string =====");

        // TODO: names ko jod kar ek string banao, jaise: Aman, Ankit, Riya, Rahul, Sneha
        String joinedString = names.stream().collect(Collectors.joining(", "));
        System.out.println(joinedString);



    }
}
