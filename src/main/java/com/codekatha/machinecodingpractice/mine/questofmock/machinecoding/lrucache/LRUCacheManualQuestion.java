package com.codekatha.machinecodingpractice.mine.questofmock.machinecoding.lrucache;

import java.util.HashMap;
import java.util.Map;

/**
 * Q15 (part 2): LRU Cache without LinkedHashMap
 * <p>
 * Same rules as LRUCacheQuestion, but you must NOT use LinkedHashMap
 * (and do not extend any Map class). Build the data structure yourself.
 * - get(key): returns the value, or -1 if the key is not present. A get counts as a "use".
 * - put(key, value): inserts or updates the key. A put counts as a "use".
 * If the cache is over capacity after the put, remove the least recently used key.
 * - Both get and put must be O(1).
 * <p>
 * Expected output:
 * 10
 * -1
 * -1
 * 30
 * 40
 */
public class LRUCacheManualQuestion {

    static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class LRUCache {

        private int capacity;
        private Map<Integer, Node> map;
        private Node head;
        private Node tail;

        LRUCache(int capacity) {
            map = new HashMap<>();
            this.capacity = capacity;
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            Node node =  map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }

        void put(int key, int value) {
            if (map.containsKey(key)) {
                remove(map.get(key));
            }
            if(map.size()>=capacity){
                remove(tail.prev);
            }
            insert(new Node(key, value));
        }

        void insert(Node node) {
            map.put(node.key, node);
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
        }

        void remove(Node node) {
            map.remove(node.key, node);
            node.prev.next = node.next;
            node.next.prev = node.prev;
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
