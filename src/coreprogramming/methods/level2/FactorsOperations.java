package coreprogramming.methods.level2;
import java.util.*;

public class FactorsOperations {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i : a) s += i;
        return s;
    }

    public static long product(int[] a) {
        long p = 1;
        for (int i : a) p *= i;
        return p;
    }

    public static double sumOfSquares(int[] a) {
        double s = 0;
        for (int i : a) s += Math.pow(i, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to calculate factors: ");
        int n = sc.nextInt();

        int[] f = findFactors(n);

        System.out.println(Arrays.toString(f));
        System.out.printf("Sum of factors: %d \n", sum(f));
        System.out.printf("Product of factors: %d \n", product(f));
        System.out.printf("Sum of Square of factors: %.2f \n", sumOfSquares(f));
    }
}
