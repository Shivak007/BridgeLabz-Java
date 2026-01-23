package datastructures.algorithmruntimeanalysis;
import java.util.*;

public class SearchEfficiencyTest {

    static int linearSearch(int[] a, int key) {
        for (int i : a) if (i == key) return i;
        return -1;
    }

    static int binarySearch(int[] a, int key) {
        Arrays.sort(a);
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == key) return m;
            if (a[m] < key) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = i;
        int target = n - 1;

        long t1 = System.nanoTime();
        linearSearch(data, target);
        long t2 = System.nanoTime();
        System.out.println("Linear Search Time: " + (t2 - t1));

        t1 = System.nanoTime();
        binarySearch(data, target);
        t2 = System.nanoTime();
        System.out.println("Binary Search Time: " + (t2 - t1));
    }
}
