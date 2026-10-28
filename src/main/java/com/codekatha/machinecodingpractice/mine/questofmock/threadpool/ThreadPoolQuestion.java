package com.codekatha.machinecodingpractice.mine.questofmock.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Q13 (Publicis Sapient / EPAM): Thread pool basics
 * <p>
 * Create a fixed thread pool of 3 threads.
 * Submit 5 tasks. Each task prints its task number and the name of the thread running it.
 * Shut the pool down properly and make sure all tasks finish before "All tasks finished" is printed.
 * <p>
 * Expected output (thread names and order can vary):
 * Task 1 running on pool-1-thread-1
 * Task 2 running on pool-1-thread-2
 * Task 3 running on pool-1-thread-3
 * Task 4 running on pool-1-thread-1
 * Task 5 running on pool-1-thread-2
 * All tasks finished
 */
public class ThreadPoolQuestion {

    static final int POOL_SIZE = 3;
    static final int TASK_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        // TODO: create the thread pool (POOL_SIZE threads)
        ExecutorService executors = Executors.newFixedThreadPool(POOL_SIZE);

        // TODO: submit TASK_COUNT tasks; each prints "Task <n> running on <thread name>"
        for (int i = 1; i <= TASK_COUNT; i++) {
            final int taskNumber = i;
            Runnable task = () -> {
                System.out.println("Task "+taskNumber+" running on "+Thread.currentThread().getName());
            };
            executors.execute(task);
        }

        // TODO: shut the pool down and wait for the tasks to finish
        executors.shutdown();
        executors.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("All tasks finished");
    }
}
