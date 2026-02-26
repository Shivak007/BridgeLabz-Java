package designpatterns;
interface Car { void drive(); }
interface Bike { void ride(); }

class Sedan implements Car { public void drive(){ System.out.println("Sedan"); } }
class SUV implements Car { public void drive(){ System.out.println("SUV"); } }
class SportsBike implements Bike { public void ride(){ System.out.println("SportsBike"); } }
class NormalBike implements Bike { public void ride(){ System.out.println("NormalBike"); } }

interface VehicleFactory {
    Car createCar();
    Bike createBike();
}

class CarFactory implements VehicleFactory {
    public Car createCar(){ return new Sedan(); }
    public Bike createBike(){ return null; }
}
class BikeFactory implements VehicleFactory {
    public Car createCar(){ return null; }
    public Bike createBike(){ return new SportsBike(); }
}
public class AbstractFactory {
    public static void main(String[] args){
        VehicleFactory factory = new CarFactory();
        factory.createCar().drive();
    }
}