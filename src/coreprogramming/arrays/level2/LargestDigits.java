package coreprogramming.arrays.level2;
import java.util.Scanner;

public class LargestDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int index = 0;

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        while(number != 0){
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if(index == maxDigit){
                break;
            }

            number = number / 10;
        }

        int largest = 0, slargest = 0;
        for(int i = 0; i < index; i++){
            if(digits[i] > largest){
                slargest = largest;
                largest = digits[i];
            }else if (digits[i] > slargest && digits[i] != largest){
                slargest = digits[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + slargest);
        sc.close();
    }
}