import java.util.Scanner;

public class LargestSmallest {
    public static int[] findSmallestAndLargest(int a, int b, int c){
        int smallest = a;
        int largest = a;
        if(b<smallest) smallest = b;
        if(c<smallest) smallest = c;

        if(b>largest) largest = b;
        if(c>largest) largest = c;
        return new int[]{smallest, largest};
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int c = sc.nextInt();
        int ans[] = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest number is " + ans[0] + " and largest number is " + ans[1]);
        sc.close();        
    }
}
