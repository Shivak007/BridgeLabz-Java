package javacollectionsandstreams.collections;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Double> accounts = new HashMap<>();
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        Queue<Integer> withdrawalQueue = new LinkedList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            int acc = sc.nextInt();

            System.out.print("Enter balance: ");
            double bal = sc.nextDouble();

            accounts.put(acc, bal);
            sortedAccounts.put(bal, acc);
        }

        System.out.print("Enter number of withdrawal requests: ");
        int w = sc.nextInt();
        for (int i = 0; i < w; i++)
            withdrawalQueue.add(sc.nextInt());

        while (!withdrawalQueue.isEmpty()) {
            int acc = withdrawalQueue.poll();
            if (accounts.containsKey(acc))
                System.out.println("Processed withdrawal for account " + acc);
        }

        System.out.println("Accounts sorted by balance: " + sortedAccounts);
    }
}
