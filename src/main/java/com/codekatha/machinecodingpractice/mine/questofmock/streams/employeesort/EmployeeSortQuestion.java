package com.codekatha.machinecodingpractice.mine.questofmock.streams.employeesort;

import java.util.Comparator;
import java.util.List;

/**
 * Question 63 (streams): sort employees by salary, then by name
 * <p>
 * Employee class and the data list are already given. You write the stream pipelines.
 * <p>
 * Task 1: employees.stream() ... sorted by salary ASCENDING, same salary then name ASCENDING.
 * Print each employee. Expected order of names:
 * Chetan, Rohan, Zara, Amit, Bhavna
 * <p>
 * Task 2: sorted by salary DESCENDING, same salary then name ASCENDING.
 * Expected order of names:
 * Amit, Bhavna, Rohan, Zara, Chetan
 * <p>
 * Do each task in two ways:
 * A) Comparator.comparing(...).thenComparing(...)
 * B) hand-written lambda (a, b) -> ... using Double.compare (not subtraction) and String compareTo
 * <p>
 * Think about: why does .reversed() at the very end of the whole chain give a wrong result for Task 2?
 * Bonus: collect the sorted result into a List<String> of names only.
 */
public class EmployeeSortQuestion {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rohan", 50000, "IT"),
                new Employee("Amit", 70000, "HR"),
                new Employee("Zara", 50000, "IT"),
                new Employee("Bhavna", 70000, "HR"),
                new Employee("Chetan", 40000, "FIN")
        );

        // Task 1 (A and B)
        List<Employee> emplist1 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .toList();


        // Task 2 (A and B)
        List<Employee> emplist2 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))
                .toList();

        System.out.println(emplist1);
        System.out.println(emplist2);

        List<Employee> emplist3 = employees.stream()
                .sorted((a, b) -> {
                    int v = Double.compare(b.getSalary(), a.getSalary());
                    if (v != 0) {
                        return v;
                    }
                    return a.getName().compareTo(b.getName());
                }).toList();
        System.out.println(emplist3);


    }
}
