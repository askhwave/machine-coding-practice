package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g03_heap_and_ranking.s01_heap_top_k;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #295 - Find Median from Data Stream  [Difficulty: Hard | Atlassian: last seen 2 years, frequency score 0.009]
 * Link   : https://leetcode.com/problems/find-median-from-data-stream/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Heap, Sorting & Ranking  >  Heap - Top K & Streaming Median
 *
 * The median is the middle value in an ordered integer list. If the size of the list is even,
 * there is no middle value, and the median is the mean of the two middle values. For example,
 * for arr = [2,3,4], the median is 3. For example, for arr = [2,3], the median is (2 + 3) / 2
 * = 2.5. Implement the MedianFinder class: MedianFinder() initializes the MedianFinder object.
 * void addNum(int num) adds the integer num from the data stream to the data structure. double
 * findMedian() returns the median of all elements so far. Answers within 10^-5 of the actual
 * answer will be accepted.
 *
 * Example 1:
 * <pre>
 * Input: ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
 *        [[], [1], [2], [], [3], []]
 * Output: [null, null, null, 1.5, null, 2.0]
 * Explanation: addNum(1), addNum(2), findMedian() -> (1 + 2) / 2 = 1.5, addNum(3), findMedian() -> 2.0
 * </pre>
 *
 * Constraints:
 *  - -10^5 <= num <= 10^5
 *  - There will be at least one element in the data structure before calling findMedian.
 *  - At most 5 * 10^4 calls will be made to addNum and findMedian.
 *  - Follow up: If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution? If 99% of all integer numbers are in [0, 100]?
 *
 * Hint (spoiler - pehle khud try karo): Do heaps: max-heap = chhoti aadhi, min-heap = badi aadhi. add: pehle max-heap me, uska top min-heap me, phir size balance (max-heap >= min-heap, difference <= 1). Median = odd: max-heap top; even: dono tops ka average.
 */
public class LC0295_FindMedianFromDataStream {

    static class MedianFinder {
        // TODO: PriorityQueue<Integer> low (max-heap), high (min-heap)

        public MedianFinder() {
        }

        public void addNum(int num) {
        }

