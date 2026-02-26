package designpatterns;

interface PaymentStrategy { void pay(); }
class CashPayment implements PaymentStrategy {
    public void pay(){ System.out.println("Paid by Cash"); }
}
class PaymentContext {
    private PaymentStrategy strategy;
    PaymentContext(PaymentStrategy s){ strategy=s; }
    void execute(){ strategy.pay(); }
}
public class Strategy {
    public static void main(String[] args){
        new PaymentContext(new CashPayment()).execute();
    }
}
