package datastructures.algorithmruntimeanalysis;
import java.util.*;

public class SortingPerformanceTest {

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
    }

    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    static int partition(int[] a, int l, int h) {
        int pivot = a[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (a[j] < pivot) {
                i++;
                int t = a[i]; a[i] = a[j]; a[j] = t;
            }
        int t = a[i + 1]; a[i + 1] = a[h]; a[h] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = new Random().ints(10000, 1, 100000).toArray();
        int[] b1 = data.clone();
        int[] b2 = data.clone();

        long t1 = System.nanoTime();
        bubbleSort(b1);
        long t2 = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (t2 - t1));

        t1 = System.nanoTime();
        quickSort(b2, 0, b2.length - 1);
        t2 = System.nanoTime();
        System.out.println("Quick Sort Time: " + (t2 - t1));
    }
}

