import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");    
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt(); 
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        sc.close();
    }
}