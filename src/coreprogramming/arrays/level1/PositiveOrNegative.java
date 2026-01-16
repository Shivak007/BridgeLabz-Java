package coreprogramming.arrays.level1;
import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < arr1.length; i++){
            int num = arr1[i];

            if(num < 0){
                System.out.println("Negative");
            }else if(num == 0){
                System.out.println("Zero");
            }else{
                if(num % 2 == 0){
                    System.out.println("Even Positive");
                }else{
                    System.out.println("Odd Positive");
                }
            }
        }

        int lastIndex = arr1.length - 1;
        if(arr1[0] == arr1[lastIndex]){
            System.out.println("They are equal");
        }else if(arr1[0] < arr1[lastIndex]){
            System.out.println("Last element is greater");
        }else{
            System.out.println("First element is greater");
        }
    }
}