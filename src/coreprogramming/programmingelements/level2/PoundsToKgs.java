package coreprogramming.programmingelements.level2;
import java.util.*;

public class PoundsToKgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your weight (in pounds): ");
        double wtInPounds = sc.nextDouble();

        double wtInKgs = 2.2 * wtInPounds;

        System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f", wtInPounds, wtInKgs);
        sc.close();
    }
}
