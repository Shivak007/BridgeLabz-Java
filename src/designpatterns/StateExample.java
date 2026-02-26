package designpatterns;

interface State { void handle(); }
class NoCardState implements State {
    public void handle(){ System.out.println("Insert Card"); }
}
class ATMContext {
    State state=new NoCardState();
    void setState(State s){ state=s; }
    void request(){ state.handle(); }
}
public class StateExample {
    public static void main(String[] args){
        new ATMContext().request();
    }
}