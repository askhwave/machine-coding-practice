package com.codekatha.machinecodingpractice.mine.questofmock.multithreading.producerconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Question 47 (multithreading coding): Producer and consumer
 * <p>
 * One producer thread produces the numbers 1 to 5 and puts them into a shared buffer
 * that can hold at most 2 items. One consumer thread takes the numbers out and prints them.
 * <p>
 * Rules:
 * - The producer must wait when the buffer is full.
 * - The consumer must wait when the buffer is empty.
 * - Both threads must finish and the program must end on its own (no hanging).
 * <p>
 * Expected output (the interleaving can vary, the order of numbers must not):
 * Produced 1
 * Produced 2
 * Consumed 1
 * Produced 3
 * Consumed 2
 * ...
 * Consumed 5
 * Done
 * <p>
 * Use any approach you like. Think about how the consumer knows when to stop.
 */
public class ProducerConsumerQuestion {

    private static final int BUFFER_SIZE = 2;
    private static final int ITEM_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        // TODO: create the shared buffer (capacity BUFFER_SIZE)
        BlockingDeque<Integer> q = new LinkedBlockingDeque<>(BUFFER_SIZE);

        // TODO: create the producer thread (produces 1..ITEM_COUNT, prints "Produced <n>")
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= ITEM_COUNT; i++) {
                try {
                    q.put(i);
                    System.out.println("Produced " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // TODO: create the consumer thread (prints "Consumed <n>" for every item)
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= ITEM_COUNT; i++) {
                try {
                    int data = q.take();
                    System.out.println("Consumed " + data);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // TODO: start both threads and wait for both to finish
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        System.out.println("Done");
    }
}
