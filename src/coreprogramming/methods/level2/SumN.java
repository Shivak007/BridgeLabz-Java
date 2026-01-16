package coreprogramming.methods.level2;
import java.util.*;

public class SumN {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) return;

        System.out.printf("Recursive Sum: %d\n",recursiveSum(n));
        System.out.printf("Formula Sum: %d", formulaSum(n));
    }
}

