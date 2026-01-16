package coreprogramming.programmingelements.level1;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = 2024 - birthYear;

        System.out.println("Your age is "  + age);
        sc.close();
    }
}
