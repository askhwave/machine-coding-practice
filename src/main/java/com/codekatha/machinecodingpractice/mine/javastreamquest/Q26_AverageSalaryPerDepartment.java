package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Q26. Calculate the average salary of employees per department
 */
public class Q26_AverageSalaryPerDepartment {

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
        System.out.println("===== Q26: Calculate the average salary of employees per department =====");

        // TODO: har department ki average salary print karo
        Map<String,Double> map = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ));
        System.out.println(map);

    }
}
