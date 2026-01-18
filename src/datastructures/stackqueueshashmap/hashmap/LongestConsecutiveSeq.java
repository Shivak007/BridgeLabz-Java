package datastructures.stackqueueshashmap.hashmap;
import java.util.HashSet;

class LongestConsecutive {
    int findLength(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int max = 0;
        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        LongestConsecutive lc = new LongestConsecutive();
        System.out.println(lc.findLength(arr));
    }
}
