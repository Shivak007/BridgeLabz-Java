package coreprogramming.arrays.level2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number, count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] reverseDigits = new int[count];
        temp = number;
        int index = 0;
        while (temp != 0) {
            reverseDigits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}