package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Matcher m = Pattern
                .compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.CASE_INSENSITIVE)
                .matcher(text);

        while (m.find())
            System.out.println(m.group(1));
    }
}
