package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g02_design.s02_iterator_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #284 - Peeking Iterator  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.119]
 * Link   : https://leetcode.com/problems/peeking-iterator/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Design (time-based & iterator)  >  Iterator Design
 *
 * Design an iterator that supports the peek operation on an existing iterator in addition to
 * the hasNext and the next operations. Implement the PeekingIterator class:
 * PeekingIterator(Iterator&lt;int> nums) Initializes the object with the given integer
 * iterator iterator. int next() Returns the next element in the array and moves the pointer to
 * the next element. boolean hasNext() Returns true if there are still elements in the array.
 * int peek() Returns the next element in the array without moving the pointer. Note: Each
 * language may have a different implementation of the constructor and Iterator, but they all
 * support the int next() and boolean hasNext() functions.
 *
 * Example 1:
 * <pre>
 * Input: ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
 *        [[[1, 2, 3]], [], [], [], [], []]
 * Output: [null, 1, 2, 2, 3, false]
 * Explanation: new PeekingIterator([1, 2, 3]); next() returns 1, pointer moves to 2. peek() returns 2 (pointer does not move). next() returns 2. next() returns 3. hasNext() returns false.
 * </pre>
 *
 * Constraints:
 *  - 1 <= nums.length <= 1000
 *  - 1 <= nums[i] <= 1000
 *  - All the calls to next and peek are valid.
 *  - At most 1000 calls will be made to next, hasNext, and peek.
 *  - Follow up: How would you extend your design to be generic and work with all types, not just integer?
 *
 * Hint (spoiler - pehle khud try karo): Ek 'next element' slot (cache) rakho: constructor me underlying iterator se ek element pehle hi bhar lo (agar hai). peek = cache, next = cache return karke agla bhar do, hasNext = cache present hai ya nahi.
 */
public class LC0284_PeekingIterator {

    static class PeekingIterator implements Iterator<Integer> {
        // TODO: underlying iterator + ek cached 'next' element (aur flag ki cache bhara hai ya nahi)

        public PeekingIterator(Iterator<Integer> iterator) {
        }

        public Integer peek() {
            return null;
        }

        @Override
        public Integer next() {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }
    }

    public static void main(String[] args) {
        LC0284_PeekingIterator sol = new LC0284_PeekingIterator();
        Check.start("LC0284_PeekingIterator");
        PeekingIterator p = new PeekingIterator(Arrays.asList(1, 2, 3).iterator());
        Check.eq(1, () -> p.next());
        Check.eq(2, () -> p.peek());
        Check.eq(2, () -> p.next());
        Check.eq(3, () -> p.next());
        Check.eq(false, () -> p.hasNext());
        PeekingIterator q = new PeekingIterator(Arrays.asList(7, 8, 9).iterator());
        Check.eq(7, () -> q.peek());
        Check.eq(7, () -> q.peek());      // peek kitni bhi baar, pointer same
        Check.eq(true, () -> q.hasNext());
        Check.eq(7, () -> q.next());
        Check.eq(8, () -> q.peek());
        Check.eq(true, () -> q.hasNext());   // peek ke baad hasNext sahi
        Check.eq(8, () -> q.next());
        Check.eq(9, () -> q.peek());
        Check.eq(9, () -> q.next());
        Check.eq(false, () -> q.hasNext());   // last element peek+next ke baad khatam
        PeekingIterator one = new PeekingIterator(Arrays.asList(5).iterator());
        Check.eq(true, () -> one.hasNext());
        Check.eq(5, () -> one.peek());
        Check.eq(true, () -> one.hasNext());
        Check.eq(5, () -> one.next());
        Check.eq(false, () -> one.hasNext());
        Check.eq(false, () -> new PeekingIterator(new ArrayList<Integer>().iterator()).hasNext());   // khaali iterator: constructor crash na kare
        Check.eq("[4, 5, 6, 7]", () -> { PeekingIterator r = new PeekingIterator(Arrays.asList(4, 5, 6, 7).iterator()); List<Integer> out = new ArrayList<>(); while (r.hasNext()) out.add(r.next()); return out; });   // peek ke bina normal iteration
        Check.summary();
    }
}
