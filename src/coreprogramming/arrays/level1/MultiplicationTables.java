package coreprogramming.arrays.level1;
import java.util.*;

public class MultiplicationTables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] tables = new int[10];

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= tables.length; i++){
            tables[i] = i * num;
            System.out.println(num + "*" + i + " = " + tables[i]);
        }
    }
}