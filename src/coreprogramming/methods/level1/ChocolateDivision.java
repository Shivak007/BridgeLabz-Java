package coreprogramming.methods.level1;
import java.util.Scanner;

public class ChocolateDivision {
    public static int[] divideChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[] {each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Number of children: ");
        int children = sc.nextInt();

        int[] res = divideChocolates(chocolates, children);
        System.out.println("Each child gets: " + res[0] + " chocolates. Remaining: " + res[1]);
        sc.close();
    }
}
