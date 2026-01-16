package objectorientedprogramming.encapsulation;
abstract class RideVehicle {
    protected double rate;

    public RideVehicle(double rate) {
        this.rate = rate;
    }

    public abstract double calculateFare(double km);
}

class CarRide extends RideVehicle {
    public CarRide(double rate) {
        super(rate);
    }

    public double calculateFare(double km) {
        return km * rate;
    }
}

class BikeRide extends RideVehicle {
    public BikeRide(double rate) {
        super(rate);
    }

    public double calculateFare(double km) {
        return km * rate;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle r1 = new CarRide(15);
        RideVehicle r2 = new BikeRide(8);
        System.out.println("For Cars: ₹" + r1.calculateFare(10));
        System.out.println("For Bikes: ₹" + r2.calculateFare(10));
    }
}

