package coreprogramming.arrays.level1;
import java.util.*;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;
        double total = 0.0;

        while(true){
            double num = sc.nextDouble();
            if(index == numbers.length){
                break;
            }
            if(num <= 0){
                break;
            }

            numbers[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(numbers));

        for (double number : numbers) {
            total = total + number;
        }
        System.out.printf("Total: %.1f",total);
        sc.close();
    }
}