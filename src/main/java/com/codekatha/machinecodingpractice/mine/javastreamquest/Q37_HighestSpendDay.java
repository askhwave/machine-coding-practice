package com.codekatha.machinecodingpractice.mine.javastreamquest;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Q37. Find the day with the highest total spend (transactions)
 */
public class Q37_HighestSpendDay {

    // ---------- Model ----------
    static class Transaction {
        private final int id;
        private final LocalDate date;
        private final double amount;

        Transaction(int id, LocalDate date, double amount) {
            this.id = id;
            this.date = date;
            this.amount = amount;
        }

        public int getId() {
            return id;
        }

        public LocalDate getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "T" + id + "(" + date + ", " + amount + ")";
        }
    }

    // ---------- Sample data ----------
    static final List<Transaction> transactions = Arrays.asList(
            new Transaction(1, LocalDate.of(2026, 10, 1), 500),
            new Transaction(2, LocalDate.of(2026, 10, 1), 300),
            new Transaction(3, LocalDate.of(2026, 10, 2), 1200),
            new Transaction(4, LocalDate.of(2026, 10, 3), 400),
            new Transaction(5, LocalDate.of(2026, 10, 3), 450),
            new Transaction(6, LocalDate.of(2026, 10, 3), 600),
            new Transaction(7, LocalDate.of(2026, 10, 4), 700),
            new Transaction(8, LocalDate.of(2026, 10, 4), 200)
    );

    public static void main(String[] args) {
        System.out.println("===== Q37: Find the day with the highest total spend =====");

        // TODO: jis din ka total kharcha sabse zyada hai, wo din aur uska total print karo
        // Expected: 2026-10-03 (total 1450.0)

        var val = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)
                )).entrySet().stream()
                .sorted(Map.Entry.comparingByValue((v1, v2)
                        -> v2.compareTo(v1))).findFirst();
                //.map(Map.Entry::getKey).findFirst().orElseThrow();
        System.out.println(val.get());
    }
}
