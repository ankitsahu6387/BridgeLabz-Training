import java.util.*;
public class multiple_of10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int num = sc.nextInt();
            if(num % 10 != 0)
            {
                System.out.println(num);
            }
            else
            {
                System.out.print(num);
                break;
            }
        }
        sc.close();
    }
}
