package designpatterns;
interface Color { String fill(); }
class Red implements Color { public String fill(){ return "Red"; } }
class Blue implements Color { public String fill(){ return "Blue"; } }

abstract class Shape {
    protected Color color;
    Shape(Color color){ this.color=color; }
    abstract void draw();
}
class Circle extends Shape {
    Circle(Color c){ super(c); }
    void draw(){ System.out.println("Circle " + color.fill()); }
}
public class Bridge {
    public static void main(String[] args){
        new Circle(new Red()).draw();
    }
}