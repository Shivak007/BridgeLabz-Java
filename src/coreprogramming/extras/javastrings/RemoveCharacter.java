package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class RemoveCharacter {

    public static String removeChar(String str, char chToRemove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != chToRemove) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String output = removeChar(input, ch);
        System.out.println("String after removing '" + ch + "': " + output);

        sc.close();
    }
}