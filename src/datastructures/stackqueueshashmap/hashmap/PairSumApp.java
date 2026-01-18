package datastructures.stackqueueshashmap.hashmap;
import java.util.HashMap;

class PairSum {
    boolean findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(target - x))
                return true;
            map.put(x, 1);
        }
        return false;
    }
}

public class PairSumApp {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        PairSum ps = new PairSum();
        System.out.println(ps.findPair(arr, 18));
    }
}
