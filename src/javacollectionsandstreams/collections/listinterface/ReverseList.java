package javacollectionsandstreams.collections.listinterface;
import java.util.*;

public class ReverseList {

    static <T> void reverse(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> link = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        reverse(arr);
        reverse(link);

        System.out.println(arr);
        System.out.println(link);
    }
}
