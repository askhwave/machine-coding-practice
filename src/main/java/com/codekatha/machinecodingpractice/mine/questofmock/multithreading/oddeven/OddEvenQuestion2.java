package com.codekatha.machinecodingpractice.mine.questofmock.multithreading.oddeven;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Q14 (Airtel / EPAM / Publicis Sapient): Print odd and even numbers alternately
 * <p>
 * Use two threads: one prints odd numbers, the other prints even numbers.
 * Together they must print 1 to MAX in order, one number at a time.
 * The output order must always be the same (not random).
 * main must wait for both threads to finish before printing "Done".
 * <p>
 * Expected output:
 * Thread-odd  -> 1
 * Thread-even -> 2
 * Thread-odd  -> 3
 * Thread-even -> 4
 * ...
 * Thread-even -> 10
 * Done
 */
public class OddEvenQuestion2 {

    static final int MAX = 10;
    static int count = 1;
    static final Lock lock = new ReentrantLock();
    static final Condition condition = lock.newCondition();

    static void printOddEven(int rem) throws InterruptedException {
        lock.lock();
        try {

            while (count <= MAX) {
                if (count % 2 == rem) {
                    System.out.println(Thread.currentThread().getName() +
                            " -> "
                            + count);
                    count++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO: create the odd thread (name: "Thread-odd")
        Thread odd = new Thread(() -> {

            try {
                printOddEven(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, "Thread-odd");

        // TODO: create the even thread (name: "Thread-even")
        Thread even = new Thread(() -> {
            try {
                printOddEven(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-even");

        // TODO: start both threads
        odd.start();
        even.start();

        // TODO: wait for both threads to finish
        odd.join();
        even.join();

        System.out.println("Done");
    }
}
