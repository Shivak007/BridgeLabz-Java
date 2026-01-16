package coreprogramming.string.level1;
import java.util.*;

public class ToUpperCase {
    static String toUpperCase(String str) {
        String upperCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            upperCase = upperCase + ch;
        }

        return upperCase;
    }

    public static void checkResults(String str) {
        if (toUpperCase(str).equals(str.toUpperCase())) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ between manual and built-in method.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("BuiltIn Method: " + str.toUpperCase());
        System.out.println("User Defined Methods: " + toUpperCase(str));

        checkResults(str);
        sc.close();
    }
}