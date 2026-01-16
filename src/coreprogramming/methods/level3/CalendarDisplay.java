package coreprogramming.methods.level3;
import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // Adjust for leap year
        if (month == 2 && isLeapYear(year)) daysInMonth[1] = 29;

        // Get first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print indentation for first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        int d = 1; // First day of month

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int f = d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j;
        return f % 7; // 0 = Saturday, 1 = Sunday, ..., 6 = Friday
    }
}
