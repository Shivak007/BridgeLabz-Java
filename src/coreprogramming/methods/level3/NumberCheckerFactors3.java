package coreprogramming.methods.level3;
import java.util.Arrays;

public class NumberCheckerFactors3 {
    public static void main(String[] args) {
        int number = 28; // Example number

        int[] factors = findFactors(number);

        System.out.println("coreProgramming.methods.Level2.Factors: " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubes of factors: " + productCubeFactors(factors));
        System.out.println("Is Perfect number? " + isPerfect(number));
        System.out.println("Is Abundant number? " + isAbundant(number));
        System.out.println("Is Deficient number? " + isDeficient(number));
        System.out.println("Is Strong number? " + isStrong(number));
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static double productCubeFactors(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sumFact = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sumFact += factorial(digit);
            temp /= 10;
        }
        return sumFact == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
