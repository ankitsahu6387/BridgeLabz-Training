import java.util.*;
public class largest3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c)
        {
            System.out.print("A is largest: " + a);
        }
        else if(b>=c)
        {
            System.out.print("B is largest: " + b);
        }
        else
        {
            System.out.print("C is largest: " + c);
        }
        sc.close();
    }
    
}
