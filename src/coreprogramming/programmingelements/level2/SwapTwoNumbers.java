package coreprogramming.programmingelements.level2;
import java.util.*;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.printf("The swapped numbers are %d and %d", number1, number2);
        sc.close();
    }
}
