package coreprogramming.string.level1;
import java.util.Scanner;

public class StringIndex {

    public static void generateException(String input) {
        System.out.println("Character at invalid index: " + input.charAt(input.length()));
    }

    public static void handleException(String input) {
        try {
            System.out.println("Character at invalid index: " + input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Reason: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(text);

        sc.close();
    }
}