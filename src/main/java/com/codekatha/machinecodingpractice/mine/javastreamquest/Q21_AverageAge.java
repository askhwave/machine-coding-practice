package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;

/**
 * Q21. Find the average age of a list of objects
 */
public class Q21_AverageAge {

    // ---------- Model ----------
    static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    // ---------- Sample data ----------
    static final List<Person> people = Arrays.asList(
            new Person("Aman", 32),
            new Person("Ankit", 28),
            new Person("Riya", 25),
            new Person("Rahul", 40),
            new Person("Sneha", 30)
    );

    public static void main(String[] args) {
        System.out.println("===== Q21: Find the average age of a list of objects =====");

        // TODO: people ki average age print karo
        Double avgAge = people.stream().mapToInt(p-> p.getAge()).average().orElse(0.0);
        System.out.println(avgAge);

    }
}
