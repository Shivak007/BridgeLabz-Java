package coreprogramming.controlflows.level1;
import java.util.Scanner;
class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println(sum);
            System.out.println(formula);
        }
    }
}
