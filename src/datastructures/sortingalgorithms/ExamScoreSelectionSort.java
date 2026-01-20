package datastructures.sortingalgorithms;

class SelectionSort {
    void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}

public class ExamScoreSelectionSort {
    public static void main(String[] args) {
        int[] scores = {88, 92, 75, 81};
        SelectionSort ss = new SelectionSort();
        ss.sort(scores);
        for (int x : scores)
            System.out.println(x);
    }
}
