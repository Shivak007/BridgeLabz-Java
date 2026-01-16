package coreprogramming.string.level1;
import java.util.Scanner;

public class NumberFormat{

    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Reason: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException! Reason: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(text);

        sc.close();
    }
}
