package coreprogramming.programmingelements.level2;
import java.util.*;
import java.lang.Math;

public class ChocolatesPerChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Number of Childrens: ");
        int numberOfChildren = sc.nextInt();

        int chocolatePerChildren = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d", chocolatePerChildren, remaining);
        sc.close();
    }
}
