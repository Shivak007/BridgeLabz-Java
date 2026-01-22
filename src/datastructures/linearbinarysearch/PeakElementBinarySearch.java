package datastructures.linearbinarysearch;

public class PeakElementBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1};
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            boolean left = mid == 0 || arr[mid] > arr[mid - 1];
            boolean right = mid == arr.length - 1 || arr[mid] > arr[mid + 1];

            if (left && right) {
                System.out.println(arr[mid]);
                return;
            } else if (mid > 0 && arr[mid - 1] > arr[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
    }
}
