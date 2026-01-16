package objectorientedprogramming.oopfundamentals.level1;

class Mobiles {
    private String brand;
    private String model;
    private double price;

    Mobiles(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Mobiles m1 = new Mobiles("Samsung", "Galaxy S25", 79999);
        Mobiles m2 = new Mobiles("Apple", "iPhone 16", 99999);

        System.out.println("*** Phone 1 ***");
        m1.displayDetails();
        System.out.println("\n*** Phone 2 ***");
        m2.displayDetails();
    }
}
