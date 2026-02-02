package javacollectionsandstreams.collections;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(int policyNumber, String holderName, LocalDate expiryDate,
           String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }
}

public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Map<Integer, Policy> hashMap = new HashMap<>();
        Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter policy " + i + " details");

            System.out.print("Policy Number: ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.print("Policy Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (dd-MM-yyyy): ");
            LocalDate expiry = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Coverage Type: ");
            String coverage = sc.nextLine();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine();

            Policy p = new Policy(num, name, expiry, coverage, premium);

            hashMap.put(num, p);
            linkedHashMap.put(num, p);
            treeMap.put(expiry, p);
        }

        System.out.print("Enter policy number to retrieve: ");
        int searchNum = sc.nextInt();
        if (hashMap.containsKey(searchNum))
            System.out.println(hashMap.get(searchNum).holderName);

        LocalDate today = LocalDate.now();
        System.out.println("Policies expiring in next 30 days:");
        for (Map.Entry<LocalDate, Policy> e : treeMap.entrySet())
            if (!e.getKey().isBefore(today) &&
                    !e.getKey().isAfter(today.plusDays(30)))
                System.out.println(e.getValue().policyNumber);

        sc.nextLine();
        System.out.print("Enter policy holder name to search: ");
        String searchName = sc.nextLine();
        for (Policy p : hashMap.values())
            if (p.holderName.equalsIgnoreCase(searchName))
                System.out.println(p.policyNumber);

        Iterator<Map.Entry<Integer, Policy>> it = hashMap.entrySet().iterator();
        while (it.hasNext())
            if (it.next().getValue().expiryDate.isBefore(today))
                it.remove();

        System.out.println("Expired policies removed");
    }
}
