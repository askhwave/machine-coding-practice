package com.codekatha.machinecodingpractice.mine.java8quest;

/**
 * Shared model class: aage ke kai questions (Q25, Q26, Q27, Q38...) me use hogi.
 */
public class Employee {
    private final String name;
    private final String department;
    private final double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "(" + department + ", " + salary + ")";
    }
}
