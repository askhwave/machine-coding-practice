package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q27. Find departments with more than two employees
 */
public class Q27_DepartmentsWithMoreThanTwoEmployees {

    // ---------- Sample data (Employee class same package me hai: Employee.java) ----------
    static final List<Employee> employees = Arrays.asList(
            new Employee("Aman", "IT", 90000),
            new Employee("Ankit", "IT", 70000),
            new Employee("Riya", "HR", 50000),
            new Employee("Rahul", "Finance", 80000),
            new Employee("Sneha", "IT", 60000),
            new Employee("Anil", "Finance", 65000),
            new Employee("Raj", "HR", 45000),
            new Employee("Amit", "IT", 85000),
            new Employee("Pooja", "Finance", 72000),
            new Employee("Neha", "Sales", 40000)
    );

    public static void main(String[] args) {
        System.out.println("===== Q27: Find departments with more than two employees =====");

        // TODO: jin departments me 2 se zyada employees hain, unke naam print karo
        List<String> deps = employees.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                )).entrySet().stream().filter((e) -> e.getValue() > 2)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(deps);

    }
}
