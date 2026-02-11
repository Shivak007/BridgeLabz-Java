package javacollectionsandstreams.java8features.day7;
import java.util.*;
import java.util.stream.*;

class Policy {
    String policyNumber;
    String holderName;
    double premiumAmount;

    Policy(String policyNumber, String holderName, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.premiumAmount = premiumAmount;
    }
}

public class InsuranceStreamOperations {

    public static void main(String[] args) {

        List<Policy> policies = Arrays.asList(
                new Policy("P1", "Smith", 1500),
                new Policy("P2", "Johnson", 2500),
                new Policy("P3", "Smith", 900),
                new Policy("P4", "Adams", 1800),
                new Policy("P5", "Brown", 2200)
        );

        policies.stream()
                .filter(p -> p.premiumAmount > 1200)
                .forEach(p -> System.out.println(p.policyNumber));

        policies.stream()
                .sorted(Comparator.comparing(p -> p.holderName))
                .forEach(p -> System.out.println(p.holderName));

        double total = policies.stream()
                .map(p -> p.premiumAmount)
                .reduce(0.0, Double::sum);

        System.out.println("Total Premium: " + total);

        policies.stream()
                .max(Comparator.comparing(p -> p.premiumAmount))
                .ifPresent(p -> System.out.println("Highest: " + p.policyNumber));

        Map<Character, List<Policy>> grouped =
                policies.stream()
                        .collect(Collectors.groupingBy(
                                p -> p.holderName.charAt(0)));

        System.out.println(grouped);

        double avg = policies.stream()
                .collect(Collectors.averagingDouble(p -> p.premiumAmount));

        System.out.println("Average: " + avg);

        boolean anyHigh =
                policies.stream().anyMatch(p -> p.premiumAmount > 2000);

        System.out.println("Any > 2000: " + anyHigh);

        policies.stream()
                .map(p -> p.holderName)
                .distinct()
                .forEach(System.out::println);

        Map<String, Double> map =
                policies.stream()
                        .collect(Collectors.toMap(
                                p -> p.policyNumber,
                                p -> p.premiumAmount));

        System.out.println(map);
    }
}
