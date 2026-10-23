package com.codekatha.machinecodingpractice.mine.java8quest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 * Q1. How to create streams in Java?
 *
 * Goal: Stream banane ke jitne tareeke yaad hain, sab yahan likho aur run karke dekho.
 * Hint (sirf sochne ke liye): source kya-kya ho sakta hai?
 *  collection | array | values directly | primitives | generate/iterate | string/file | empty
 */
public class Q01_CreateStreams {

    // ---------- Sample data (isko use karo apne stream banane ke liye) ----------
    static final List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    static final Set<String> nameSet = new HashSet<>(Arrays.asList("Aman", "Ankit", "Riya"));
    static final Map<String, Integer> ageMap = new HashMap<>();
    static final int[] intArray = {10, 20, 30, 40, 50};
    static final String[] stringArray = {"java", "spring", "kafka"};
    static final String sentence = "hello streams";

    static {
        ageMap.put("Aman", 32);
        ageMap.put("Ankit", 28);
    }

    public static void main(String[] args) {
        System.out.println("===== Q1: How to create streams in Java? =====");

        // TODO 1: List / Collection se stream
        Stream<Integer> listStream = numberList.stream();
        print("listStream",listStream);

        // TODO 2: Array se stream (object array + int array dono try karo)
        IntStream intArrStream = Arrays.stream(intArray);
        print("intArrStream",intArrStream);

        Stream<Object> ObjStream = Arrays.stream(stringArray).map(val -> (Object) val);
        print("objStream",ObjStream);

        // TODO 3: Seedhe values se stream (Stream.of)
        Stream<Integer> streams = Stream.of(1,3,4,5,67,8,8,89);
        print("streams",streams);


        // TODO 4: Primitive stream (IntStream range / rangeClosed)
        IntStream range1 = IntStream.range(0, 5); // 0->4
        IntStream range2 = IntStream.rangeClosed(0,4); // 0->4

        print("range1",range1);
        print("range2",range2);


        // TODO 5: Infinite stream (generate / iterate) -- limit lagana mat bhoolna!
        // iterate : stsrtingPoint, rule
        Stream<Integer> evenNumbers = Stream.iterate(0, x -> x + 2).limit(5);
        // generate : ek hi chiz baar baar
        Stream<String> hello5times = Stream.generate(()->"hello").limit(5);
        Stream<Double> fiveRandomNums = Stream.generate(Math::random).limit(5);

        print("evenNumbers",evenNumbers);
        print("hello5times",hello5times);
        print("fiveRandomNums",fiveRandomNums);



        // TODO 6: Set / Map se stream (Map me kya alag hai?)
        Stream<String> setStream = nameSet.stream();
        Stream<Map.Entry<String, Integer>> mapStream = ageMap.entrySet().stream();

        print("setStream",setStream);
        print("mapStream",mapStream);


        // TODO 7: String ke characters ka stream
        Stream<Character> charsStream = sentence.chars().mapToObj(val -> (char) val);
        print("charsStream",charsStream);


        // TODO 8: Empty stream
        Stream<Object> emptyStrm = Stream.empty();
        print("emptyStrm",emptyStrm);

    }

    // ---------- Helper: kisi bhi stream ko label ke saath print karne ke liye ----------
    // Usage: print("list stream", numberList.stream());
    static <T> void print(String label, Stream<T> stream) {
        System.out.println(label + " -> " + stream.map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));
    }

    static void print(String label, IntStream stream) {
        print(label, stream.boxed());
    }
}
