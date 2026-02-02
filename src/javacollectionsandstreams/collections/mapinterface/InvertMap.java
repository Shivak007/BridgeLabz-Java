package javacollectionsandstreams.collections.mapinterface;
import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> original = new HashMap<>();
        Map<Integer, List<String>> inverted = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            original.put(key, value);
        }

        for (Map.Entry<String, Integer> e : original.entrySet()) {
            inverted
                    .computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                    .add(e.getKey());
        }

        System.out.println(inverted);
    }
}
