package coreprogramming.programmingelements.level2;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double interest, p, r, t;

        System.out.print("Enter the principal Amount: ");
        p = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        r = sc.nextDouble();

        System.out.print("Enter the time period (in years): ");
        t = sc.nextDouble();

        interest = p * r * t /100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.0f and Time %.0f", interest, p, r, t);

        sc.close();
    }
}
