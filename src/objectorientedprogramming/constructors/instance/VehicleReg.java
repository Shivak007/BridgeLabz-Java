package objectorientedprogramming.constructors.instance;

class Vehicle {
    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 10000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                ", Vehicle Type: " + vehicleType +
                ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}

public class VehicleReg {
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(1500.0);

        Vehicle v1 = new Vehicle("Shiva", "Car");
        Vehicle v2 = new Vehicle("Dinesh", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
