package javacollectionsandstreams.regexandjunit.regex;

import java.util.*;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter number of bad words: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bad word: ");
            String badWord = sc.nextLine();
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println(text);
    }
}
