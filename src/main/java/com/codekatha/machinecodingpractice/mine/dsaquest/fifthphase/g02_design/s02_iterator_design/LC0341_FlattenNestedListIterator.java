package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g02_design.s02_iterator_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #341 - Flatten Nested List Iterator  [Difficulty: Medium | Atlassian: last seen 2 years, frequency score 0.020]
 * Link   : https://leetcode.com/problems/flatten-nested-list-iterator/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Design (time-based & iterator)  >  Iterator Design
 *
 * You are given a nested list of integers nestedList. Each element is either an integer or a
 * list whose elements may also be integers or other lists. Implement an iterator to flatten
 * it. Implement the NestedIterator class: NestedIterator(List&lt;NestedInteger> nestedList)
 * Initializes the iterator with the nested list nestedList. int next() Returns the next
 * integer in the nested list. boolean hasNext() Returns true if there are still some integers
 * in the nested list and false otherwise. Your code will be tested with the following
 * pseudocode: initialize iterator with nestedList; res = []; while iterator.hasNext() append
 * iterator.next() to the end of res; return res. If res matches the expected flattened list,
 * then your code will be judged as correct.
 *
 * Example 1:
 * <pre>
 * Input: nestedList = [[1,1],2,[1,1]]
 * Output: [1,1,2,1,1]
 * Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: nestedList = [1,[4,[6]]]
 * Output: [1,4,6]
 * </pre>
 *
 * Constraints:
 *  - 1 <= nestedList.length <= 500
 *  - The values of the integers in the nested list is in the range [-10^6, 10^6].
 *  - NestedInteger API (LeetCode deta hai, yahan helpers me hai): isInteger(), getInteger(), getList().
 *
 * Hint (spoiler - pehle khud try karo): Lazy approach: stack me list ke elements ULTE order me push karo. hasNext() me jab tak top list hai use pop karke uske elements push karo (flatten ek-ek level); jab top integer mile to true. next() = pop().getInteger(). Constructor me poora flatten karna bhi chalega, par lazy wala interviewer ko pasand aata hai.
 */
public class LC0341_FlattenNestedListIterator {

    static class NestedIterator implements Iterator<Integer> {
        // TODO: Deque<NestedInteger> stack - hasNext() me top ko integer bana lo

        public NestedIterator(List<NestedInteger> nestedList) {
        }

        @Override
        public Integer next() {
            return -1;
        }

        @Override
        public boolean hasNext() {
            return false;
        }
    }

    // ---- LeetCode ka NestedInteger interface + test helpers (isko mat badlo) ----
    interface NestedInteger {
        boolean isInteger();
        Integer getInteger();
        List<NestedInteger> getList();
    }

    static class NI implements NestedInteger {
        private final Integer v;
        private final List<NestedInteger> l;
        NI(int v) { this.v = v; this.l = null; }
        NI(List<NestedInteger> l) { this.v = null; this.l = l; }
        public boolean isInteger() { return v != null; }
        public Integer getInteger() { return v; }
        public List<NestedInteger> getList() { return l; }
    }

    /** "[[1,1],2,[1,1]]" -> List<NestedInteger> */
    static List<NestedInteger> parse(String s) { return parseList(s, new int[]{0}); }

    private static List<NestedInteger> parseList(String s, int[] p) {
        List<NestedInteger> out = new ArrayList<>();
        p[0]++;   // '['
        while (s.charAt(p[0]) != ']') {
            char c = s.charAt(p[0]);
            if (c == ',') p[0]++;
            else if (c == '[') out.add(new NI(parseList(s, p)));
            else {
                int st = p[0];
                while (s.charAt(p[0]) == '-' || Character.isDigit(s.charAt(p[0]))) p[0]++;
                out.add(new NI(Integer.parseInt(s.substring(st, p[0]))));
            }
        }
        p[0]++;   // ']'
        return out;
    }

    static List<Integer> drain(Iterator<Integer> it) {
        List<Integer> out = new ArrayList<>();
        while (it.hasNext()) out.add(it.next());
        return out;
    }

    public static void main(String[] args) {
        LC0341_FlattenNestedListIterator sol = new LC0341_FlattenNestedListIterator();
        Check.start("LC0341_FlattenNestedListIterator");
        Check.eq("[1, 1, 2, 1, 1]", () -> drain(new NestedIterator(parse("[[1,1],2,[1,1]]"))));
        Check.eq("[1, 4, 6]", () -> drain(new NestedIterator(parse("[1,[4,[6]]]"))));
        Check.eq("[3]", () -> drain(new NestedIterator(parse("[[],[[]],3]"))));
        Check.eq("[]", () -> drain(new NestedIterator(parse("[[[]]]"))));
        Check.eq("[1, 2]", () -> drain(new NestedIterator(parse("[1,[],2]"))));
        Check.eq("[-5, -6, -7, 0]", () -> drain(new NestedIterator(parse("[-5,[-6,[-7]],0]"))));
        Check.eq("[1, 2, 3, 4, 5]", () -> drain(new NestedIterator(parse("[[[[1]]],[2],[[3,[4,[5]]]]]"))));
        Check.eq("[1]", () -> drain(new NestedIterator(parse("[[],[],[1]]"))));
        Check.eq("[7]", () -> drain(new NestedIterator(parse("[7]"))));
        Check.eq("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", () -> drain(new NestedIterator(parse("[[1,2],[3,4],[5,6],[7,[8,[9,[10]]]]]"))));
        Check.eq(true, () -> { NestedIterator it = new NestedIterator(parse("[[],[[1]],3]")); it.hasNext(); it.hasNext(); it.hasNext(); return it.next() == 1 && it.next() == 3 && !it.hasNext(); });   // hasNext baar baar bulao to element skip na ho
        Check.eq("[7]", () -> drain(new NestedIterator(parse("[".repeat(1000) + "7" + "]".repeat(1000)))));   // 1000 level deep nesting
        Check.summary();
    }
}
