package coreprogramming.programmingelements.level2;
import java.util.*;

public class DoubleOpt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double res1 = a + b * c;
        double res2 = a * b + c;
        double res3 = c + a / b;
        double res4 = a % b + c;

        System.out.printf("The results of Int Operations are %.1f, %.1f, %.1f, and %.1f", res1, res2, res3, res4);
    }
}
