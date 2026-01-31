package junit_testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StringUtilsTest {
	StringUtils utils = new StringUtils();
	
	@Test
	public void testReverse() {
		assertEquals("olleH", utils.reverse("Hello"));
		assertEquals("avaJ", utils.reverse("Java"));
	}
	@Test
	public void testIsPalindrome() {
		assertTrue(utils.isPalindrome("madam"));
		assertTrue(utils.isPalindrome("RaceCar"));
		assertFalse(utils.isPalindrome("hello"));
	}
}
