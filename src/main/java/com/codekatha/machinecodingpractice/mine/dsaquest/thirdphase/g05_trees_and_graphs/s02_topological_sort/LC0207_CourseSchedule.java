package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g05_trees_and_graphs.s02_topological_sort;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #207 - Course Schedule  [LeetCode: Medium | Cheatsheet: Round 2 F2F | Medium]
 * Link   : https://leetcode.com/problems/course-schedule/
 * Group  : Trees & Graphs  >  Topological Sort (Kahn / DFS)
 * Revision: pehle bhi aa chuka hai (secondphase/p10_graph_grid). Bina dekhe dobara solve karo - Atlassian me yehi repeat hota hai.
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you
 * must take course bi first if you want to take course ai. Return true if you can finish all
 * courses. Otherwise, return false.
 *
 * Example 1:
 * <pre>
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * </pre>
 *
 * Constraints:
 *  - 1 <= numCourses <= 2000
 *  - 0 <= prerequisites.length <= 5000
 *  - prerequisites[i].length == 2
 *  - 0 <= ai, bi < numCourses
 *  - All the pairs prerequisites[i] are unique.
 *
 * Hint (spoiler - pehle khud try karo): Directed graph me cycle detection. Kahn's algorithm (indegree + BFS): saare nodes process ho gaye to true.
 */
public class LC0207_CourseSchedule {

    // TODO: apna solution yahan likho
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return false;
    }

    public static void main(String[] args) {
        LC0207_CourseSchedule sol = new LC0207_CourseSchedule();
        Check.start("LC0207_CourseSchedule");
        Check.eq("true", () -> sol.canFinish(2, new int[][]{{1,0}}));
        Check.eq("false", () -> sol.canFinish(2, new int[][]{{1,0},{0,1}}));
        Check.summary();
    }
}
