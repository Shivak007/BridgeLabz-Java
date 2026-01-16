package coreprogramming.controlflows.level3;
import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number)
            System.out.println("The number is an Armstrong number");
        else
            System.out.println("The number is not an Armstrong number");
    }
}
