package objectorientedprogramming.keywords;

class BankAccount{
    static String bankName = "Indian Bank";
    static int noOfAccount = 0;

    private String accountHolderName;
    private final long accountNumber;

    BankAccount(String accountHolderName,long accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        noOfAccount++;
    }

    public void displayDetails(){
        if(this instanceof BankAccount) {
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }else{
            System.out.println("Invalid object");
        }
    }

    public static int getTotalAccounts(){
        return noOfAccount;
    }
}


public class BankApp {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("Karthik", 6752439998911L);
        BankAccount acc2 = new BankAccount("Dinesh", 5788882734766L);

        acc1.displayDetails();
        System.out.println("--------------------------------");
        acc2.displayDetails();

        System.out.println("\nTotal number of accounts: " + BankAccount.getTotalAccounts());
    }
}
