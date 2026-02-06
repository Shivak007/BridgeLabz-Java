package javacollectionsandstreams.regexandjunit.regex;

import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text containing currency values: ");
        String text = sc.nextLine();

        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{1,2}").matcher(text);

        while (m.find())
            System.out.println(m.group());
    }
}
