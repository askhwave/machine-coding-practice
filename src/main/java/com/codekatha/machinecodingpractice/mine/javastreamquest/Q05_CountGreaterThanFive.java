package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q5. Count numbers greater than 5
 */
public class Q05_CountGreaterThanFive {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q5: Count numbers greater than 5 =====");

        // TODO: numbers me 5 se bade kitne numbers hain? print karo
        Long numsGraterThanFive = numbers.stream().filter(x -> x > 5)
                .collect(Collectors.counting());
        System.out.println("numsGraterThanFive: "+numsGraterThanFive);


    }
}
