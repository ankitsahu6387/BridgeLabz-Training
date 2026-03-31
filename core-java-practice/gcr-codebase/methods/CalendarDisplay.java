import java.util.Scanner;

public class CalendarDisplay {
    static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        return months[month - 1];
    }
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }
    static int getFirstDayOfMonth(int month, int year) {
        int day = 1; // first day of month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ...
    }
    static void printCalendar(int month, int year) {
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        // Loop 1: indentation before the first day
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        int days = getDaysInMonth(month, year);
        // Loop 2: display the days
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        printCalendar(month, year);
        sc.close();
    }
}
