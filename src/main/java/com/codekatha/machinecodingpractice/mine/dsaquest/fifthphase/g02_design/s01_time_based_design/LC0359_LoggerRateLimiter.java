package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g02_design.s01_time_based_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #359 - Logger Rate Limiter  [Difficulty: Easy | Atlassian: last seen 6 months, frequency score 0.082]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/logger-rate-limiter/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Design (time-based & iterator)  >  Time-based Design
 *
 * Design a logger system that receives a stream of messages along with their timestamps. Each
 * unique message should only be printed at most every 10 seconds (i.e. a message printed at
 * timestamp t will prevent other identical messages from being printed until timestamp t +
 * 10). All messages will come in chronological order. Several messages may arrive at the same
 * timestamp. Implement the Logger class: Logger() Initializes the logger object. bool
 * shouldPrintMessage(int timestamp, string message) Returns true if the message should be
 * printed in the given timestamp, otherwise returns false.
 *
 * Example 1:
 * <pre>
 * Input: ["Logger","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage"]
 *        [[],[1,"foo"],[2,"bar"],[3,"foo"],[8,"bar"],[10,"foo"],[11,"foo"]]
 * Output: [null,true,true,false,false,false,true]
 * Explanation: foo printed at 1 -> blocked until 11, so calls at 3 and 10 are false, call at 11 is true. bar printed at 2 -> blocked until 12, so call at 8 is false.
 * </pre>
 *
 * Constraints:
 *  - 0 <= timestamp <= 10^9
 *  - Every timestamp will be passed in non-decreasing order (chronological order).
 *  - 1 <= message.length <= 30
 *  - At most 10^4 calls will be made to shouldPrintMessage.
 *
 * Hint (spoiler - pehle khud try karo): HashMap&lt;message, last printed timestamp>. Print tabhi jab message naya ho ya timestamp - last >= 10; sirf print hone par map update karo (rejected call pe nahi). Memory follow-up: purane entries cleanup (queue + set).
 */
public class LC0359_LoggerRateLimiter {

    static class Logger {
        // TODO: Map<String, Integer> lastPrinted

        public Logger() {
        }

        public boolean shouldPrintMessage(int timestamp, String message) {
            return false;
        }
    }

    public static void main(String[] args) {
        LC0359_LoggerRateLimiter sol = new LC0359_LoggerRateLimiter();
        Check.start("LC0359_LoggerRateLimiter");
        Logger lg = new Logger();
        Check.eq(true, () -> lg.shouldPrintMessage(1, "foo"));
        Check.eq(true, () -> lg.shouldPrintMessage(2, "bar"));
        Check.eq(false, () -> lg.shouldPrintMessage(3, "foo"));
        Check.eq(false, () -> lg.shouldPrintMessage(8, "bar"));
        Check.eq(false, () -> lg.shouldPrintMessage(10, "foo"));
        Check.eq(true, () -> lg.shouldPrintMessage(11, "foo"));   // exactly t + 10 allowed
        Logger lg1 = new Logger();
        Check.eq(true, () -> lg1.shouldPrintMessage(0, "x"));
        Check.eq(false, () -> lg1.shouldPrintMessage(5, "x"));    // rejected call timer reset NAHI karta
        Check.eq(true, () -> lg1.shouldPrintMessage(10, "x"));
        Check.eq(false, () -> lg1.shouldPrintMessage(10, "x"));   // same timestamp duplicate
        Check.eq(true, () -> lg1.shouldPrintMessage(10, "y"));    // alag message independent
        Check.eq(true, () -> lg1.shouldPrintMessage(1000000000, "x"));   // bada timestamp
        Logger lg2 = new Logger();   // random stream (python se verify kiya hua)
        Check.eq(true, () -> lg2.shouldPrintMessage(2, "m2"));
        Check.eq(true, () -> lg2.shouldPrintMessage(7, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(7, "m1"));
        Check.eq(true, () -> lg2.shouldPrintMessage(17, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(28, "m2"));
        Check.eq(true, () -> lg2.shouldPrintMessage(30, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(41, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(50, "m2"));
        Check.eq(false, () -> lg2.shouldPrintMessage(52, "m2"));
        Check.eq(true, () -> lg2.shouldPrintMessage(63, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(63, "m1"));
        Check.eq(false, () -> lg2.shouldPrintMessage(64, "m1"));
        Check.eq(false, () -> lg2.shouldPrintMessage(67, "m1"));
        Check.eq(false, () -> lg2.shouldPrintMessage(70, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(79, "m4"));
        Check.eq(false, () -> lg2.shouldPrintMessage(88, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(89, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(89, "m1"));
        Check.eq(true, () -> lg2.shouldPrintMessage(90, "m4"));
        Check.eq(false, () -> lg2.shouldPrintMessage(92, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(101, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(110, "m4"));
        Check.eq(false, () -> lg2.shouldPrintMessage(115, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(117, "m3"));
        Check.eq(false, () -> lg2.shouldPrintMessage(117, "m3"));
        Check.eq(false, () -> lg2.shouldPrintMessage(118, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(129, "m1"));
        Check.eq(true, () -> lg2.shouldPrintMessage(131, "m3"));
        Check.eq(false, () -> lg2.shouldPrintMessage(134, "m1"));
        Check.eq(true, () -> lg2.shouldPrintMessage(134, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(144, "m1"));
        Check.eq(false, () -> lg2.shouldPrintMessage(149, "m1"));
        Check.eq(true, () -> lg2.shouldPrintMessage(158, "m2"));
        Check.eq(true, () -> lg2.shouldPrintMessage(158, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(167, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(167, "m1"));
        Check.eq(false, () -> lg2.shouldPrintMessage(167, "m4"));
        Check.eq(true, () -> lg2.shouldPrintMessage(172, "m3"));
        Check.eq(true, () -> lg2.shouldPrintMessage(183, "m2"));
        Check.eq(true, () -> lg2.shouldPrintMessage(183, "m3"));
        Check.summary();
    }
}
