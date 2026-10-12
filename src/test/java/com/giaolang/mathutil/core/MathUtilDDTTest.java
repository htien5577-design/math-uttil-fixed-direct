package com.giaolang.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilDDTTest {

    public static Object[][] initTestData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenValidNRunsWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
