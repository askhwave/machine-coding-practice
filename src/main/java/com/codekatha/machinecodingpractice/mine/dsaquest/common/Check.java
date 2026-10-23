package com.codekatha.machinecodingpractice.mine.dsaquest.common;

import java.util.*;
import java.util.function.Supplier;

/**
 * Tiny self-checking test helper for dsaquest.
 *
 *   Check.start("LC0001_TwoSum");
 *   Check.eq("[0, 1]", () -> sol.twoSum(new int[]{2,7,11,15}, 9));   // exact match (printed form)
 *   Check.eq(5, () -> sol.maxDepth(root));                            // expected can be any value
 *   Check.sameElements("[0, 1]", () -> sol.twoSum(...));              // "return in any order" problems
 *   Check.summary();
 *
 * Exceptions thrown by your code are caught and shown as FAIL (so one bad case doesn't stop the rest).
 */
public class Check {
    private static int total, passed;

    public static void start(String name) {
        total = 0;
        passed = 0;
        System.out.println("=== " + name + " ===");
    }

    public static void eq(Object expected, Supplier<Object> actual) {
        run(expected, actual, false);
    }

    public static void sameElements(Object expected, Supplier<Object> actual) {
        run(expected, actual, true);
    }

    public static void summary() {
        System.out.println("Result: " + passed + "/" + total + " passed" + (passed == total && total > 0 ? "  -> ALL PASSED" : ""));
        System.out.println();
    }

    // ------------------------------------------------------------------ internals

    private static void run(Object expected, Supplier<Object> actualSupplier, boolean anyOrder) {
        total++;
        Object actual;
        try {
            actual = actualSupplier.get();
        } catch (Throwable t) {
            System.out.println("  [FAIL] case " + total + " -> threw " + t);
            return;
        }
        boolean ok;
        String exp, act;
        if (expected instanceof Number && actual instanceof Number
                && (expected instanceof Double || actual instanceof Double)) {
            ok = Math.abs(((Number) expected).doubleValue() - ((Number) actual).doubleValue()) < 1e-5;
            exp = String.valueOf(expected);
            act = String.valueOf(actual);
        } else if (anyOrder) {
            exp = norm(expected);
            act = norm(actual);
            ok = exp.equals(act);
        } else {
            exp = str(expected);
            act = str(actual);
            ok = exp.equals(act);
        }
        if (ok) {
            passed++;
            System.out.println("  [PASS] case " + total);
        } else {
            System.out.println("  [FAIL] case " + total + " -> expected " + (anyOrder ? str(expected) + " (any order)" : exp)
                    + " but got " + str(actual));
        }
    }

    static String str(Object o) {
        if (o == null) return "null";
        if (o instanceof int[]) return Arrays.toString((int[]) o);
        if (o instanceof long[]) return Arrays.toString((long[]) o);
        if (o instanceof char[]) return Arrays.toString((char[]) o);
        if (o instanceof boolean[]) return Arrays.toString((boolean[]) o);
        if (o instanceof double[]) return Arrays.toString((double[]) o);
        if (o instanceof Object[]) return Arrays.deepToString((Object[]) o);
        return String.valueOf(o);
    }

    /** Parses text like "[[1, 2], [3]]" or "[[bat], [tan, nat]]" into nested lists of tokens. */
    private static Object parse(String s, int[] pos) {
        while (pos[0] < s.length() && s.charAt(pos[0]) == ' ') pos[0]++;
        if (pos[0] < s.length() && s.charAt(pos[0]) == '[') {
            pos[0]++;
            List<Object> list = new ArrayList<>();
            while (pos[0] < s.length()) {
                while (pos[0] < s.length() && s.charAt(pos[0]) == ' ') pos[0]++;
                if (pos[0] < s.length() && s.charAt(pos[0]) == ']') { pos[0]++; break; }
                list.add(parse(s, pos));
                while (pos[0] < s.length() && s.charAt(pos[0]) == ' ') pos[0]++;
                if (pos[0] < s.length() && s.charAt(pos[0]) == ',') pos[0]++;
            }
            return list;
        }
        int st = pos[0];
        while (pos[0] < s.length() && s.charAt(pos[0]) != ',' && s.charAt(pos[0]) != ']') pos[0]++;
        return s.substring(st, pos[0]).trim();
    }

    /** Order-insensitive form: every level of nesting is sorted. */
    private static String norm(Object o) {
        List<String> parts = new ArrayList<>();
        if (o instanceof int[]) {
            for (int v : (int[]) o) parts.add(String.valueOf(v));
        } else if (o instanceof Object[]) {
            for (Object v : (Object[]) o) parts.add(norm(v));
        } else if (o instanceof Collection) {
            for (Object v : (Collection<?>) o) parts.add(norm(v));
        } else if (o instanceof String && ((String) o).startsWith("[")) {
            return norm(parse((String) o, new int[]{0}));
        } else {
            return String.valueOf(o);
        }
        Collections.sort(parts);
        return parts.toString();
    }
}
