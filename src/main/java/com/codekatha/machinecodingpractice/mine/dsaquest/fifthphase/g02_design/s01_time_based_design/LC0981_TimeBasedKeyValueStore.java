package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g02_design.s01_time_based_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #981 - Time Based Key-Value Store  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.402]
 * Link   : https://leetcode.com/problems/time-based-key-value-store/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Design (time-based & iterator)  >  Time-based Design
 *
 * Design a time-based key-value data structure that can store multiple values for the same key
 * at different time stamps and retrieve the key's value at a certain timestamp. Implement the
 * TimeMap class: TimeMap() Initializes the object of the data structure. void set(String key,
 * String value, int timestamp) Stores the key key with the value value at the given time
 * timestamp. String get(String key, int timestamp) Returns a value such that set was called
 * previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns
 * the value associated with the largest timestamp_prev. If there are no values, it returns "".
 *
 * Example 1:
 * <pre>
 * Input: ["TimeMap","set","get","get","set","get","get"]
 *        [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
 * Output: [null,null,"bar","bar",null,"bar2","bar2"]
 * </pre>
 *
 * Constraints:
 *  - 1 <= key.length, value.length <= 100
 *  - key and value consist of lowercase English letters and digits.
 *  - 1 <= timestamp <= 10^7
 *  - All the timestamps timestamp of set are strictly increasing.
 *  - At most 2 * 10^5 calls will be made to set and get.
 *
 * Hint (spoiler - pehle khud try karo): Per key sorted list of (timestamp, value) - set me bas append (timestamps increasing hain). get: us list me last timestamp <= t binary search se dhundo (upper bound - 1). Mila nahi to "".
 */
public class LC0981_TimeBasedKeyValueStore {

    static class TimeMap {
        // TODO: Map<String, List<...>> - per key (timestamp, value) pairs, binary search in get

        public TimeMap() {
        }

        public void set(String key, String value, int timestamp) {
        }

        public String get(String key, int timestamp) {
            return "";
        }
    }

    public static void main(String[] args) {
        LC0981_TimeBasedKeyValueStore sol = new LC0981_TimeBasedKeyValueStore();
        Check.start("LC0981_TimeBasedKeyValueStore");
        TimeMap tm = new TimeMap();
        tm.set("foo", "bar", 1);
        Check.eq("bar", () -> tm.get("foo", 1));
        Check.eq("bar", () -> tm.get("foo", 3));
        tm.set("foo", "bar2", 4);
        Check.eq("bar2", () -> tm.get("foo", 4));
        Check.eq("bar2", () -> tm.get("foo", 5));
        Check.eq("bar", () -> tm.get("foo", 3));   // purana timestamp ab bhi purani value de
        Check.eq("", () -> tm.get("foo", 0));      // pehle set se bhi pehle
        Check.eq("", () -> tm.get("nokey", 10));   // key hi nahi
        tm.set("baz", "x", 10);
        Check.eq("", () -> tm.get("baz", 9));
        Check.eq("x", () -> tm.get("baz", 10));
        Check.eq("bar2", () -> tm.get("foo", 1000000));   // keys independent
        TimeMap big = new TimeMap();   // 10^5 values ek hi key pe: get binary search se hona chahiye
        for (int i = 1; i <= 100000; i++) big.set("k", "v" + i, i * 2);
        Check.eq(true, () -> { for (int i = 1; i <= 100000; i++) { if (!big.get("k", i * 2).equals("v" + i) || !big.get("k", i * 2 + 1).equals("v" + i)) return false; } return big.get("k", 1).isEmpty(); });
        TimeMap tm2 = new TimeMap();   // random operations (python se verify kiye hue)
        Check.eq("", () -> tm2.get("b", 2));
        tm2.set("a", "v1", 1);
        Check.eq("", () -> tm2.get("b", 4));
        tm2.set("a", "v2", 2);
        tm2.set("c", "v6", 6);
        tm2.set("c", "v8", 8);
        tm2.set("a", "v10", 10);
        Check.eq("v8", () -> tm2.get("c", 9));
        Check.eq("v2", () -> tm2.get("a", 6));
        Check.eq("", () -> tm2.get("c", 4));
        Check.eq("v10", () -> tm2.get("a", 11));
        Check.eq("", () -> tm2.get("b", 12));
        Check.eq("", () -> tm2.get("b", 6));
        tm2.set("b", "v11", 11);
        Check.eq("", () -> tm2.get("a", 0));
        tm2.set("b", "v15", 15);
        tm2.set("b", "v17", 17);
        Check.eq("", () -> tm2.get("b", 3));
        tm2.set("c", "v19", 19);
        tm2.set("a", "v20", 20);
        Check.eq("", () -> tm2.get("a", 0));
        tm2.set("c", "v24", 24);
        Check.eq("v8", () -> tm2.get("c", 13));
        tm2.set("a", "v25", 25);
        Check.eq("", () -> tm2.get("c", 5));
        Check.eq("", () -> tm2.get("c", 1));
        tm2.set("a", "v27", 27);
        tm2.set("c", "v28", 28);
        Check.eq("v25", () -> tm2.get("a", 25));
        tm2.set("a", "v29", 29);
        tm2.set("c", "v30", 30);
        tm2.set("b", "v33", 33);
        tm2.set("b", "v35", 35);
        Check.eq("v24", () -> tm2.get("c", 24));
        tm2.set("c", "v39", 39);
        tm2.set("a", "v43", 43);
        tm2.set("b", "v44", 44);
        Check.eq("", () -> tm2.get("b", 6));
        Check.eq("", () -> tm2.get("c", 1));
        Check.eq("v17", () -> tm2.get("b", 27));
        tm2.set("b", "v46", 46);
        Check.eq("v24", () -> tm2.get("c", 27));
        tm2.set("c", "v50", 50);
        tm2.set("c", "v53", 53);
        Check.eq("v10", () -> tm2.get("a", 10));
        Check.eq("v8", () -> tm2.get("c", 16));
        tm2.set("a", "v55", 55);
        Check.eq("", () -> tm2.get("b", 7));
        tm2.set("c", "v56", 56);
        tm2.set("a", "v60", 60);
        Check.eq("v44", () -> tm2.get("b", 45));
        tm2.set("b", "v63", 63);
        Check.eq("v29", () -> tm2.get("a", 37));
        tm2.set("c", "v67", 67);
        tm2.set("b", "v71", 71);
        Check.eq("v19", () -> tm2.get("c", 21));
        Check.eq("v56", () -> tm2.get("c", 63));
        tm2.set("b", "v72", 72);
        Check.eq("v17", () -> tm2.get("b", 22));
        Check.eq("v19", () -> tm2.get("c", 20));
        Check.summary();
    }
}
