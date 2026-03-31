import java.util.Scanner;

public class ChocolatesAmongStudents {
    public static int[] findRemainderAndQuotient(int chocolates, int students){
        return new int[] {chocolates%students, chocolates/students};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int ans[] = findRemainderAndQuotient(chocolates, students);  
        System.out.println("Each Student will get " + ans[1]+ " chocolates and Remaining chocolates are " + ans[0]);
        sc.close();
    }
}

