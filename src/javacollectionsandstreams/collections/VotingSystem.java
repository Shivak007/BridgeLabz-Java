package javacollectionsandstreams.collections;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap;

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate name: ");
            String name = sc.nextLine();

            hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
            linkedHashMap.put(name, linkedHashMap.getOrDefault(name, 0) + 1);
        }

        treeMap = new TreeMap<>(hashMap);

        System.out.println("Votes (Insertion Order): " + linkedHashMap);
        System.out.println("Votes (Sorted): " + treeMap);
    }
}
