package objectorientedprogramming.constructors.level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 1000.0;

    CarRental() {
        this("Unknown", "Hatchback", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double totalCost() {
        return rentalDays * dailyRate;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + totalCost());
    }
}