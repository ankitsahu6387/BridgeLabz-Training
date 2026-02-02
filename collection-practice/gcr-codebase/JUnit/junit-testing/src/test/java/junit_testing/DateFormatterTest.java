package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    // Valid date test
    @Test
    void testValidDate() {
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
        assertEquals("01-01-2021", formatter.formatDate("2021-01-01"));
    }

    // Invalid date test
    @Test
    void testInvalidDate() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> formatter.formatDate("12/25/2023")
        );
        assertEquals("Invalid date format", exception.getMessage());

        exception = assertThrows(
            IllegalArgumentException.class,
            () -> formatter.formatDate("2023-13-01")
        );
        assertEquals("Invalid date format", exception.getMessage());
    }
}