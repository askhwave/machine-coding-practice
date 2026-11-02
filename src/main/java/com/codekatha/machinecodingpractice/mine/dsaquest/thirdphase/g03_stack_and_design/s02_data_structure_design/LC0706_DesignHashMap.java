package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g03_stack_and_design.s02_data_structure_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #706 - Design HashMap  [LeetCode: Easy | Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/problems/design-hashmap/
 * Group  : Stack & Design  >  Data Structure Design
 *
 * Design a HashMap without using any built-in hash table libraries. Implement the MyHashMap
 * class: MyHashMap() initializes the object with an empty map. void put(int key, int value)
 * inserts a (key, value) pair into the HashMap. If the key already exists in the map, update
 * the corresponding value. int get(int key) returns the value to which the specified key is
 * mapped, or -1 if this map contains no mapping for the key. void remove(int key) removes the
 * key and its corresponding value if the map contains the mapping for the key.
 *
 * Example 1:
 * <pre>
 * Input: ["MyHashMap","put","put","get","get","put","get","remove","get"]
 *        [[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
 * Output: [null,null,null,1,-1,null,1,null,-1]
 * </pre>
 *
 * Constraints:
 *  - 0 <= key, value <= 10^6
 *  - At most 10^4 calls will be made to put, get, and remove.
 *
 * Hint (spoiler - pehle khud try karo): Array of buckets (size ~1009, prime) + har bucket me linked list (chaining). index = key % size. put: chain me dhundo, mila to update warna add; remove: prev pointer ke saath node hatao.
 */
public class LC0706_DesignHashMap {

    static class MyHashMap {
        // TODO: bucket array (Node: key, val, next) + index = key % SIZE

        public MyHashMap() {
        }

        public void put(int key, int value) {
        }

        public int get(int key) {
            return -1;
        }

        public void remove(int key) {
        }
    }

    public static void main(String[] args) {
        LC0706_DesignHashMap sol = new LC0706_DesignHashMap();
        Check.start("LC0706_DesignHashMap");
        MyHashMap m = new MyHashMap();
        m.put(1, 1); m.put(2, 2);
        Check.eq(1, () -> m.get(1));
        Check.eq(-1, () -> m.get(3));
        m.put(2, 1);                       // update, naya entry nahi
        Check.eq(1, () -> m.get(2));
        m.remove(2);
        Check.eq(-1, () -> m.get(2));
        MyHashMap c = new MyHashMap();     // collisions: ye keys 1009 / 1000 / 769 jaisi bucket sizes pe same bucket me aati hain
        int[] ks = {5, 1014, 2023, 774, 1005, 1029, 0, 1000000};
        for (int k : ks) c.put(k, k + 1);
        Check.eq(true, () -> { for (int k : ks) if (c.get(k) != k + 1) return false; return true; });
        c.remove(1014);                    // chain ke beech se hatao
        Check.eq(-1, () -> c.get(1014));
        Check.eq(true, () -> c.get(2023) == 2024 && c.get(5) == 6 && c.get(774) == 775);
        Check.eq(-1, () -> { c.remove(777); return c.get(777); });   // missing key remove: crash nahi
        c.put(9, 0);
        Check.eq(0, () -> c.get(9));       // value 0 valid hai, -1 sirf "nahi mila" ke liye
        c.put(5, 50);
        Check.eq(50, () -> c.get(5));      // overwrite
        MyHashMap big = new MyHashMap();
        for (int i = 0; i < 10000; i++) big.put(i * 7, i);
        Check.eq(true, () -> { for (int i = 0; i < 10000; i++) if (big.get(i * 7) != i) return false; return big.get(1) == -1; });
        Check.summary();
    }
}
