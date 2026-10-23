package com.codekatha.machinecodingpractice.mine.dsaquest.secondphase.p15_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;

/**
 * LeetCode #380 - Insert Delete GetRandom O(1)  [Medium]
 * Link   : https://leetcode.com/problems/insert-delete-getrandom-o1/
 * Pattern: Design Data Structures
 *
 * Implement the RandomizedSet class: RandomizedSet() initializes the RandomizedSet object.
 * bool insert(int val) inserts an item val into the set if not present. Returns true if the
 * item was not present, false otherwise. bool remove(int val) removes an item val from the set
 * if present. Returns true if the item was present, false otherwise. int getRandom() returns a
 * random element from the current set of elements (it's guaranteed that at least one element
 * exists when this method is called). Each element must have the same probability of being
 * returned. You must implement the functions of the class such that each function works in
 * average O(1) time complexity.
 *
 * Example 1:
 * <pre>
 * Input: ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
 *        [[],[1],[2],[2],[],[1],[2],[]]
 * Output: [null,true,false,true,2,true,false,2]
 * </pre>
 *
 * Constraints:
 *  - -2^31 <= val <= 2^31 - 1
 *  - At most 2 * 10^5 calls will be made to insert, remove, and getRandom.
 *  - There will be at least one element in the data structure when getRandom is called.
 *
 * Hint (spoiler - pehle khud try karo): ArrayList (random access) + HashMap&lt;val, index>. Remove: last element ko us index par laao (swap-with-last), phir last hatao.
 */
public class LC0380_InsertDeleteGetRandomO1 {

    static class RandomizedSet {
        // TODO: List<Integer> + Map<Integer, Integer>

        public RandomizedSet() {
        }

        public boolean insert(int val) {
            return false;
        }

        public boolean remove(int val) {
            return false;
        }

        public int getRandom() {
            return 0;
        }
    }

    public static void main(String[] args) {
        LC0380_InsertDeleteGetRandomO1 sol = new LC0380_InsertDeleteGetRandomO1();
        Check.start("LC0380_InsertDeleteGetRandomO1");
        RandomizedSet rs = new RandomizedSet();
        Check.eq("true", () -> rs.insert(1));
        Check.eq("false", () -> rs.remove(2));
        Check.eq("true", () -> rs.insert(2));
        Check.eq(true, () -> { int v = rs.getRandom(); return v == 1 || v == 2; });
        Check.eq("true", () -> rs.remove(1));
        Check.eq("false", () -> rs.insert(2));
        Check.eq("2", () -> rs.getRandom());
        Check.summary();
    }
}
