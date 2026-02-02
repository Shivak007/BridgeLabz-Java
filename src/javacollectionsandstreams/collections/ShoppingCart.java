package javacollectionsandstreams.collections;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> hashMap = new HashMap<>();
        Map<String, Double> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Double, String> treeMap = new TreeMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            hashMap.put(product, price);
            linkedHashMap.put(product, price);
            treeMap.put(price, product);
        }

        System.out.println("Products (Insertion Order): " + linkedHashMap);
        System.out.println("Products (Sorted by Price): " + treeMap);
    }
}
