package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    // Valid passwords
    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Secure99"));
    }

    // Invalid passwords
    @Test
    void testInvalidPasswords() {
        assertFalse(validator.isValid("pass1"));        // too short
        assertFalse(validator.isValid("password1"));    // no uppercase
        assertFalse(validator.isValid("Password"));     // no digit
        assertFalse(validator.isValid("12345678"));     // no uppercase
    }
}