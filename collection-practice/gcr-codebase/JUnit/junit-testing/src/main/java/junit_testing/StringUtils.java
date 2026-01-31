package junit_testing;

public class StringUtils {
	//reverse
	public String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	//palindrome
	public boolean isPalindrome(String str) {
		String reversed = reverse(str); //methode call
		return str.equalsIgnoreCase(reversed);
	}
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
