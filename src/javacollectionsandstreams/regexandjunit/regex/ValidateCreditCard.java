package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String card = sc.nextLine();

        System.out.println(card.matches("4\\d{15}|5\\d{15}"));
    }
}
