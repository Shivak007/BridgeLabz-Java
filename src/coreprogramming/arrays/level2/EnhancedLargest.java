package coreprogramming.arrays.level2;
import java.util.Scanner;

public class EnhancedLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            number = number / 10;
        }
        int largest = 0, slargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                slargest = largest;
                largest = digits[i];
            } else if (digits[i] > slargest && digits[i] != largest) {
                slargest = digits[i];
            }
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + slargest);

        sc.close();
    }
}