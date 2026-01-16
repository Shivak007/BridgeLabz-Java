package coreprogramming.extras.javastrings;
import java.util.*;

public class CheckPalindrome {
    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next().toLowerCase();

        if(isPalindromeIterative(input)){
            System.out.println("It's a palindrome");
        }else System.out.println("It's not a palindrome");
        sc.close();
    }
}
