package com.codekatha.machinecodingpractice.mine.dsaquest.thirdphase.g03_stack_and_design.s03_system_design_lld;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * Design item - Leader Election with Variations  [Cheatsheet: Round 1 OA | Medium]
 * Link   : https://leetcode.com/discuss/interview-question/187992/  (cheatsheet ka discuss post)
 * Note   : Original statement cheatsheet me nahi hai - neeche ka statement meri interpretation hai. Interviewer se requirements clarify karna bhi practice karo.
 * Group  : Stack & Design  >  LLD / System-flavoured Coding (non-LeetCode)
 *
 * Implement leader election for a cluster of nodes identified by integer ids (bigger id =
 * higher priority). Build it in three variations. (1) BullyElection: join(id) adds a node
 * (idempotent), crash(id) removes it (unknown id = no-op), leader() returns the highest alive
 * id or -1 if the cluster is empty - a node that joins/recovers with a higher id takes over
 * immediately. (2) StickyElection: same API, but the leader changes ONLY when the current
 * leader crashes (then the highest alive id takes over); a higher id joining does not preempt;
 * the first node to join an empty cluster becomes leader. (3) HeartbeatElection(timeout):
 * nodes are not told about crashes, they just send heartbeat(id, now). leader(now) returns the
 * highest id whose last heartbeat is within the timeout (now - last <= timeout), or -1 if
 * none.
 *
 * Example 1:
 * <pre>
 * BullyElection b = new BullyElection();
 * b.join(3); b.join(1); b.join(2);  b.leader() -> 3
 * b.crash(3);                         b.leader() -> 2
 * b.join(5);                          b.leader() -> 5
 * 
 * StickyElection s = new StickyElection();
 * s.join(3); s.join(7);               s.leader() -> 3   (no preemption)
 * s.crash(3);                         s.leader() -> 7
 * 
 * HeartbeatElection h = new HeartbeatElection(10);
 * h.heartbeat(1, 0); h.heartbeat(3, 5);  h.leader(5) -> 3,  h.leader(16) -> -1
 * </pre>
 *
 * Constraints:
 *  - Ids are non-negative ints; at most 10^5 nodes.
 *  - Time is a non-decreasing long (milliseconds or ticks).
 *  - Follow-ups to discuss: O(log n) leader() with TreeSet + expiry queue for heartbeats; thread safety; split-brain / network partitions (only talk, no code).
 *
 * Hint (spoiler - pehle khud try karo): Bully: alive ids ko TreeSet me rakho, leader = last() (O(log n)). Sticky: leader field alag rakho, sirf leader crash pe naya chuno. Heartbeat: id -> lastSeen map; leader(now) = max id jiska now - lastSeen <= timeout (O(n); optimize: TreeSet + min-heap of expiry).
 */
public class Design_LeaderElection {

    static class BullyElection {
        // TODO: TreeSet<Integer> alive

        public void join(int id) {
        }

        public void crash(int id) {
        }

        public int leader() {
            return -1;
        }
    }

    static class StickyElection {
        // TODO: alive set + current leader field

        public void join(int id) {
        }

        public void crash(int id) {
        }

        public int leader() {
            return -1;
        }
    }

    static class HeartbeatElection {
        // TODO: Map<Integer, Long> id -> last heartbeat time

        public HeartbeatElection(long timeout) {
        }

        public void heartbeat(int id, long now) {
        }

        public int leader(long now) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Design_LeaderElection sol = new Design_LeaderElection();
        Check.start("Design_LeaderElection");
        BullyElection b = new BullyElection();
        Check.eq(-1, () -> b.leader());
        b.join(3); b.join(1); b.join(2);
        Check.eq(3, () -> b.leader());
        b.crash(3);
        Check.eq(2, () -> b.leader());
        b.join(5);
        Check.eq(5, () -> b.leader());                // higher id preempt karta hai
        b.crash(5); b.crash(2);
        Check.eq(1, () -> b.leader());
        b.crash(9);                                   // unknown id: no-op
        b.crash(1);
        Check.eq(-1, () -> b.leader());
        b.join(4); b.join(4);                         // idempotent
        Check.eq(4, () -> b.leader());
        b.crash(4);
        Check.eq(-1, () -> b.leader());               // duplicate join ke baad ek crash se cluster khaali
        StickyElection s = new StickyElection();
        Check.eq(-1, () -> s.leader());
        s.join(3);
        Check.eq(3, () -> s.leader());
        s.join(7); s.join(5);
        Check.eq(3, () -> s.leader());                // higher id aaya par preempt nahi
        s.crash(5);
        Check.eq(3, () -> s.leader());                // non-leader crash: leader same
        s.crash(3);
        Check.eq(7, () -> s.leader());                // leader gaya => highest alive
        s.crash(7);
        Check.eq(-1, () -> s.leader());
        s.join(2);
        Check.eq(2, () -> s.leader());                // khaali cluster me first join = leader
        HeartbeatElection h = new HeartbeatElection(10);
        Check.eq(-1, () -> h.leader(0));
        h.heartbeat(1, 0); h.heartbeat(2, 0); h.heartbeat(3, 5);
        Check.eq(3, () -> h.leader(5));
        Check.eq(3, () -> h.leader(10));
        Check.eq(3, () -> h.leader(11));              // 1 aur 2 expire (11 > 10), 3 abhi zinda (6)
        Check.eq(3, () -> h.leader(15));              // 15 - 5 = 10 <= timeout: boundary inclusive
        Check.eq(-1, () -> h.leader(16));
        h.heartbeat(1, 16);
        Check.eq(1, () -> h.leader(16));
        h.heartbeat(2, 18);
        Check.eq(2, () -> h.leader(18));
        Check.eq(2, () -> h.leader(28));
        Check.eq(-1, () -> h.leader(29));
        h.heartbeat(3, 30);
        Check.eq(3, () -> h.leader(30));
        Check.summary();
    }
}
