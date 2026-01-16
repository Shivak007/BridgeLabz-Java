package objectorientedprogramming.oopfundamentals.level1;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryItems {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 55000);
        i1.displayDetails();
        System.out.println("Total Cost for 2 units: ₹" + i1.calculateTotalCost(2));
    }
}
