package com.codekatha.machinecodingpractice.mine.dsaquest.fifthphase.g06_backtracking_and_dp.s01_backtracking;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.*;
import java.util.*;

/**
 * LeetCode #17 - Letter Combinations of a Phone Number  [Difficulty: Medium | Atlassian: last seen 6 months, frequency score 0.222]
 * Link   : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Source : krishnadey30/LeetCode-Questions-CompanyWise (atlassian_alltime.csv) - candidate reported, official nahi.
 * Group  : Backtracking & DP  >  Backtracking
 *
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations
 * that the number could represent. Return the answer in any order. A mapping of digits to
 * letters (just like on the telephone buttons) is given below. Note that 1 does not map to any
 * letters. 2 -> abc, 3 -> def, 4 -> ghi, 5 -> jkl, 6 -> mno, 7 -> pqrs, 8 -> tuv, 9 -> wxyz.
 *
 * Example 1:
 * <pre>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * </pre>
 *
 * Example 2:
 * <pre>
 * Input: digits = ""
 * Output: []
 * </pre>
 *
 * Example 3:
 * <pre>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * </pre>
 *
 * Constraints:
 *  - 0 <= digits.length <= 4
 *  - digits[i] is a digit in the range ['2', '9'].
 *
 * Hint (spoiler - pehle khud try karo): Backtracking: index i pe digit ke letters me se ek chuno, current string me jodo, i+1 pe recurse, wapas aake hata do. i == length par string result me. Khaali digits ka special case pehle handle karo.
 */
public class LC0017_LetterCombinationsOfAPhoneNumber {

