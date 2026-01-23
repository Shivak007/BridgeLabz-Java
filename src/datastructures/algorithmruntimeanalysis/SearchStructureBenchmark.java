package datastructures.algorithmruntimeanalysis;
import java.util.*;

public class SearchStructureBenchmark {

    public static void main(String[] args) {
        int n = 100000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hs.add(i);
            ts.add(i);
        }

        long t1 = System.nanoTime();
        for (int i : arr) if (i == target) break;
        long t2 = System.nanoTime();
        System.out.println("Array Search: " + (t2 - t1));

        t1 = System.nanoTime();
        hs.contains(target);
        t2 = System.nanoTime();
        System.out.println("HashSet Search: " + (t2 - t1));

        t1 = System.nanoTime();
        ts.contains(target);
        t2 = System.nanoTime();
        System.out.println("TreeSet Search: " + (t2 - t1));
    }
}
