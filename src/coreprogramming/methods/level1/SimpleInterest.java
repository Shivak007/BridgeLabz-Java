package coreprogramming.methods.level1;
import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();

        double si = calculateSimpleInterest(p, r, t);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate %.2f and Time %.1f%n", si, p, r, t);
        sc.close();
    }
}
