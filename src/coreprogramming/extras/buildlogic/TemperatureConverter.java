package coreprogramming.extras.buildlogic;
import java.util.Scanner;

public class TemperatureConverter {
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println("Converted to Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 'F') {
            System.out.println("Converted to Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}