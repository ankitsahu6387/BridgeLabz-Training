public class SumTillNot0 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter numbers (enter 0 to stop):");
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        sc.close();
        System.out.println("The sum of the entered numbers is: " + sum);
    }
}
