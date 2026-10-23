package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q35. Count word frequencies in a paragraph
 */
public class Q35_WordFrequency {

    // ---------- Sample data ----------
    static final String paragraph =
            "Java is fun. Streams make Java code short, and short code is easy to read! "
                    + "Is Java hard? No, Java is not hard.";

    public static void main(String[] args) {
        System.out.println("===== Q35: Count word frequencies in a paragraph =====");

        // TODO: paragraph me har word kitni baar aaya hai, uska count print karo
        // (case aur punctuation ignore karo, jaise "Java" aur "java" ek hi word hain)
        // Expected me: java=4, is=4, short=2, code=2, hard=2, baaki 1-1 baar

        Map<String, Long> map = Arrays.stream(paragraph.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split("\\s+")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);


    }
}
