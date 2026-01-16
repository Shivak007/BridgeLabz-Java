package coreprogramming.methods.level1;
import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int n){
        if (n == 0) return 0;
        else if (n < 0) return -1;
        else return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(checkNumber(number));
        sc.close();
    }
}
