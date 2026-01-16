package coreprogramming.methods.level2;
import java.util.*;

public class LeapYearCheck {
    static boolean isLeap(int y) {
        return (y >= 1582) && ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.println(isLeap(year));
    }
}

