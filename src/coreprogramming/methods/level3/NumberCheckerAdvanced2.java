package coreprogramming.methods.level3;
import java.util.Arrays;

public class NumberCheckerAdvanced2 {
    public static void main(String[] args) {
        int number = 153; // Example number

        int[] digits = storeDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares of digits: " + sumSquares(digits));
        System.out.println("Is Harshad number? " + isHarshad(number));
        System.out.println("Digit frequency: " + Arrays.deepToString(digitFrequency(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int sum = 0;
        for (int d : storeDigits(n)) sum += d;
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = storeDigits(n);
        int i = 0, j = digits.length - 1;
        while (i < j) {
            if (digits[i] != digits[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        for (int d : storeDigits(square)) sum += d;
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        for (int d : storeDigits(n)) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String strN = String.valueOf(n);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strN);
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
