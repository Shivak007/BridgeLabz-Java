package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println(text.replaceAll("\\s+", " "));
    }
}
