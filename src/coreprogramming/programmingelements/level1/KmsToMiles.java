package coreprogramming.programmingelements.level1;
import java.util.Scanner;

public class KmsToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInKms =  sc.nextDouble();
        double distanceInMiles = distanceInKms * 0.621371;

        System.out.printf("The total miles is %.2f mile for the given %.1fkm", distanceInMiles, distanceInKms);
    }
}
