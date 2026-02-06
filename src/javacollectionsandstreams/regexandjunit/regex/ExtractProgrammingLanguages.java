package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;
import java.util.regex.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Matcher m =
                Pattern.compile("\\b(Java|Python|JavaScript|Go|java|python|javascript|go)\\b").matcher(text);

        while (m.find())
            System.out.println(m.group());
    }
}
