package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p15_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #146 - LRU Cache  [Medium]  [EXTRA - same pattern, practice ke liye]
 * Link   : https://leetcode.com/problems/lru-cache/
 * Pattern: Design Data Structures
 *
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class: LRUCache(int capacity) initializes the LRU cache with positive
 * size capacity. int get(int key) returns the value of the key if the key exists, otherwise
 * returns -1. void put(int key, int value) updates the value of the key if the key exists.
 * Otherwise, adds the key-value pair to the cache. If the number of keys exceeds the capacity
 * from this operation, evict the least recently used key. The functions get and put must each
 * run in O(1) average time complexity.
 *
 * Example 1:
 * <pre>
 * Input: ["LRUCache","put","put","get","put","get","put","get","get","get"]
 *        [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
 * Output: [null,null,null,1,null,-1,null,-1,3,4]
 * </pre>
 *
 * Constraints:
 *  - 1 <= capacity <= 3000
 *  - 0 <= key <= 10^4
 *  - 0 <= value <= 10^5
 *  - At most 2 * 10^5 calls will be made to get and put.
 *
 * Hint (spoiler - pehle khud try karo): HashMap&lt;key, Node> + doubly linked list (head = most recent, tail = least recent). Pehle khud banao; baad me LinkedHashMap (accessOrder=true) wala shortcut bhi dekho - interviewer manual impl maangta hai.
 */
public class LC0146_LRUCache {

    static class LRUCache {
        // TODO: Node class (key, val, prev, next) + map + head/tail dummy nodes

        public LRUCache(int capacity) {
        }

        public int get(int key) {
            return -1;
        }

        public void put(int key, int value) {
        }
    }

    public static void main(String[] args) {
        LC0146_LRUCache sol = new LC0146_LRUCache();
        Check.start("LC0146_LRUCache");
        LRUCache c = new LRUCache(2);
        c.put(1, 1); c.put(2, 2);
        Check.eq("1", () -> c.get(1));
        c.put(3, 3);                    // evicts key 2
        Check.eq("-1", () -> c.get(2));
        c.put(4, 4);                    // evicts key 1
        Check.eq("-1", () -> c.get(1));
        Check.eq("3", () -> c.get(3));
        Check.eq("4", () -> c.get(4));
        Check.summary();
    }
}
