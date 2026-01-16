package objectorientedprogramming.encapsulation;

abstract class FoodItem {
    protected double price;
    protected int qty;

    public FoodItem(double price, int qty) {
        this.price = price;
        this.qty = qty;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(double price, int qty) {
        super(price, qty);
    }

    public double calculateTotalPrice() {
        return price * qty;
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(double price, int qty) {
        super(price, qty);
    }

    public double calculateTotalPrice() {
        return price * qty + 50;
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem(30, 3);
        FoodItem f2 = new NonVegItem(200, 2);
        System.out.println("Vegetarian: " + f1.calculateTotalPrice());
        System.out.println("Non-Vegetarian: " + f2.calculateTotalPrice());
    }
}

