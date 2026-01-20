package datastructures.sortingalgorithms;

class CountingSort {
    void sort(int[] a, int max) {
        int[] count = new int[max + 1];

        for (int x : a)
            count[x]++;

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0)
                a[index++] = i;
        }
    }
}

public class StudentAgeCountingSort {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12};
        CountingSort cs = new CountingSort();
        cs.sort(ages, 18);
        for (int x : ages)
            System.out.println(x);
    }
}
