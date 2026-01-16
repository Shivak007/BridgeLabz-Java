package objectorientedprogramming.oopfundamentals.level2;

class CartItem {
    String itemName;
    int quantity;
    double price;

    CartItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " (Qty: " + quantity + ", Price: ₹" + price + ")");
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 1, 55000);
        CartItem item2 = new CartItem("Mouse", 2, 500);
        CartItem item3 = new CartItem("Keyboard", 1, 1500);

        System.out.println("--- Cart Items ---");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        double total = item1.getTotalCost() + item2.getTotalCost() + item3.getTotalCost();
        System.out.println("Total Cost: ₹" + total);
    }
}