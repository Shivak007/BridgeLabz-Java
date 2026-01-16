package coreprogramming.methods.level2;
import java.util.*;
import java.util.*;

public class UnitConvertor {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double k) {
        return k * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        System.out.println(fahrenheitToCelsius(value));
        System.out.println(celsiusToFahrenheit(value));
        System.out.println(poundsToKg(value));
        System.out.println(kgToPounds(value));
        System.out.println(gallonsToLiters(value));
        System.out.println(litersToGallons(value));
    }
}
