package coreprogramming.string.level1;
import java.util.*;

public class ToLowerCase {
    static String toLower(String str) {
        String lowerCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            lowerCase = lowerCase + ch;
        }

        return lowerCase;
    }

    public static void checkResults(String str) {
        if (toLower(str).equals(str.toLowerCase())) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ between manual and built-in method.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("BuiltIn Method: " + str.toLowerCase());
        System.out.println("User Defined Methods: " + toLower(str));

        checkResults(str);
        sc.close();
    }
}