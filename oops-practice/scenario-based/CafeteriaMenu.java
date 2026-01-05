import java.util.Scanner;

public class CafeteriaMenu {
    static void displayMenu(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " - " + items[i]);
        }
    }
    static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return "Invalid Selection";
    }
    public static void main(String[] args) {
        String[] menu = {"Idli", "Dosa", "Vada", "Pav Bhaji", "Sandwich", "Burger", "Pizza", "Pasta", "Coffee", "Tea"};
        Scanner sc = new Scanner(System.in);
        displayMenu(menu);
        System.out.print("Select item index: ");
        int choice = sc.nextInt();
        System.out.println("You selected: " + getItemByIndex(menu, choice));
    }
}
