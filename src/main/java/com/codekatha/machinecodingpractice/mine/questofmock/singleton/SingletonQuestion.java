package com.codekatha.machinecodingpractice.mine.questofmock.singleton;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Q16 (EPAM): Thread-safe Singleton
 * <p>
 * Make AppConfig a Singleton:
 * - Only one instance may ever exist, even if 1000 calls to getInstance() happen at the same time.
 * - The instance must be created lazily (only when getInstance() is called the first time).
 * - Nobody outside the class should be able to create an AppConfig with "new".
 * <p>
 * Expected output:
 * Distinct instances created: 1
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

class AppConfig implements Cloneable, Serializable {

    // TODO: fields
    private static volatile AppConfig INSTANCE;

    // TODO: constructor
    private AppConfig() {
        if (INSTANCE != null)
            throw new RuntimeException("Please use getInstance method");
    }

    public static AppConfig getInstance() {
        if (INSTANCE == null) {
            synchronized (AppConfig.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppConfig();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() {
        return getInstance();
    }

    @Serial
    private Object readResolve() {
        return getInstance();
    }
}
