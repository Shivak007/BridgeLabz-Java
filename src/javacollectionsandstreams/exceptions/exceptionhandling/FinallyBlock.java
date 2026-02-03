package javacollectionsandstreams.exceptions.exceptionhandling;
import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
