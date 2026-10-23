package com.codekatha.machinecodingpractice.mine.dsaquest.p01_hashing_counting;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #1436 - Destination City  [Easy]
 * Link   : https://leetcode.com/problems/destination-city/
 * Pattern: Hash Map / Set / Counting
 *
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct
 * path going from cityAi to cityBi. Return the destination city, that is, the city without any
 * path outgoing to another city. It is guaranteed that the graph of paths forms a line without
 * any loop, therefore, there will be exactly one destination city.
 *
 * Example 1:
 * <pre>
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: paths = [["A","Z"]]
 * Output: "Z"
 * </pre>
 *
 * Constraints:
 *  - 1 <= paths.length <= 100
 *  - paths[i].length == 2
 *  - 1 <= cityAi.length, cityBi.length <= 10
 *  - cityAi != cityBi
 *
 * Hint (spoiler - pehle khud try karo): Saare 'from' cities ka set; jo 'to' city us set me nahi hai wahi answer.
 */
public class LC1436_DestinationCity {

    // TODO: apna solution yahan likho
    public String destCity(List<List<String>> paths) {
        return "";
    }

    public static void main(String[] args) {
        LC1436_DestinationCity sol = new LC1436_DestinationCity();
        System.out.println(sol.destCity(List.of(List.of("London","New York"), List.of("New York","Lima"), List.of("Lima","Sao Paulo")))); // Sao Paulo
        System.out.println(sol.destCity(List.of(List.of("B","C"), List.of("D","B"), List.of("C","A")))); // A
    }
}
