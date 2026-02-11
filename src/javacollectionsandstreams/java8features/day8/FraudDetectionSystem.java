package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class Transaction {
    String transactionId;
    String policyNumber;
    double amount;
    boolean isFraudulent;

    Transaction(String transactionId, String policyNumber, double amount, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.isFraudulent = isFraudulent;
    }
}

public class FraudDetectionSystem {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", "P1", 15000, true),
                new Transaction("T2", "P1", 20000, true),
                new Transaction("T3", "P1", 30000, true),
                new Transaction("T4", "P1", 5000, false),
                new Transaction("T5", "P2", 60000, true),
                new Transaction("T6", "P2", 10000, true)
        );

        Map<String, DoubleSummaryStatistics> fraudStats =
                transactions.stream()
                        .filter(t -> t.isFraudulent && t.amount > 10000)
                        .collect(Collectors.groupingBy(
                                t -> t.policyNumber,
                                Collectors.summarizingDouble(t -> t.amount)
                        ));

        fraudStats.forEach((policy, stats) -> {
            if (stats.getCount() > 5 || stats.getSum() > 50000) {
                System.out.println("ALERT: Policy " + policy +
                        " Fraud Count: " + stats.getCount() +
                        " Total Fraud: " + stats.getSum());
            }
        });
    }
}
