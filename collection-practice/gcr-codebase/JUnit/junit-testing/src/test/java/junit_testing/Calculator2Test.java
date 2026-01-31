import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

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
