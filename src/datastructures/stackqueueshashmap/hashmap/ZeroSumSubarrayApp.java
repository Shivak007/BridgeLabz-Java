package datastructures.stackqueueshashmap.hashmap;
import java.util.HashMap;

class ZeroSumSubarray {
    boolean exists(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int x : arr) {
            sum += x;
            if (sum == 0 || map.containsKey(sum))
                return true;
            map.put(sum, 1);
        }
        return false;
    }
}

public class ZeroSumSubarrayApp {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        ZeroSumSubarray z = new ZeroSumSubarray();
        System.out.println(z.exists(arr));
    }
}
