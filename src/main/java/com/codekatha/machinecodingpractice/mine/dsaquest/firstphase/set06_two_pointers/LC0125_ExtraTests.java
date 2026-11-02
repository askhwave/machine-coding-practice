package com.codekatha.machinecodingpractice.mine.dsaquest.firstphase.set06_two_pointers;

import com.codekatha.machinecodingpractice.mine.dsaquest.common.Check;

/**
 * Extra test cases for LC0125_ValidPalindrome.
 * Run this main() after writing your solution there (it calls that class, so nothing to copy).
 */
public class LC0125_ExtraTests {

    public static void main(String[] args) {
        LC0125_ValidPalindrome sol = new LC0125_ValidPalindrome();
        Check.start("LC0125 extra tests");

        // the three examples
        Check.eq("true", () -> sol.isPalindrome("A man, a plan, a canal: Panama"));
        Check.eq("false", () -> sol.isPalindrome("race a car"));
        Check.eq("true", () -> sol.isPalindrome(" "));

        // DIGITS are alphanumeric - they must NOT be removed
        Check.eq("false", () -> sol.isPalindrome("0P"));
        Check.eq("false", () -> sol.isPalindrome("ab2a"));
        Check.eq("true", () -> sol.isPalindrome("1a1"));
        Check.eq("true", () -> sol.isPalindrome("12321"));
        Check.eq("false", () -> sol.isPalindrome("12345"));
        Check.eq("true", () -> sol.isPalindrome("1 2 3 2 1"));

        // only symbols / spaces -> becomes empty -> palindrome
        Check.eq("true", () -> sol.isPalindrome(".,"));
        Check.eq("true", () -> sol.isPalindrome("!@#  $%^"));

        // tiny strings
        Check.eq("true", () -> sol.isPalindrome("a"));
        Check.eq("true", () -> sol.isPalindrome("aa"));
        Check.eq("false", () -> sol.isPalindrome("ab"));
        Check.eq("true", () -> sol.isPalindrome("aba"));

        // case handling
        Check.eq("true", () -> sol.isPalindrome("abA"));
        Check.eq("true", () -> sol.isPalindrome("Madam, I'm Adam"));
        Check.eq("true", () -> sol.isPalindrome("No 'x' in Nixon"));
        Check.eq("true", () -> sol.isPalindrome("Was it a car or a cat I saw?"));
        Check.eq("true", () -> sol.isPalindrome("Zeus was deified, saw Suez."));
        Check.eq("true", () -> sol.isPalindrome("Marge, let's \"went.\" I await news telegram."));

        // underscore is NOT alphanumeric (traps solutions using \\w / \\W)
        Check.eq("true", () -> sol.isPalindrome("ab_a"));
        Check.eq("true", () -> sol.isPalindrome("_a_"));

        // not palindromes
        Check.eq("false", () -> sol.isPalindrome("abca"));
        Check.eq("false", () -> sol.isPalindrome("a, b, c, d"));

        // big input (n = 2 * 10^5): must run fast
        Check.eq("true", () -> sol.isPalindrome("a".repeat(99999) + "bb" + "a".repeat(99999)));
        Check.eq("false", () -> sol.isPalindrome("a".repeat(99999) + "bc" + "a".repeat(99999)));

        Check.summary();
    }
}
