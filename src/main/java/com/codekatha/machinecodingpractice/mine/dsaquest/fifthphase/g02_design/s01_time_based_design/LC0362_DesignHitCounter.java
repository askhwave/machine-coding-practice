package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g02_design.s01_time_based_design;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #362 - Design Hit Counter  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.208]  (LeetCode Premium)
 * Link   : https://leetcode.com/problems/design-hit-counter/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Design (time-based & iterator)  >  Time-based Design
 *
 * Design a hit counter which counts the number of hits received in the past 5 minutes (i.e.,
 * the past 300 seconds). Your system should accept a timestamp parameter (in seconds
 * granularity), and you may assume that calls are being made to the system in chronological
 * order (i.e., timestamp is monotonically increasing). Several hits may arrive roughly at the
 * same time. Implement the HitCounter class: HitCounter() Initializes the object of the hit
 * counter system. void hit(int timestamp) Records a hit that happened at timestamp (in
 * seconds). Several hits may happen at the same timestamp. int getHits(int timestamp) Returns
 * the number of hits in the past 5 minutes from timestamp (i.e., the past 300 seconds).
 *
 * Example 1:
 * <pre>
 * Input: ["HitCounter","hit","hit","hit","getHits","hit","getHits","getHits"]
 *        [[],[1],[2],[3],[4],[300],[300],[301]]
 * Output: [null,null,null,null,3,null,4,3]
 * Explanation: window for time t is (t - 300, t]. At t = 300 hits {1,2,3,300} are inside (4). At t = 301 the hit at time 1 has expired (3).
 * </pre>
 *
 * Constraints:
 *  - 1 <= timestamp <= 2 * 10^9
 *  - All the calls are being made to the system in chronological order (i.e., timestamp is monotonically increasing).
 *  - At most 300 calls will be made to hit and getHits.
 *  - Follow up: What if the number of hits per second could be huge? Does your design scale?
 *
 * Hint (spoiler - pehle khud try karo): Queue of timestamps: hit = add; getHits = front se purane (<= t - 300) hatao, size return. Scale follow-up: 300 buckets ka circular array (timestamp % 300) + har bucket ka bucket-timestamp, taaki purana overwrite ho sake.
 */
public class LC0362_DesignHitCounter {

    static class HitCounter {
        // TODO: Queue<Integer> ya 300 buckets ka circular array

        public HitCounter() {
        }

        public void hit(int timestamp) {
        }

        public int getHits(int timestamp) {
            return 0;
        }
    }

    public static void main(String[] args) {
        LC0362_DesignHitCounter sol = new LC0362_DesignHitCounter();
        Check.start("LC0362_DesignHitCounter");
        HitCounter h = new HitCounter();
        h.hit(1); h.hit(2); h.hit(3);
        Check.eq(3, () -> h.getHits(4));
        h.hit(300);
        Check.eq(4, () -> h.getHits(300));
        Check.eq(3, () -> h.getHits(301));   // t=1 wala hit expire
        Check.eq(2, () -> h.getHits(302));
        Check.eq(1, () -> h.getHits(599));   // window (299, 599] me sirf t=300 wala
        Check.eq(0, () -> h.getHits(600));   // window (300, 600]: t=300 bhi expire
        Check.eq(0, () -> new HitCounter().getHits(5));   // koi hit nahi
        HitCounter same = new HitCounter();
        for (int i = 0; i < 5; i++) same.hit(10);   // ek hi second me kai hits
        Check.eq(5, () -> same.getHits(10));
        Check.eq(5, () -> same.getHits(309));
        Check.eq(0, () -> same.getHits(310));
        HitCounter wrap = new HitCounter();   // circular-buffer wale ke liye trap: purana bucket overwrite hona chahiye
        wrap.hit(1); wrap.hit(301);
        Check.eq(1, () -> wrap.getHits(301));
        Check.eq(0, () -> { HitCounter w = new HitCounter(); w.hit(1); return w.getHits(2000); });
        HitCounter huge = new HitCounter();   // follow-up: ek second me bahut hits
        for (int i = 0; i < 100000; i++) huge.hit(1);
        Check.eq(100000, () -> huge.getHits(300));
        Check.eq(0, () -> huge.getHits(301));
        HitCounter h2 = new HitCounter();   // random stream (python brute se verify kiya hua)
        h2.hit(2);
        Check.eq(1, () -> h2.getHits(301));
        Check.eq(0, () -> h2.getHits(601));
        Check.eq(0, () -> h2.getHits(901));
        h2.hit(1202);
        h2.hit(1503);
        h2.hit(1503);
        h2.hit(1802);
        Check.eq(1, () -> h2.getHits(1809));
        h2.hit(1809);
        Check.eq(1, () -> h2.getHits(2108));
        Check.eq(1, () -> h2.getHits(2108));
        h2.hit(2409);
        Check.eq(1, () -> h2.getHits(2409));
        h2.hit(2529);
        h2.hit(2529);
        h2.hit(2529);
        Check.eq(0, () -> h2.getHits(2830));
        h2.hit(3129);
        Check.eq(1, () -> h2.getHits(3130));
        Check.eq(0, () -> h2.getHits(3430));
        h2.hit(3437);
        h2.hit(3444);
        h2.hit(3444);
        Check.eq(0, () -> h2.getHits(3744));
        h2.hit(4043);
        Check.eq(1, () -> h2.getHits(4044));
        h2.hit(4343);
        h2.hit(4643);
        Check.eq(1, () -> h2.getHits(4763));
        h2.hit(5062);
        h2.hit(5062);
        h2.hit(5362);
        Check.eq(1, () -> h2.getHits(5362));
        h2.hit(5663);
        Check.eq(1, () -> h2.getHits(5783));
        h2.hit(5783);
        Check.eq(2, () -> h2.getHits(5784));
        h2.hit(5904);
        h2.hit(5954);
        h2.hit(5955);
        Check.eq(5, () -> h2.getHits(5956));
        h2.hit(6076);
        Check.eq(5, () -> h2.getHits(6076));
        h2.hit(6083);
        Check.eq(5, () -> h2.getHits(6084));
        Check.eq(5, () -> h2.getHits(6084));
        h2.hit(6384);
        Check.eq(1, () -> h2.getHits(6391));
        h2.hit(6398);
        h2.hit(6398);
        Check.eq(2, () -> h2.getHits(6697));
        h2.hit(6997);
        h2.hit(7047);
        Check.eq(2, () -> h2.getHits(7097));
        h2.hit(7097);
        h2.hit(7098);
        Check.eq(4, () -> h2.getHits(7218));
        Check.eq(4, () -> h2.getHits(7219));
        h2.hit(7519);
        Check.eq(1, () -> h2.getHits(7520));
        Check.eq(0, () -> h2.getHits(7821));
        h2.hit(8121);
        Check.eq(1, () -> h2.getHits(8128));
        Check.eq(1, () -> h2.getHits(8248));
        Check.eq(1, () -> h2.getHits(8368));
        h2.hit(8667);
        h2.hit(8967);
        Check.eq(0, () -> h2.getHits(9268));
        Check.eq(0, () -> h2.getHits(9269));
        Check.summary();
    }
}
