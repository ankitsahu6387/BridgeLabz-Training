import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    static void generateException(String[] names) {
        System.out.println("Accessing 10th element: " + names[10]);
    }
    static void handleException(String[] names) {
        try {
            System.out.println("Accessing 10th element: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: Index is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("A general runtime exception was handled.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }
        System.out.println("\nHandling ArrayIndexOutOfBoundsException safely:");
        handleException(names);
        sc.close();
    }
}
