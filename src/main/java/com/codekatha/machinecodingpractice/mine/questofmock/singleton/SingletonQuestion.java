package com.codekatha.machinecodingpractice.mine.questofmock.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Q16 (EPAM): Thread-safe Singleton
 *
 * Make AppConfig a Singleton:
 *   - Only one instance may ever exist, even if 1000 calls to getInstance() happen at the same time.
 *   - The instance must be created lazily (only when getInstance() is called the first time).
 *   - Nobody outside the class should be able to create an AppConfig with "new".
 *
 * Expected output:
 *   Distinct instances created: 1
 */
public class SingletonQuestion {

    public static void main(String[] args) throws InterruptedException {
        Set<AppConfig> instances = ConcurrentHashMap.newKeySet();
        ExecutorService pool = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 1000; i++) {
            pool.execute(() -> instances.add(AppConfig.getInstance()));
        }

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Distinct instances created: " + instances.size());
    }
}

class AppConfig {

    // TODO: fields

    // TODO: constructor

    static AppConfig getInstance() {
        // TODO
        return new AppConfig();
    }
}
