package javacollectionsandstreams.regexandjunit.regex;
import java.util.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = sc.nextLine();

        String regex =
                "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        System.out.println(ip.matches(regex));
    }
}
