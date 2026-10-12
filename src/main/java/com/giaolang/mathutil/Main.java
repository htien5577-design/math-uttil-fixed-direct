package com.giaolang.mathutil;

import com.giaolang.mathutil.core.MathUtil;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenValid5Returns120();
    }

    public static void testFactorialGivenValid5Returns120() {
        long expected = 120L;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        System.out.println("Check 5! | expected: " + expected + " | actual: " + actual);
    }
}
