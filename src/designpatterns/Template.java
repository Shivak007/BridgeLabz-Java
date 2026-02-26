package designpatterns;

abstract class OrderProcess {
    final void process(){
        select();
        pay();
        deliver();
    }
    abstract void select();
    abstract void pay();
    void deliver(){ System.out.println("Delivered"); }
}
class OnlineOrder extends OrderProcess {
    void select(){ System.out.println("Selected Online"); }
    void pay(){ System.out.println("Paid Online"); }
}
public class Template{
    public static void main(String[] args){
        new OnlineOrder().process();
    }
}