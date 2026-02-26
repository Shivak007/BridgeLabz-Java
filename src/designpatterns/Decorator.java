package designpatterns;
interface Coffee { int cost(); }
class SimpleCoffee implements Coffee { public int cost(){ return 100; } }

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    CoffeeDecorator(Coffee c){ this.coffee=c; }
}
class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee c){ super(c); }
    public int cost(){ return coffee.cost()+20; }
}
public class Decorator {
    public static void main(String[] args){
        Coffee c = new MilkDecorator(new SimpleCoffee());
        System.out.println(c.cost());
    }
}