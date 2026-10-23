package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q32. Find the character with the maximum frequency
 * (Q28 jaisa hi hai, par yahan tie bhi handle karna hai: agar kai characters ki frequency max ho to sab chahiye)
 */
public class Q32_MaxFrequencyCharacters {

    // ---------- Sample data ----------
    static final String text = "programming";

    public static void main(String[] args) {
        System.out.println("===== Q32: Find the character(s) with the maximum frequency =====");

        // TODO: text me sabse zyada frequency wale saare characters print karo (r, g, m teeno 2 baar aaye hain)
        var mapWithCount = text.chars().mapToObj(val -> (char) val)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Long maxFreq = mapWithCount.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue).orElse(0l);

        List<Character> ans = mapWithCount.entrySet().stream().filter(v->v.getValue().equals(maxFreq))
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);





    }
}
