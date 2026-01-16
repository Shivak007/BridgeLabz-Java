package coreprogramming.string.level3;
import java.util.Scanner;

public class UniqueCharFrequency {
    static char[] uniqueCharacters(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique += ch;
            }
        }
        return unique.toCharArray();
    }

    static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("Character frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + " : " + pair[1]);
        }

        sc.close();
    }
}