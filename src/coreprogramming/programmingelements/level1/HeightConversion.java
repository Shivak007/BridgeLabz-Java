package coreprogramming.programmingelements.level1;
import java.util.*;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height (in cms): ");
        double height = sc.nextDouble();

        // Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
        double heightInInch = height / 2.54;
        double heightInFoot = heightInInch / 12;
        heightInInch = heightInInch % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %.1f and inches is %.2f", height, heightInFoot, heightInInch);
    }
}
