package objectorientedprogramming.oopfundamentals.level1;
import java.util.*;

class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateCircumference(){
        return (2 * Math.PI * radius);
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.printf("Circumference: %.2f cm\n", c1.calculateCircumference());
        System.out.printf("Area: %.2f cm^2",c1.calculateArea());
    }

}
