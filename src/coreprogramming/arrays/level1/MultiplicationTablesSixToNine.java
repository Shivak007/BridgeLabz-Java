package coreprogramming.arrays.level1;
import java.util.*;

public class MultiplicationTablesSixToNine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (6-9): ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[10];

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i+1);
        }

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }


        sc.close();
    }
}