package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);
    }

    // Test deposit
    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    // Test withdraw
    @Test
    void testWithdraw() {
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    // Test insufficient balance
    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(2000)
        );
        assertEquals("Insufficient funds", exception.getMessage());
    }
}