public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[2]); // This will throw ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will throw ArithmeticException 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: ");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: ");
        }
    }
}
