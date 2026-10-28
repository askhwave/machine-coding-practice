package com.codekatha.machinecodingpractice.mine.questofmock.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Q15 (Airtel / EPAM): LRU Cache
 * <p>
 * Design a cache with a fixed capacity that removes the Least Recently Used entry when it is full.
 * - get(key): returns the value, or -1 if the key is not present. A get counts as a "use".
 * - put(key, value): inserts or updates the key. A put counts as a "use".
 * If the cache is over capacity after the put, remove the least recently used key.
 * - Both get and put should be O(1).
 * <p>
 * Example (capacity = 2):
 * put(1, 10)
 * put(2, 20)
 * get(1)      -> 10
 * put(3, 30)  // evicts key 2
 * get(2)      -> -1
 * put(4, 40)  // evicts key 1
 * get(1)      -> -1
 * get(3)      -> 30
 * get(4)      -> 40
 */
public class LRUCacheQuestion {

    static class LRUCache<K, V> extends LinkedHashMap<Integer, Integer> {

        // TODO: fields
        int capacity;

        LRUCache(int capacity) {
            // TODO
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }


        int get(int key) {
            // TODO
            var value = super.get(key);
            if (value == null) {
                return -1;
            }
            return value;

        }
//
//        void put(int key, int value) {
//            // TODO
//        }


        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // 10
        cache.put(3, 30);
        System.out.println(cache.get(2)); // -1
        cache.put(4, 40);
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}
