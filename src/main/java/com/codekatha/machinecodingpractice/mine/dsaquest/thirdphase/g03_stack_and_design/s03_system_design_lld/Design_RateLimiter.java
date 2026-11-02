package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g03_stack_and_design.s03_system_design_lld;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Design item - Rate Limiter (Basic Version)  [Cheatsheet: Round 1 OA | Easy]
 * Link   : https://leetcode.com/discuss/interview-question/353735/  (cheatsheet ka discuss post)
 * Note   : Original statement cheatsheet me nahi hai - neeche ka statement meri interpretation hai. Interviewer se requirements clarify karna bhi practice karo.
 * Group  : Stack & Design  >  LLD / System-flavoured Coding (non-LeetCode)
 *
 * Design a rate limiter. RateLimiter(int maxRequests, int windowSeconds) creates a limiter
 * that lets each client make at most maxRequests requests in any sliding window of
 * windowSeconds seconds. boolean allow(String clientId, int timestamp) is called for every
 * incoming request (timestamps in seconds, non-decreasing across calls) and returns true if
 * the request is allowed, false if it must be rejected. A request at time t is allowed if
 * fewer than maxRequests ALLOWED requests of that client fall in the window (t -
 * windowSeconds, t]. Rejected requests do not count towards the limit. Different clients are
 * limited independently.
 *
 * Example 1:
 * <pre>
 * RateLimiter rl = new RateLimiter(3, 10);
 * rl.allow("a", 1)  -> true
 * rl.allow("a", 2)  -> true
 * rl.allow("a", 3)  -> true
 * rl.allow("a", 4)  -> false   (3 requests already in (-6, 4])
 * rl.allow("b", 4)  -> true    (different client)
 * rl.allow("a", 11) -> true    (window (1, 11] holds only t=2,3)
 * </pre>
 *
 * Constraints:
 *  - 1 <= maxRequests, windowSeconds <= 10^5
 *  - timestamp is non-decreasing across calls
 *  - Up to 10^5 calls, many different clients
 *  - Follow-ups to discuss: fixed-window counter vs sliding-window log vs token bucket; thread safety (per-client lock / ConcurrentHashMap); memory cleanup of idle clients.
 *
 * Hint (spoiler - pehle khud try karo): Sliding window log: har client ke liye accepted timestamps ki Deque. allow(): front se purane (<= t - window) hatao; size < max ho to add karke true. Har request amortized O(1). Alternative: fixed window counter (sasta par boundary burst) ya token bucket (smooth refill).
 */
public class Design_RateLimiter {

    static class RateLimiter {
        // TODO: Map<String, Deque<Integer>> clientId -> accepted timestamps

        public RateLimiter(int maxRequests, int windowSeconds) {
        }

        public boolean allow(String clientId, int timestamp) {
            return false;
        }
    }

    public static void main(String[] args) {
        Design_RateLimiter sol = new Design_RateLimiter();
        Check.start("Design_RateLimiter");
        RateLimiter rl = new RateLimiter(3, 10);
        Check.eq(true, () -> rl.allow("a", 1));
        Check.eq(true, () -> rl.allow("a", 2));
        Check.eq(true, () -> rl.allow("a", 3));
        Check.eq(false, () -> rl.allow("a", 4));
        Check.eq(false, () -> rl.allow("a", 10));
        Check.eq(true, () -> rl.allow("a", 11));
        Check.eq(true, () -> rl.allow("a", 12));
        Check.eq(true, () -> rl.allow("a", 13));
        Check.eq(false, () -> rl.allow("a", 13));
        Check.eq(true, () -> rl.allow("b", 4));
        Check.eq(true, () -> rl.allow("a", 100));
        Check.eq(true, () -> rl.allow("a", 100));
        Check.eq(true, () -> rl.allow("a", 100));
        Check.eq(false, () -> rl.allow("a", 100));
        RateLimiter r2 = new RateLimiter(2, 5);
        Check.eq(true, () -> r2.allow("x", 1));
        Check.eq(true, () -> r2.allow("x", 2));
        Check.eq(false, () -> r2.allow("x", 3));
        Check.eq(false, () -> r2.allow("x", 4));
        Check.eq(true, () -> r2.allow("x", 6));
        Check.eq(true, () -> r2.allow("x", 7));
        // rejected requests count nahi hote: x=3,4 reject hue, phir bhi t=6 pe allowed (sirf t=2 window me hai)
        RateLimiter r3 = new RateLimiter(1, 1);
        Check.eq(true, () -> r3.allow("k", 1));
        Check.eq(false, () -> r3.allow("k", 1));
        Check.eq(true, () -> r3.allow("k", 2));
        Check.eq(false, () -> r3.allow("k", 2));
        Check.eq(true, () -> r3.allow("k", 3));
        RateLimiter big = new RateLimiter(1, 1);
        Check.eq(100000, () -> { int ok = 0; for (int i = 0; i < 100000; i++) if (big.allow("c", i)) ok++; return ok; });
        Check.summary();
    }
}
