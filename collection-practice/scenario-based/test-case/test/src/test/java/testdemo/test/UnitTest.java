package testdemo.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
	@Test
	public void DepositValidTest() {
		Program account = new Program(100.0);
		account.Deposit(50.0);
		assertEquals(150.0, account.getBalance());
	}
	@Test
	public void DepositNegativeAmtTest() {
		Program account = new Program(100.0);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			account.Deposit(-10.0);
		});
		assertEquals("Deposit amount cannot be negative", exception.getMessage());
	}
	@Test
	public void WithdrawValidAmtTest() {
		Program account = new Program(100.0);
		account.Withdraw(50.0);
		assertEquals(50.0, account.getBalance());
	}
	@Test
	public void InsufficientBalanceTest() {
		Program account = new Program(100.);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			account.Withdraw(200.0);
		});
		assertEquals("Insufficient balance", exception.getMessage());
	}
}
