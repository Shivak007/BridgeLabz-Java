package javacollectionsandstreams.collections.listinterface;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer i : list) {
            if (!seen.contains(i)) {
                seen.add(i);
                result.add(i);
            }
        }

        System.out.println(result);
    }
}
