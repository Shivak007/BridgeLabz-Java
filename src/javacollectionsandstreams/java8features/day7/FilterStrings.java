package javacollectionsandstreams.java8features.day7;
import java.util.*;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango");

        list.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}

