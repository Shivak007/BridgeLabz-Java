package javacollectionsandstreams.collections.queueinterface;
import java.util.*;

public class GenerateBinaryNumbers {

    static List<String> generate(int n) {
        Queue<String> q = new LinkedList<>();
        List<String> res = new ArrayList<>();

        q.add("1");
        for (int i = 0; i < n; i++) {
            String s = q.remove();
            res.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
