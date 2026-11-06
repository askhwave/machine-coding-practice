package com.codekatha.machinecodingpractice.mine.questofmock.streams.rangegroup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Q20 (EPAM): Group numbers by range using Java 8 streams
 * <p>
 * Given an int array, group the numbers into ranges of 10: "0-9", "10-19", "20-29", ...
 * Use Java 8 streams. The result map must be sorted by range (smallest range first).
 * Numbers inside a range keep their original order.
 * <p>
 * Input:  {1, 5, 12, 18, 23, 9, 30, 35, 19, 0}
 * <p>
 * Expected output:
 * {0-9=[1, 5, 9, 0], 10-19=[12, 18, 19], 20-29=[23], 30-39=[30, 35]}
 */
public class RangeGroupQuestion {

    static Map<String, List<Integer>> groupByRange(int[] numbers) {
        // TODO
        Map<String, List<Integer>> ans = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(
                n -> {
                    int start = (n / 10) * 10;
                    return start + "-" + (start + 9);
                },
                TreeMap::new,
                Collectors.toList()
        ));
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 12, 18, 23, 9, 30, 35, 19, 0};
        System.out.println(groupByRange(numbers));
    }
}
