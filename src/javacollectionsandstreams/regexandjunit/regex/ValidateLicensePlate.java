package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter license plate number: ");
        String plate = sc.nextLine();

        System.out.println(plate.matches("^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$"));
    }
}
