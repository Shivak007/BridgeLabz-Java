package javacollectionsandstreams.collections.mapinterface;
import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("Enter size of first map: ");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++)
            map1.put(sc.next(), sc.nextInt());

        System.out.print("Enter size of second map: ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++)
            map2.put(sc.next(), sc.nextInt());

        for (Map.Entry<String, Integer> e : map2.entrySet())
            map1.put(e.getKey(), map1.getOrDefault(e.getKey(), 0) + e.getValue());

        System.out.println(map1);
    }
}
