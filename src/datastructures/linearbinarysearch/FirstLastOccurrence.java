package datastructures.linearbinarysearch;
public class FirstLastOccurrence {
    static int find(int[] a, int x, boolean first) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                res = mid;
                if (first) r = mid - 1;
                else l = mid + 1;
            } else if (a[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        System.out.println(find(arr, 2, true));
        System.out.println(find(arr, 2, false));
    }
}

