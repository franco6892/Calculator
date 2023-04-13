package FrancoRules;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    public void multiplies2times2() {
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    public void multiplies5timesMinus1() {
        assertEquals(-5, calc.multiply(5, -1));
    }

    @Test
    public void divide4By2Returns2() {
        assertEquals(2, calc.divide(4, 2), 0.0001);
    }

    @Test
    public void divides5By2Returns2Point5() {
        assertEquals(2.5, calc.divide(5, 2), 0.0001);
    }

    @Test
    public void divideByZeroThrows() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calc.divide(4,0));
        assertEquals("Can not divide by zero", ex.getMessage());
    }

    @Test
    public void addsManyNumbers() {
        assertEquals(15, calc.addAll(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void maxReturnsLargesNumber() {
        assertEquals(15, calc.max(new int[]{1, 3, -5, 15, 0}));
    }
}