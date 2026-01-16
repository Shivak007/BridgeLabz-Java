package objectorientedprogramming.inheritance;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public void displayAccountType() {
        System.out.println("Current Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV123", 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("CHK456", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.0, 12);

        System.out.println("*** Savings Account ***");
        savings.displayInfo();
        savings.displayAccountType();

        System.out.println("\n*** Checking Account ***");
        checking.displayInfo();
        checking.displayAccountType();

        System.out.println("\n*** Fixed Deposit Account ***");
        fixedDeposit.displayInfo();
        fixedDeposit.displayAccountType();
    }
}