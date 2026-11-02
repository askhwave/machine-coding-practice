package com.codekatha.machinecodingpractice.mine.questofmock.revision;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Q26 (EPAM, revision): Highest paid employee's name per department
 *
 * Using Java 8 streams, return a Map where:
 *   key   = department
 *   value = name of the highest paid employee in that department (String, not Optional)
 *
 * Expected output (order of keys may vary):
 *   {Finance=Karan, HR=Priya, IT=Ravi}
 */
public class HighestPaidNameQuestion {

    record Employee(int id, String name, String department, double salary) {}

    static Map<String, String> highestPaidName(List<Employee> employees) {
        // TODO
//        collectingAndThen
//                ( kaunsa collector chalana hai ,
//                        uske result par kaunsa function lagana hai )
        return employees.stream().collect(Collectors.groupingBy(
                Employee::department,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingDouble(Employee::salary)),
                        opt ->
                                opt.map(Employee::name).orElse("-")
                )
        ));
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Aman", "IT", 50000),
                new Employee(2, "Ravi", "IT", 70000),
                new Employee(3, "Neha", "HR", 40000),
                new Employee(4, "Priya", "HR", 60000),
                new Employee(5, "Karan", "Finance", 80000));

        System.out.println(highestPaidName(employees));
    }
}
