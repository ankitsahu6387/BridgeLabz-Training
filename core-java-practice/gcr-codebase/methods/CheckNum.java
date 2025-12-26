import java.util.Scanner;

public class CheckNum {
    public static int check(int num){
        if(num>0) return 1;
        if(num<0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(check(num));
        sc.close();
    }
}
