package objectorientedprogramming.encapsulation;
interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    protected String number;
    protected double rate;

    public Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rate * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}

class Bike extends Vehicle {
    public Bike(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rate * days;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C1", 2000);
        Vehicle v2 = new Bike("B1", 500);
        System.out.println(v1.calculateRentalCost(3));
        System.out.println(v2.calculateRentalCost(3));
    }
}
