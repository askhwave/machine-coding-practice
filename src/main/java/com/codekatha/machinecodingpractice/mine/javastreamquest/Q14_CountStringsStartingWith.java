package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q14. Count strings starting with a specific letter
 */
public class Q14_CountStringsStartingWith {

    // ---------- Sample data ----------
    static final List<String> names = Arrays.asList("Aman", "Ankit", "riya", "Rahul", "amit", "Sneha", "Anil", "Raj");

    public static void main(String[] args) {
        System.out.println("===== Q14: Count strings starting with a specific letter =====");

        // TODO: names me kitne strings 'A' se shuru hote hain? (capital aur small dono ginna)

        long count = names.stream().map(s -> s.toLowerCase())
                .filter(val -> val.startsWith("a"))
                .collect(Collectors.counting());

        System.out.println(count);



    }
}
