package objectorientedprogramming.oopfundamentals.level2;
import java.util.*;

class PalindromeChecker{
    private String text;

    PalindromeChecker(String text){
        this.text = text;
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}

public class IsPalindrome {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");
        PalindromeChecker p3 = new PalindromeChecker("Racecar");

        System.out.println("*** Test 1 ***");
        p1.displayResult();

        System.out.println("\n*** Test 2 ***");
        p2.displayResult();

        System.out.println("\n*** Test 3 ***");
        p3.displayResult();
    }
}


