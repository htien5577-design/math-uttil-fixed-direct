package com.giaolang.mathutil.core;

public class MathUtil {

    private MathUtil() {
        // Utility class; no instances needed.
    }

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }

        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
