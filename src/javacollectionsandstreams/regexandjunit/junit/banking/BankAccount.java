package javacollectionsandstreams.regexandjunit.junit.banking;

public class BankAccount {
    double balance;
    void deposit(double a) { balance += a; }
    void withdraw(double a) {
        if (a > balance) throw new IllegalArgumentException();
        balance -= a;
    }
    double getBalance() { return balance; }
}
