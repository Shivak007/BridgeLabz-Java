package objectorientedprogramming.encapsulation;

import java.util.*;

interface Loanable {
    boolean applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holder;
    protected double balance;

    public BankAccount(String acc, String holder, double balance) {
        this.accountNumber = acc;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String holder, double balance) {
        super(acc, holder, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public boolean applyForLoan() {
        return true;
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String holder, double balance) {
        super(acc, holder, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("ACC1001", "Shivakumar", 50000);
        BankAccount a2 = new CurrentAccount("ACC2001", "Rahul", 70000);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());

        Loanable loanAcc = (Loanable) a1;
        System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
    }
}
