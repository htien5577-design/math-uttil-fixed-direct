import org.junit.jupiter.api.Test;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilTest {

    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-1));
    }

    @Test
    void testFactorialGivenValid5Returns120() {
        assertEquals(120L, getFactorial(5));
    }

    @Test
    void testFactorialGivenValid6Returns720() {
        assertEquals(720L, getFactorial(6));
    }

    @Test
    void testFactorialGivenValid0Returns1() {
        assertEquals(1L, getFactorial(0));
    }

    @Test
    void testFactorialGivenInvalidN21ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(21));
    }
}
