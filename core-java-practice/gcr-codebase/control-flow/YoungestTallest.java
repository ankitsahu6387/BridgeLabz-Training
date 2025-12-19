import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amar's age");
        int amarAge = sc.nextInt();
        System.out.println("Enter amar's height");
        double amarHeight = sc.nextDouble();
        System.out.println("Enter akbar's age");
        int akbarAge = sc.nextInt();
        System.out.println("Enter akbar's height");
        double akbarHeight = sc.nextDouble();  
        System.out.println("Enter anthony's age"); 
        int anthonyAge = sc.nextInt();
        System.out.println("Enter anthony's height");
        double anthonyHeight = sc.nextDouble();
        sc.close();
        // youngest 
        if(amarAge < akbarAge && amarAge < anthonyAge){
            System.out.println("Amar is the youngest "+amarAge);
        } else if(akbarAge < amarAge && akbarAge < anthonyAge){
            System.out.println("Akbar is the youngest "+akbarAge);
        } else if(anthonyAge < amarAge && anthonyAge < akbarAge){
            System.out.println("Anthony is the youngest "+anthonyAge);
        } else {
            System.out.println("Tie in youngest age.");
        }
        // tallest
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
            System.out.println("Amar is the tallest "+amarHeight);
        } else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
            System.out.println("Akbar is the tallest "+akbarHeight);
        } else if(anthonyHeight > amarHeight && anthonyHeight > akbarHeight){
            System.out.println("Anthony is the tallest "+anthonyHeight);
        } else {
            System.out.println("Tie in tallest height.");
        }   
    }
}
