package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class PolicyHolder {
    int holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    PolicyHolder(int holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }
}

class RiskAssessment {
    int holderId;
    String name;
    double riskScore;

    RiskAssessment(int holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }
}

public class PolicyRiskAssessment {
    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder(1, "Rishabh", 65, "Life", 40000),
                new PolicyHolder(2, "Jason", 70, "Life", 50000),
                new PolicyHolder(3, "Dinesh", 45, "Health", 20000)
        );

        Map<String, List<RiskAssessment>> result =
                holders.stream()
                        .filter(h -> h.policyType.equals("Life") && h.age > 60)
                        .map(h -> new RiskAssessment(
                                h.holderId,
                                h.name,
                                h.premiumAmount / h.age))
                        .sorted(Comparator.comparingDouble((RiskAssessment r) -> r.riskScore).reversed())
                        .collect(Collectors.groupingBy(
                                r -> r.riskScore > 0.5 ? "High Risk" : "Low Risk"
                        ));

        result.forEach((category, list) -> {
            System.out.println(category);
            list.forEach(r ->
                    System.out.println(r.name + " Risk Score: " + r.riskScore));
        });
    }
}
