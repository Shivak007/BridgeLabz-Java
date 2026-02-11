package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class Sale {
    int productId;
    int quantity;
    double price;

    Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}

class ProductSales {
    int productId;
    double revenue;

    ProductSales(int productId, double revenue) {
        this.productId = productId;
        this.revenue = revenue;
    }
}

public class ProductSalesAnalysis {

    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(1, 15, 100),
                new Sale(2, 5, 200),
                new Sale(3, 20, 50),
                new Sale(4, 30, 80),
                new Sale(5, 12, 150)
        );

        List<ProductSales> top5 =
                sales.stream()
                        .filter(s -> s.quantity > 10)
                        .collect(Collectors.groupingBy(
                                s -> s.productId,
                                Collectors.summingDouble(s -> s.quantity * s.price)
                        ))
                        .entrySet()
                        .stream()
                        .map(e -> new ProductSales(e.getKey(), e.getValue()))
                        .sorted(Comparator.comparingDouble((ProductSales p) -> p.revenue).reversed())
                        .limit(5)
                        .collect(Collectors.toList());

        top5.forEach(p ->
                System.out.println("Product: " + p.productId + " Revenue: " + p.revenue));
    }
}
