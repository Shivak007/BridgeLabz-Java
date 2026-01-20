package datastructures.sortingalgorithms;

class InsertionSort {
    void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}

public class EmployeeIDInsertionSort {
    public static void main(String[] args) {
        int[] ids = {105, 101, 109, 103};
        InsertionSort is = new InsertionSort();
        is.sort(ids);
        for (int x : ids)
            System.out.println(x);
    }
}
