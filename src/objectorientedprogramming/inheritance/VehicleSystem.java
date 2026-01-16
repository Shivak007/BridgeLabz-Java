package objectorientedprogramming.inheritance;

interface Refuelable {
    void refuel();
}

class Vehicles {
    protected int maxSpeed;
    protected String model;

    public Vehicles(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicles extends Vehicles {
    public ElectricVehicles(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging its battery.");
    }
}

class PetrolVehicles extends Vehicles implements Refuelable {
    public PetrolVehicles(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicles ev = new ElectricVehicles(150, "Tesla Model Y");
        PetrolVehicles pv = new PetrolVehicles(180, "Porsche 911");

        ev.displayInfo();
        ev.charge();

        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}