package datastructures.stackqueueshashmap.hashmap;
import java.util.HashMap;

class TwoSum {
    int[] findIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]))
                return new int[]{map.get(target - arr[i]), i};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

public class TwoSumApp {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        TwoSum ts = new TwoSum();
        int[] res = ts.findIndices(arr, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}
