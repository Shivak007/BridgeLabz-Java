package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;
import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Matcher m = Pattern
                .compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
                .matcher(text);

        while (m.find())
            System.out.println(m.group());
    }
}
