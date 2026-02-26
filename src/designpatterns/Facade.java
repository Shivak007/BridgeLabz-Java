package designpatterns;
class AccountService { void create(){ System.out.println("Account Created"); } }
class BalanceService { void check(){ System.out.println("Balance Checked"); } }

class BankFacade {
    private AccountService account = new AccountService();
    private BalanceService balance = new BalanceService();
    void openAccount(){ account.create(); balance.check(); }
}
public class Facade {
    public static void main(String[] args){
        new BankFacade().openAccount();
    }
}
