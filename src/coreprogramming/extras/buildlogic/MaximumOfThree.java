package coreprogramming.extras.buildlogic;
import java.util.Scanner;

public class MaximumOfThree {
    static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];
        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();
        return numbers;
    }

    static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = takeInput(sc);
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
