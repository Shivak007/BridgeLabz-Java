package coreprogramming.programmingelements.level2;
import java.util.*;
import java.lang.Math;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1,side2,side3;
        System.out.print("Enter the three sides of the triangle (Non-Zero): ");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

        double p = side1 + side2 + side3;
        int rounds = (int)Math.ceil(5000.0 / p);

        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km", rounds);
        sc.close();
    }
}
