package designpatterns;

interface Shape1 {
    void draw();
}

class Circle1 implements Shape1 {
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle1 implements Shape1 {
    public void draw() {
        System.out.println("Rectangle");
    }
}

class ShapeFactory {
    // Return type should be Shape1, not Shape
    public static Shape1 getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) return new Circle1();
        if ("RECTANGLE".equalsIgnoreCase(type)) return new Rectangle1();
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        Shape1 s = ShapeFactory.getShape("circle");
        s.draw();
    }
}