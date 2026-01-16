package coreprogramming.programmingelements.level1;
import java.util.*;

public class FootToYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance (in feet): ");
        double feet = sc.nextDouble();
        double yards = feet / 3.0;
        double miles = yards / 1760;

        System.out.printf("The distance in foot is %.1f \nYards: %.2f \t Miles: %.2f", feet, yards, miles);
        sc.close();
    }
}
