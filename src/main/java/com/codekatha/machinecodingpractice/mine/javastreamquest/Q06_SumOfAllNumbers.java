package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;

/**
 * Q6. Calculate the sum of all numbers
 */
public class Q06_SumOfAllNumbers {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("===== Q6: Calculate the sum of all numbers =====");

        // TODO: numbers ka sum print karo
        Integer sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println("sum: "+sum);

        //Another method
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum2: "+ sum2);



    }
}
