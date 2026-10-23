package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q38. Group employees by salary range (low, medium, high)
 */
public class Q38_GroupEmployeesBySalaryRange {

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
        System.out.println("===== Q38: Group employees by salary range =====");

        // TODO: employees ko salary range ke hisaab se group karo:
        //   LOW    : salary < 50000
        //   MEDIUM : 50000 <= salary < 80000
        //   HIGH   : salary >= 80000
        // Expected: LOW=[Raj, Neha], MEDIUM=[Ankit, Riya, Sneha, Anil, Pooja], HIGH=[Aman, Rahul, Amit]

        var map = employees.stream().collect(Collectors.groupingBy(
                e -> getGroup(e.getSalary()),
                Collectors.mapping(Employee::getName,Collectors.toList())
        ));
        System.out.println(map);

    }

    private static String getGroup(Double amt){
        if(amt<50000.0){
            return "LOW";
        } else if (amt< 80000 && 50000<=amt) {
            return "MEDIUM";
        }else{
            return "HIGH";
        }
    }
}
