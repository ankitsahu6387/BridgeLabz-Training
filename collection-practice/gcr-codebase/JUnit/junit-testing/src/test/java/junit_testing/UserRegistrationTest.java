package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    // Valid registration
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "Password1"));
    }

    // Invalid username
    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> registration.registerUser("", "john@example.com", "Password1")
        );
        assertEquals("Invalid username", exception.getMessage());
    }

    // Invalid email
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> registration.registerUser("JohnDoe", "johnexample.com", "Password1")
        );
        assertEquals("Invalid email", exception.getMessage());
    }

    // Invalid password
    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> registration.registerUser("JohnDoe", "john@example.com", "pass")
        );
        assertEquals("Invalid password", exception.getMessage());
    }
}