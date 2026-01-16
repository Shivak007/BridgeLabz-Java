package coreprogramming.programmingelements.level1;
import java.util.*;

public class PriceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Product price (INR): ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity brought: ");
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.printf("he total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", total, quantity, unitPrice);
        sc.close();
    }
}
