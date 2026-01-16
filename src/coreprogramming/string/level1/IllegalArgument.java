package coreprogramming.string.level1;
import java.util.Scanner;

public class IllegalArgument {

    public static void generateException(String input) {
        System.out.println("Substring: " + input.substring(5, 2));
    }

    public static void handleException(String input) {
        try {
            System.out.println("Substring: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Reason: " + e.getMessage());
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
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(text);

        sc.close();
    }
}
