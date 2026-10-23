package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.util.Arrays;
import java.util.List;

/**
 * Q40. Find employees who worked in 3+ departments
 */
public class Q40_EmployeesInThreePlusDepartments {

    // ---------- Model ----------
    static class EmployeeHistory {
        private final String name;
        private final List<String> departmentsWorked;   // same department kai baar aa sakta hai

        EmployeeHistory(String name, List<String> departmentsWorked) {
            this.name = name;
            this.departmentsWorked = departmentsWorked;
        }

        public String getName() {
            return name;
        }

        public List<String> getDepartmentsWorked() {
            return departmentsWorked;
        }

        @Override
        public String toString() {
            return name + departmentsWorked;
        }
    }

    // ---------- Sample data ----------
    static final List<EmployeeHistory> histories = Arrays.asList(
            new EmployeeHistory("Aman", Arrays.asList("IT", "HR", "Finance", "IT")),
            new EmployeeHistory("Ankit", Arrays.asList("IT", "IT")),
            new EmployeeHistory("Riya", Arrays.asList("HR", "Sales")),
            new EmployeeHistory("Rahul", Arrays.asList("Finance", "IT", "Sales", "HR")),
            new EmployeeHistory("Sneha", Arrays.asList("IT")),
            new EmployeeHistory("Anil", Arrays.asList("Finance", "HR", "Finance"))
    );

    public static void main(String[] args) {
        System.out.println("===== Q40: Find employees who worked in 3+ departments =====");

        // TODO: un employees ke naam print karo jinhone 3 ya zyada ALAG-ALAG departments me kaam kiya hai
        // Expected: [Aman, Rahul]
        // (dhyan do: Anil ki list me 3 entries hain, par departments sirf 2 alag hain)

        List<String> names = histories.stream()
                .filter(h->h.getDepartmentsWorked().stream().distinct().count()>=3)
                .map(EmployeeHistory::getName).toList();
        System.out.println(names);

    }
}
