package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Calculator2Test {

    Calculator2 calculator = new Calculator2();

    @Test
    public void testDivideByZeroException() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    public void testValidDivision() {
        assertEquals(5, calculator.divide(10, 2));
    }
}