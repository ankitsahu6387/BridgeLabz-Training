import java.util.Scanner;

public class FestivalLuckyDrawSimple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String more;

        do {
            System.out.print("Enter lucky number: ");
            int num = sc.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Visitor wins a gift 🎁");
            } else {
                System.out.println("Try next time");
            }

            System.out.print("More visitors? (yes/no): ");
            more = sc.next();

        } while (more.equalsIgnoreCase("yes"));

        sc.close();
    }
}
