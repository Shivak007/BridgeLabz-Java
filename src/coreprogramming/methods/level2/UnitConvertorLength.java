package coreprogramming.methods.level2;
import java.util.*;

public class UnitConvertorLength {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        System.out.println(convertYardsToFeet(value));
        System.out.println(convertFeetToYards(value));
        System.out.println(convertMetersToInches(value));
        System.out.println(convertInchesToMeters(value));
        System.out.println(convertInchesToCm(value));
    }
}
