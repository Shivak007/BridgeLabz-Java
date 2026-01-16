package objectorientedprogramming.encapsulation;
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int id;
    private String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double finalPrice() {
        return price + (this instanceof Taxable ? ((Taxable)this).calculateTax() : 0) - calculateDiscount();
    }

    public void display() {
        System.out.println(id + ") " + name + " ₹" + finalPrice());
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.1;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public String getTaxDetails() {
        return "GST 18%";
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.2;
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1000));
        for (Product p : products) p.display();
    }
}
