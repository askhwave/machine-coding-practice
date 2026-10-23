package com.codekatha.machinecodingpractice.mine.java8quest;


import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q28. Find the most frequent character in a string
 */
public class Q28_MostFrequentCharacter {

    // ---------- Sample data ----------
    static final String text = "success";

    public static void main(String[] args) {
        System.out.println("===== Q28: Find the most frequent character in a string =====");

        // TODO: text me sabse zyada baar aane wala character print karo
        Optional<Character> val = text.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
        System.out.println(val.get());


    }
}
