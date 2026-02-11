package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    String status;

    Claim(String claimId, String policyNumber, double claimAmount, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.status = status;
    }
}

public class ClaimsAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("C1", "P1", 6000, "Approved"),
                new Claim("C2", "P1", 8000, "Approved"),
                new Claim("C3", "P2", 4000, "Approved"),
                new Claim("C4", "P2", 9000, "Approved"),
                new Claim("C5", "P3", 10000, "Approved")
        );

        Map<String, DoubleSummaryStatistics> stats =
                claims.stream()
                        .filter(c -> c.status.equals("Approved") && c.claimAmount > 5000)
                        .collect(Collectors.groupingBy(
                                c -> c.policyNumber,
                                Collectors.summarizingDouble(c -> c.claimAmount)
                        ));

        stats.entrySet()
                .stream()
                .sorted((a, b) ->
                        Double.compare(b.getValue().getSum(), a.getValue().getSum()))
                .limit(3)
                .forEach(e -> {
                    System.out.println("Policy: " + e.getKey());
                    System.out.println("Total: " + e.getValue().getSum());
                    System.out.println("Average: " + e.getValue().getAverage());
                });
    }
}
