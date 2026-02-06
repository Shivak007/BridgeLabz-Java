package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;

public class ValidateHexColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        System.out.println(color.matches("^#[0-9A-Fa-f]{6}$"));
    }
}
