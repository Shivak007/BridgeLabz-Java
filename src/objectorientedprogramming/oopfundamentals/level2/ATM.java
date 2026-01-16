package objectorientedprogramming.oopfundamentals.level2;
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    double displayBalance() {
        return balance;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Shiva", 774, 1000);

        int choice;
        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.depositMoney(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdrawMoney(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.displayBalance());
                    break;

                case 4:
                    account.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}