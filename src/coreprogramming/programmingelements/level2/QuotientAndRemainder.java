package coreprogramming.programmingelements.level2;
import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two nos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d", (a / b), (a % b), a, b);
    }
}
