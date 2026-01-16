package coreprogramming.controlflows.level1;
import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
