import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }   
        sc.close();
        for(int i = 0; i < 10; i++) {
            if(arr[i] < 0) {
                System.out.println("Invalid age");
            }
            else if(arr[i] >= 18) {
                System.out.println("The student with the age " + arr[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + arr[i] + " can not vote.");
            }
        }
    }
}
