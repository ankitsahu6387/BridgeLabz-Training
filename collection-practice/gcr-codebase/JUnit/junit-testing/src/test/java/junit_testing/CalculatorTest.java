package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(7, calc.add(3, 4));
        assertEquals(-1, calc.add(-3, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
        assertEquals(-7, calc.subtract(3, 10));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
        assertEquals(-15, calc.multiply(-3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calc.divide(25, 5));
        assertEquals(-3, calc.divide(9, -3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}