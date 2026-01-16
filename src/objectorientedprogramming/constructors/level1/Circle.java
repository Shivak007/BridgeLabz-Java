package objectorientedprogramming.constructors.level1;
class Circle {
    private double radius;

    Circle() {
        this(1.0); // calls parameterized constructor
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius + ", Area: " + calculateArea());
    }
}
