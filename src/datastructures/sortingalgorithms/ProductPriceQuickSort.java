package datastructures.sortingalgorithms;

class QuickSort {
    void sort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            sort(a, low, p - 1);
            sort(a, p + 1, high);
        }
    }

    int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
}

public class ProductPriceQuickSort {
    public static void main(String[] args) {
        int[] prices = {999, 299, 499, 199};
        QuickSort qs = new QuickSort();
        qs.sort(prices, 0, prices.length - 1);
        for (int x : prices)
            System.out.println(x);
    }
}
