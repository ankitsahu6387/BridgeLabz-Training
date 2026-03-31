public class CreditCardValidator {
    public static void main(String[] args) {
        String cardNumber = "4539148803436467"; // change value to test
        String regex = "^[45][0-9]{15}$";
        if (cardNumber.matches(regex)) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }
}
