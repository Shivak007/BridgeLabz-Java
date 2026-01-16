package coreprogramming.methods.level3;
import java.util.Arrays;

public class NumbersChecker1 {
    public static void main(String[] args) {
        int number = 153; // Example number

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong number? " + isArmstrong(number));
        int[] largest = largestTwoDigits(digits);
        int[] smallest = smallestTwoDigits(digits);
        System.out.println("Largest two digits: " + Arrays.toString(largest));
        System.out.println("Smallest two digits: " + Arrays.toString(smallest));
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    public static int[] largestTwoDigits(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwoDigits(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }
}
