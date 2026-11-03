package com.codekatha.machinecodingpractice.mine.questofmock.secondhighest;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Question 12 (streams coding): Second highest paid employee
 * <p>
 * Return the employee with the second highest salary, using streams only.
 * Assume all salaries are different (duplicates come as a follow-up).
 * <p>
 * Sample input:
 * Asha  (IT, 90000), Ravi (HR, 70000), Neha (IT, 120000), Kiran (Ops, 80000)
 * <p>
 * Expected output:
 * Optional[Employee[name=Asha, dept=IT, salary=90000.0]]
 * <p>
 * Edge case to think about: a list with fewer than 2 employees should return Optional.empty().
 */
public class SecondHighestPaidQuestion {

    record Employee(String name, String dept, double salary) {
    }

    static Optional<Employee> secondHighestPaid(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .skip(1).findFirst();
    }

    static List<Employee> secondHighestPaidAll(List<Employee> employees) {
        Optional<Double> secondSalary = employees.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        return employees.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .filter(e -> e.salary == secondSalary.get()
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees1 = List.of(
                new Employee("Asha", "IT", 90000),
                new Employee("Ravi", "HR", 70000),
                new Employee("Neha", "IT", 120000),
                new Employee("Kiran", "Ops", 80000)
        );

        List<Employee> employees2 = List.of(new Employee("Asha", "IT", 120000),
                new Employee("Neha", "IT", 120000),
                new Employee("Ravi", "HR", 90000),
                new Employee("Kiran", "Ops", 90000),
                new Employee("Mohan", "Ops", 70000));

        System.out.println(secondHighestPaid(employees1).get());
        System.out.println(secondHighestPaid(List.of(new Employee("Solo", "IT", 50000))));

        System.out.println(secondHighestPaidAll(employees2));
    }
}
