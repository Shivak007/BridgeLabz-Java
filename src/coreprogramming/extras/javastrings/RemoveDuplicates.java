package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class RemoveDuplicates {
    static String removeDuplicateChar(String str){
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();

    }

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next().toLowerCase();

        System.out.println(removeDuplicateChar(input));
        sc.close();
    }
}
