package coreprogramming.string.level2;
import java.util.*;

public class LengthOfString {
        public static int findLength(String str) {
            int count = 0;
            try {
                while (true) {
                    str.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.next();

            int customLength = findLength(input);

            System.out.println("Length using Custom method: " + customLength);
            System.out.println("Length using Built-In method: " + input.length());

            sc.close();
        }
    }