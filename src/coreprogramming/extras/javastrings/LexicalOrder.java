package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class LexicalOrder {
    public static int lexOrder(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int minLen = Math.min(l1,l2);

        for(int i = 0; i < minLen; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 != c2)    return c1 - c2; //+ve s1 is greater, -ve s2 is greater
        }
        return l1 - l2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = lexOrder(str1, str2);

        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
        }

        sc.close();
    }

}
