package datastructures.sortingalgorithms;

class BubbleSort {
    void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

public class StudentMarksBubbleSort {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 55};
        BubbleSort bs = new BubbleSort();
        bs.sort(marks);
        for (int x : marks)
            System.out.println(x);
    }
}
