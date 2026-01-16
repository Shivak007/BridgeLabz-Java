package coreprogramming.string.level1;
import java.util.*;

public class StringComparison {
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return  true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.next().trim();

        System.out.print("Enter the second string: ");
        String s2 = sc.next().trim();

        boolean builtIn = s1.equals(s2);

        System.out.println("Result from user-defined Method: " + compareStrings(s1,s2));
        System.out.println("Result from built-in Method: " + builtIn);

        sc.close();
    }
}
