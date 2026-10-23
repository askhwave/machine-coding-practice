package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.p06_strings;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #71 - Simplify Path  [Medium]
 * Link   : https://leetcode.com/problems/simplify-path/
 * Pattern: String Manipulation & Simulation
 *
 * You are given an absolute path for a Unix-style file system, which always begins with a
 * slash '/'. Your task is to transform this absolute path into its simplified canonical path.
 * In a Unix-style file system, a period '.' refers to the current directory, a double period
 * '..' refers to the directory up a level, and any multiple consecutive slashes are treated as
 * a single slash '/'. The canonical path should start with a single slash '/', directories
 * must be separated by a single slash, must not end with a slash (unless it is the root), and
 * must not have any '.' or '..'.
 *
 * Example 1:
 * <pre>
 * Input: path = "/home/"
 * Output: "/home"
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: path = "/home/user/Documents/../Pictures"
 * Output: "/home/user/Pictures"
 * </pre>
 *
 * Example 4:
 * <pre>
 * Input: path = "/../"
 * Output: "/"
 * </pre>
 *
 * Example 5:
 * <pre>
 * Input: path = "/.../a/../b/c/../d/./"
 * Output: "/.../b/d"
 * </pre>
 *
 * Constraints:
 *  - 1 <= path.length <= 3000
 *  - path consists of English letters, digits, period '.', slash '/' or '_'.
 *  - path is a valid absolute Unix path.
 *
 * Hint (spoiler - pehle khud try karo): split("/"), stack/deque: ".." par pop, "" ya "." skip, baaki push. '...' valid directory name hai!
 */
public class LC0071_SimplifyPath {

    // TODO: apna solution yahan likho
    public String simplifyPath(String path) {
        return "/";
    }

    public static void main(String[] args) {
        LC0071_SimplifyPath sol = new LC0071_SimplifyPath();
        System.out.println(sol.simplifyPath("/home/"));                          // /home
        System.out.println(sol.simplifyPath("/home//foo/"));                     // /home/foo
        System.out.println(sol.simplifyPath("/../"));                            // /
        System.out.println(sol.simplifyPath("/.../a/../b/c/../d/./"));            // /.../b/d
    }
}
