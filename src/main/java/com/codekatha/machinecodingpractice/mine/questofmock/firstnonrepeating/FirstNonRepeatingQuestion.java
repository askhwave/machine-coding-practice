package com.codekatha.machinecodingpractice.mine.questofmock.firstnonrepeating;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Question 26 (Java 8 / streams): First non-repeating character
 * <p>
 * Return the first character of the text that appears exactly once.
 * Use streams (a LinkedHashMap or groupingBy is a good tool here).
 * <p>
 * Examples:
 * "programming" -> Optional[p]
 * "aabbcd"      -> Optional[c]
 * "aabb"        -> Optional.empty
 * ""            -> Optional.empty
 * <p>
 * Think about: null or empty text, upper/lower case (treat 'A' and 'a' as different).
 */
public class FirstNonRepeatingQuestion {

    static Optional<Character> firstNonRepeating(String text) {
        if (text == null) {
            return Optional.empty();
        }
        return text.chars().mapToObj(v->(char)v)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream().filter(v->v.getValue()==1L)
                .map(Map.Entry::getKey).findFirst();

    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("programming"));
        System.out.println(firstNonRepeating("aabbcd"));
        System.out.println(firstNonRepeating("aabb"));
        System.out.println(firstNonRepeating(""));
    }
}
