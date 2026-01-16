package objectorientedprogramming.inheritance;

class Vehicle{
    private int maxSpeed;
    private String fuelType;

    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Max Speed (in km/hr): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicles {
    private int seatCapacity;

    Car(int maxSpeed,String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Cars");
        super.displayInfo();
        System.out.println("Seating Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicles {
    private float loadCapacity;

    Truck(int maxSpeed,String fuelType, float loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Trucks");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + "kgs");
    }
}

class Motorcycle extends Vehicles {
    private String transmissionMode;

    Motorcycle(int maxSpeed,String fuelType, String transmissionMode){
        super(maxSpeed,fuelType);
        this.transmissionMode = transmissionMode;
    }

    @Override
    public void displayInfo(){
        System.out.println("Motorcycles");
        super.displayInfo();
        System.out.println("Transmission Mode: " + transmissionMode);
    }
}

public class VehicleTransport {
    public static void main(String[] args) {
        Vehicles[] vehicles = new Vehicles[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel",10.8F);
        vehicles[2] = new Motorcycle(150, "Petrol", "Gear-Powered");

        System.out.println("*** Vehicle Details ***");
        for (Vehicles v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