        public double findMedian() {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        LC0295_FindMedianFromDataStream sol = new LC0295_FindMedianFromDataStream();
        Check.start("LC0295_FindMedianFromDataStream");
        MedianFinder mfA = new MedianFinder();
        mfA.addNum(1);
        Check.eq(1.0, () -> mfA.findMedian());
        mfA.addNum(2);
        Check.eq(1.5, () -> mfA.findMedian());
        mfA.addNum(3);
        Check.eq(2.0, () -> mfA.findMedian());
        MedianFinder mfB = new MedianFinder();
        mfB.addNum(5);
        Check.eq(5.0, () -> mfB.findMedian());
        MedianFinder mfC = new MedianFinder();
        mfC.addNum(9);
        Check.eq(9.0, () -> mfC.findMedian());
        mfC.addNum(7);
        Check.eq(8.0, () -> mfC.findMedian());
        mfC.addNum(5);
        Check.eq(7.0, () -> mfC.findMedian());
        mfC.addNum(3);
        Check.eq(6.0, () -> mfC.findMedian());
        mfC.addNum(1);
        Check.eq(5.0, () -> mfC.findMedian());
        mfC.addNum(0);
        Check.eq(4.0, () -> mfC.findMedian());
        mfC.addNum(-2);
        Check.eq(3.0, () -> mfC.findMedian());
        MedianFinder mfD = new MedianFinder();
        mfD.addNum(4);
        Check.eq(4.0, () -> mfD.findMedian());
        mfD.addNum(4);
        Check.eq(4.0, () -> mfD.findMedian());
        mfD.addNum(4);
        Check.eq(4.0, () -> mfD.findMedian());
        mfD.addNum(4);
        Check.eq(4.0, () -> mfD.findMedian());
        mfD.addNum(4);
        Check.eq(4.0, () -> mfD.findMedian());
        MedianFinder mfE = new MedianFinder();
        mfE.addNum(-100000);
        Check.eq(-100000.0, () -> mfE.findMedian());
        mfE.addNum(100000);
        Check.eq(0.0, () -> mfE.findMedian());
        mfE.addNum(0);
        Check.eq(0.0, () -> mfE.findMedian());
        mfE.addNum(0);
        Check.eq(0.0, () -> mfE.findMedian());
        MedianFinder mfF = new MedianFinder();
        mfF.addNum(894);
        mfF.addNum(596);
        mfF.addNum(942);
        Check.eq(894.0, () -> mfF.findMedian());
        mfF.addNum(-407);
        mfF.addNum(827);
        mfF.addNum(699);
        Check.eq(763.0, () -> mfF.findMedian());
        mfF.addNum(-829);
        mfF.addNum(-966);
        mfF.addNum(212);
        Check.eq(596.0, () -> mfF.findMedian());
        mfF.addNum(-372);
        mfF.addNum(-133);
        mfF.addNum(-224);
        Check.eq(39.5, () -> mfF.findMedian());
        mfF.addNum(85);
        mfF.addNum(-267);
        mfF.addNum(-734);
        Check.eq(-133.0, () -> mfF.findMedian());
        mfF.addNum(486);
        mfF.addNum(-607);
        mfF.addNum(-453);
        Check.eq(-178.5, () -> mfF.findMedian());
        mfF.addNum(-90);
        mfF.addNum(-972);
        mfF.addNum(-548);
        Check.eq(-224.0, () -> mfF.findMedian());
        mfF.addNum(270);
        mfF.addNum(-69);
        mfF.addNum(846);
        Check.eq(-111.5, () -> mfF.findMedian());
        mfF.addNum(-950);
        mfF.addNum(-784);
        mfF.addNum(-825);
        Check.eq(-224.0, () -> mfF.findMedian());
        mfF.addNum(454);
        mfF.addNum(20);
        mfF.addNum(-138);
        Check.eq(-135.5, () -> mfF.findMedian());
        mfF.addNum(-960);
        mfF.addNum(49);
        mfF.addNum(285);
        Check.eq(-133.0, () -> mfF.findMedian());
        mfF.addNum(503);
        mfF.addNum(-117);
        mfF.addNum(-265);
        Check.eq(-125.0, () -> mfF.findMedian());
        mfF.addNum(578);
        mfF.addNum(-883);
        mfF.addNum(-579);
        Check.eq(-133.0, () -> mfF.findMedian());
        mfF.addNum(603);
        mfF.addNum(-928);
        mfF.addNum(206);
        Check.eq(-125.0, () -> mfF.findMedian());
        mfF.addNum(-245);
        mfF.addNum(347);
        mfF.addNum(-648);
        Check.eq(-133.0, () -> mfF.findMedian());
        mfF.addNum(271);
        mfF.addNum(-558);
        mfF.addNum(988);
        Check.eq(-125.0, () -> mfF.findMedian());
        mfF.addNum(505);
        mfF.addNum(-258);
        mfF.addNum(158);
        Check.eq(-117.0, () -> mfF.findMedian());
        mfF.addNum(556);
        mfF.addNum(761);
        mfF.addNum(-245);
        Check.eq(-103.5, () -> mfF.findMedian());
        mfF.addNum(983);
        mfF.addNum(171);
        mfF.addNum(-424);
        Check.eq(-90.0, () -> mfF.findMedian());
        mfF.addNum(352);
        mfF.addNum(996);
        mfF.addNum(-357);
        Check.eq(-79.5, () -> mfF.findMedian());
        MedianFinder mfG = new MedianFinder();
        mfG.addNum(73);
        mfG.addNum(10);
        mfG.addNum(60);
        mfG.addNum(22);
        mfG.addNum(91);
        mfG.addNum(61);
        mfG.addNum(75);
        Check.eq(61.0, () -> mfG.findMedian());
        mfG.addNum(57);
        mfG.addNum(86);
        mfG.addNum(82);
        mfG.addNum(20);
        mfG.addNum(23);
        mfG.addNum(22);
        mfG.addNum(68);
        Check.eq(60.5, () -> mfG.findMedian());
        mfG.addNum(41);
        mfG.addNum(86);
        mfG.addNum(66);
        mfG.addNum(25);
        mfG.addNum(74);
        mfG.addNum(14);
        mfG.addNum(10);
        Check.eq(60.0, () -> mfG.findMedian());
        mfG.addNum(12);
        mfG.addNum(54);
        mfG.addNum(4);
        mfG.addNum(72);
        mfG.addNum(35);
        mfG.addNum(73);
        mfG.addNum(35);
        Check.eq(55.5, () -> mfG.findMedian());
        mfG.addNum(75);
        mfG.addNum(42);
        mfG.addNum(13);
        mfG.addNum(47);
        mfG.addNum(36);
        mfG.addNum(69);
        mfG.addNum(39);
        Check.eq(47.0, () -> mfG.findMedian());
        mfG.addNum(99);
        mfG.addNum(58);
        mfG.addNum(70);
        mfG.addNum(27);
        mfG.addNum(33);
        mfG.addNum(19);
        mfG.addNum(13);
        Check.eq(44.5, () -> mfG.findMedian());
        mfG.addNum(79);
        mfG.addNum(100);
        mfG.addNum(15);
        mfG.addNum(90);
        mfG.addNum(63);
        mfG.addNum(30);
        mfG.addNum(42);
        Check.eq(47.0, () -> mfG.findMedian());
        mfG.addNum(69);
        mfG.addNum(18);
        mfG.addNum(95);
        mfG.addNum(75);
        mfG.addNum(12);
        mfG.addNum(49);
        mfG.addNum(21);
        Check.eq(48.0, () -> mfG.findMedian());
        mfG.addNum(57);
        mfG.addNum(4);
        mfG.addNum(7);
        mfG.addNum(80);
        mfG.addNum(53);
        mfG.addNum(50);
        mfG.addNum(2);
        Check.eq(49.0, () -> mfG.findMedian());
        mfG.addNum(20);
        mfG.addNum(28);
        mfG.addNum(87);
        mfG.addNum(1);
        mfG.addNum(28);
        mfG.addNum(94);
        mfG.addNum(7);
        Check.eq(44.5, () -> mfG.findMedian());
        mfG.addNum(68);
        mfG.addNum(56);
        mfG.addNum(95);
        mfG.addNum(11);
        mfG.addNum(44);
        mfG.addNum(2);
        mfG.addNum(100);
        Check.eq(47.0, () -> mfG.findMedian());
        mfG.addNum(48);
        mfG.addNum(62);
        mfG.addNum(24);
        mfG.addNum(4);
        mfG.addNum(9);
        mfG.addNum(33);
        mfG.addNum(59);
        Check.eq(45.5, () -> mfG.findMedian());
        mfG.addNum(70);
        mfG.addNum(25);
        mfG.addNum(96);
        mfG.addNum(58);
        mfG.addNum(37);
        mfG.addNum(27);
        mfG.addNum(11);
        Check.eq(44.0, () -> mfG.findMedian());
        mfG.addNum(13);
        mfG.addNum(71);
        mfG.addNum(67);
        mfG.addNum(83);
        mfG.addNum(21);
        mfG.addNum(88);
        mfG.addNum(69);
        Check.eq(47.5, () -> mfG.findMedian());
        mfG.addNum(71);
        mfG.addNum(30);
        mfG.addNum(32);
        mfG.addNum(12);
        mfG.addNum(53);
        mfG.addNum(21);
        mfG.addNum(1);
        Check.eq(44.0, () -> mfG.findMedian());
        mfG.addNum(56);
        mfG.addNum(97);
        mfG.addNum(43);
        mfG.addNum(84);
        mfG.addNum(53);
        mfG.addNum(21);
        mfG.addNum(78);
        Check.eq(47.5, () -> mfG.findMedian());
        mfG.addNum(88);
        mfG.addNum(52);
        mfG.addNum(8);
        mfG.addNum(88);
        mfG.addNum(81);
        mfG.addNum(95);
        mfG.addNum(30);
        Check.eq(49.0, () -> mfG.findMedian());
        mfG.addNum(69);
        mfG.addNum(37);
        mfG.addNum(54);
        mfG.addNum(52);
        mfG.addNum(38);
        mfG.addNum(98);
        mfG.addNum(71);
        Check.eq(51.0, () -> mfG.findMedian());
        mfG.addNum(78);
        mfG.addNum(70);
        mfG.addNum(6);
        mfG.addNum(36);
        mfG.addNum(13);
        mfG.addNum(3);
        mfG.addNum(80);
        Check.eq(50.0, () -> mfG.findMedian());
        mfG.addNum(17);
        mfG.addNum(42);
        mfG.addNum(71);
        mfG.addNum(93);
        mfG.addNum(55);
        mfG.addNum(31);
        mfG.addNum(21);
        Check.eq(49.5, () -> mfG.findMedian());
        mfG.addNum(84);
        mfG.addNum(10);
        mfG.addNum(43);
        mfG.addNum(71);
        mfG.addNum(88);
        mfG.addNum(69);
        mfG.addNum(14);
        Check.eq(50.0, () -> mfG.findMedian());
        mfG.addNum(30);
        mfG.addNum(71);
        mfG.addNum(60);
        mfG.addNum(57);
        mfG.addNum(91);
        mfG.addNum(34);
        mfG.addNum(0);
        Check.eq(51.0, () -> mfG.findMedian());
        mfG.addNum(43);
        mfG.addNum(48);
        mfG.addNum(3);
        mfG.addNum(100);
        mfG.addNum(18);
        mfG.addNum(95);
        mfG.addNum(51);
        Check.eq(50.0, () -> mfG.findMedian());
        mfG.addNum(26);
        mfG.addNum(87);
        mfG.addNum(3);
        mfG.addNum(22);
        mfG.addNum(83);
        mfG.addNum(57);
        mfG.addNum(95);
        Check.eq(50.5, () -> mfG.findMedian());
        mfG.addNum(54);
        mfG.addNum(10);
        mfG.addNum(53);
        mfG.addNum(89);
        mfG.addNum(35);
        mfG.addNum(61);
        mfG.addNum(76);
        Check.eq(52.0, () -> mfG.findMedian());
        mfG.addNum(88);
        mfG.addNum(69);
        mfG.addNum(92);
        mfG.addNum(71);
        mfG.addNum(22);
        mfG.addNum(67);
        mfG.addNum(68);
        Check.eq(53.0, () -> mfG.findMedian());
        mfG.addNum(38);
        mfG.addNum(33);
        mfG.addNum(11);
        mfG.addNum(28);
        mfG.addNum(7);
        mfG.addNum(63);
        mfG.addNum(48);
        Check.eq(52.0, () -> mfG.findMedian());
        mfG.addNum(99);
        mfG.addNum(2);
        mfG.addNum(86);
        mfG.addNum(58);
        mfG.addNum(77);
        mfG.addNum(52);
        mfG.addNum(37);
        Check.eq(52.0, () -> mfG.findMedian());
        mfG.addNum(87);
        mfG.addNum(40);
        mfG.addNum(52);
        mfG.addNum(44);
        Check.eq(52.0, () -> mfG.findMedian());
        double[] expBig = {-110.5, -73.5, -92.5, -36.5, 0.5, 0.5, 0.5, -18.5, -0.5, -0.5, 18.5, 9.0, -1.5, -1.5, -1.5, 7.0, -1.5, -1.5, -10.0, -2.5, 5.0, 5.0, 5.0, -3.5, 3.0, 3.0, 7.0, 5.0, 3.0, 3.0, 3.0, 5.0, 3.0, 3.0, -1.0, 1.0, 3.0, 3.0, 1.0, -3.0, -1.0, -1.0, 3.0, 1.0, -1.0, -1.0, 1.0, 3.0, 1.0, 1.0};
        Check.eq(true, () -> { MedianFinder b = new MedianFinder(); int c = 0; for (int i = 0; i < 50000; i++) { b.addNum((int) ((i * 7919L) % 100003) - 50000); if ((i + 1) % 1000 == 0 && Math.abs(b.findMedian() - expBig[c++]) > 1e-5) return false; } return true; });   // 5 * 10^4 adds: har add O(log n) hona chahiye
        Check.summary();
    }
}
