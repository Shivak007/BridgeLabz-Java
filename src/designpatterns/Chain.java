package designpatterns;
abstract class Handler {
    protected Handler next;
    void setNext(Handler n){ next=n; }
    abstract void handle(int amount);
}
class Manager extends Handler {
    void handle(int amount){
        if(amount<=1000) System.out.println("Manager Approved");
        else if(next!=null) next.handle(amount);
    }
}
class HR extends Handler {
    void handle(int amount){
        System.out.println("HR Approved");
    }
}
public class Chain{
    public static void main(String[] args){
        Manager m=new Manager();
        HR hr=new HR();
        m.setNext(hr);
        m.handle(2000);
    }
}