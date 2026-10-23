package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Q33. Calculate moving average (sliding window) of elements
 */
public class Q33_MovingAverage {

    // ---------- Sample data ----------
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    static final int windowSize = 3;

    public static void main(String[] args) {
        System.out.println("===== Q33: Calculate moving average (sliding window) of elements =====");

        // TODO: windowSize = 3 ke saath moving average nikalo.
        // Expected: [2.0, 3.0, 4.0, 5.0, 6.0, 7.0]  (pehla = (1+2+3)/3, doosra = (2+3+4)/3, ...)

        List<Double> avgList = IntStream.rangeClosed(0,numbers.size()-windowSize)
                .mapToObj(i -> numbers.subList(i,i+windowSize))
                .map(v->
                        v.stream().mapToInt(Integer::intValue).average().orElse(0.0)
                        ).toList();
        System.out.println(avgList);

    }
}
