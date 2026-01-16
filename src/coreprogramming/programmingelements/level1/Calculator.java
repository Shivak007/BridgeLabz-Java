package coreprogramming.programmingelements.level1;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        
        float add= num1 + num2;
        float sub = num1 - num2;
        float multi = num1 * num2;
        float div = num1 / num2;

        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.1f and %.1f is %.1f, %.1f, %.1f, and %.1f\n", num1, num2, add, sub, multi, div);
        sc.close();
    }
}
