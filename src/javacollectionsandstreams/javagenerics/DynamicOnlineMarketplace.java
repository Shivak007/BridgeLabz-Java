package javacollectionsandstreams.javagenerics;
import java.util.*;

abstract class ProductCategory {
    abstract String getCategoryName();
}

class BookCategory extends ProductCategory {
    String getCategoryName() { return "Books"; }
}

class ClothingCategory extends ProductCategory {
    String getCategoryName() { return "Clothing"; }
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void applyDiscount(double percent) {
        price -= price * percent / 100;
    }

    public String toString() {
        return name + " - " + category.getCategoryName() + " - " + price;
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, new ClothingCategory());

        book.applyDiscount(10);
        shirt.applyDiscount(20);

        System.out.println(book);
        System.out.println(shirt);
    }
}
