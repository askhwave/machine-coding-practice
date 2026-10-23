package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Q41. Generate and count bigram frequencies in a text
 * (Bigram = ek ke baad ek aane wale 2 words ki jodi)
 */
public class Q41_BigramFrequency {

    // ---------- Sample data ----------
    static final String text = "the cat sat on the mat the cat ran";

    public static void main(String[] args) {
        System.out.println("===== Q41: Generate and count bigram frequencies in a text =====");

        // TODO: text ke saare bigrams banao aur har bigram kitni baar aaya hai, uska count print karo
        // Expected (order alag ho sakta hai):
        //   {the cat=2, cat sat=1, sat on=1, on the=1, the mat=1, mat the=1, cat ran=1}
        // Bigrams ki list: [the cat, cat sat, sat on, on the, the mat, mat the, the cat, cat ran]

        String[] sarr = text.split(" ");
        String val = IntStream.range(0, sarr.length-1)
                .mapToObj(idx -> sarr[idx] + " " + sarr[idx + 1])
                .collect(Collectors.joining(","));
        Map<String,Long> map = Arrays.stream(val.split(","))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        System.out.println(map);



    }
}