    // TODO: apna solution yahan likho
    public List<String> letterCombinations(String digits) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC0017_LetterCombinationsOfAPhoneNumber sol = new LC0017_LetterCombinationsOfAPhoneNumber();
        Check.start("LC0017_LetterCombinationsOfAPhoneNumber");
        Check.sameElements("[ad, ae, af, bd, be, bf, cd, ce, cf]", () -> sol.letterCombinations("23"));
        Check.sameElements("[]", () -> sol.letterCombinations(""));   // khaali input: khaali list (ek empty string NAHI)
        Check.sameElements("[a, b, c]", () -> sol.letterCombinations("2"));
        Check.sameElements("[pw, px, py, pz, qw, qx, qy, qz, rw, rx, ry, rz, sw, sx, sy, sz]", () -> sol.letterCombinations("79"));
        Check.sameElements("[pppp, pppq, pppr, ppps, ppqp, ppqq, ppqr, ppqs, pprp, pprq, pprr, pprs, ppsp, ppsq, ppsr, ppss, pqpp, pqpq, pqpr, pqps, pqqp, pqqq, pqqr, pqqs, pqrp, pqrq, pqrr, pqrs, pqsp, pqsq, pqsr, pqss, prpp, prpq, prpr, prps, prqp, prqq, prqr, prqs, prrp, prrq, prrr, prrs, prsp, prsq, prsr, prss, pspp, pspq, pspr, psps, psqp, psqq, psqr, psqs, psrp, psrq, psrr, psrs, pssp, pssq, pssr, psss, qppp, qppq, qppr, qpps, qpqp, qpqq, qpqr, qpqs, qprp, qprq, qprr, qprs, qpsp, qpsq, qpsr, qpss, qqpp, qqpq, qqpr, qqps, qqqp, qqqq, qqqr, qqqs, qqrp, qqrq, qqrr, qqrs, qqsp, qqsq, qqsr, qqss, qrpp, qrpq, qrpr, qrps, qrqp, qrqq, qrqr, qrqs, qrrp, qrrq, qrrr, qrrs, qrsp, qrsq, qrsr, qrss, qspp, qspq, qspr, qsps, qsqp, qsqq, qsqr, qsqs, qsrp, qsrq, qsrr, qsrs, qssp, qssq, qssr, qsss, rppp, rppq, rppr, rpps, rpqp, rpqq, rpqr, rpqs, rprp, rprq, rprr, rprs, rpsp, rpsq, rpsr, rpss, rqpp, rqpq, rqpr, rqps, rqqp, rqqq, rqqr, rqqs, rqrp, rqrq, rqrr, rqrs, rqsp, rqsq, rqsr, rqss, rrpp, rrpq, rrpr, rrps, rrqp, rrqq, rrqr, rrqs, rrrp, rrrq, rrrr, rrrs, rrsp, rrsq, rrsr, rrss, rspp, rspq, rspr, rsps, rsqp, rsqq, rsqr, rsqs, rsrp, rsrq, rsrr, rsrs, rssp, rssq, rssr, rsss, sppp, sppq, sppr, spps, spqp, spqq, spqr, spqs, sprp, sprq, sprr, sprs, spsp, spsq, spsr, spss, sqpp, sqpq, sqpr, sqps, sqqp, sqqq, sqqr, sqqs, sqrp, sqrq, sqrr, sqrs, sqsp, sqsq, sqsr, sqss, srpp, srpq, srpr, srps, srqp, srqq, srqr, srqs, srrp, srrq, srrr, srrs, srsp, srsq, srsr, srss, sspp, sspq, sspr, ssps, ssqp, ssqq, ssqr, ssqs, ssrp, ssrq, ssrr, ssrs, sssp, sssq, sssr, ssss]", () -> sol.letterCombinations("7777"));
        Check.sameElements("[adgj, adgk, adgl, adhj, adhk, adhl, adij, adik, adil, aegj, aegk, aegl, aehj, aehk, aehl, aeij, aeik, aeil, afgj, afgk, afgl, afhj, afhk, afhl, afij, afik, afil, bdgj, bdgk, bdgl, bdhj, bdhk, bdhl, bdij, bdik, bdil, begj, begk, begl, behj, behk, behl, beij, beik, beil, bfgj, bfgk, bfgl, bfhj, bfhk, bfhl, bfij, bfik, bfil, cdgj, cdgk, cdgl, cdhj, cdhk, cdhl, cdij, cdik, cdil, cegj, cegk, cegl, cehj, cehk, cehl, ceij, ceik, ceil, cfgj, cfgk, cfgl, cfhj, cfhk, cfhl, cfij, cfik, cfil]", () -> sol.letterCombinations("2345"));
        Check.sameElements("[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]", () -> sol.letterCombinations("99"));
        Check.sameElements("[j, k, l]", () -> sol.letterCombinations("5"));
        Check.sameElements("[adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi]", () -> sol.letterCombinations("234"));
        Check.sameElements("[t, u, v]", () -> sol.letterCombinations("8"));
        Check.sameElements("[aa, ab, ac, ba, bb, bc, ca, cb, cc]", () -> sol.letterCombinations("22"));
        Check.sameElements("[wtpm, wtpn, wtpo, wtqm, wtqn, wtqo, wtrm, wtrn, wtro, wtsm, wtsn, wtso, wupm, wupn, wupo, wuqm, wuqn, wuqo, wurm, wurn, wuro, wusm, wusn, wuso, wvpm, wvpn, wvpo, wvqm, wvqn, wvqo, wvrm, wvrn, wvro, wvsm, wvsn, wvso, xtpm, xtpn, xtpo, xtqm, xtqn, xtqo, xtrm, xtrn, xtro, xtsm, xtsn, xtso, xupm, xupn, xupo, xuqm, xuqn, xuqo, xurm, xurn, xuro, xusm, xusn, xuso, xvpm, xvpn, xvpo, xvqm, xvqn, xvqo, xvrm, xvrn, xvro, xvsm, xvsn, xvso, ytpm, ytpn, ytpo, ytqm, ytqn, ytqo, ytrm, ytrn, ytro, ytsm, ytsn, ytso, yupm, yupn, yupo, yuqm, yuqn, yuqo, yurm, yurn, yuro, yusm, yusn, yuso, yvpm, yvpn, yvpo, yvqm, yvqn, yvqo, yvrm, yvrn, yvro, yvsm, yvsn, yvso, ztpm, ztpn, ztpo, ztqm, ztqn, ztqo, ztrm, ztrn, ztro, ztsm, ztsn, ztso, zupm, zupn, zupo, zuqm, zuqn, zuqo, zurm, zurn, zuro, zusm, zusn, zuso, zvpm, zvpn, zvpo, zvqm, zvqn, zvqo, zvrm, zvrn, zvro, zvsm, zvsn, zvso]", () -> sol.letterCombinations("9876"));
        Check.summary();
    }
}
