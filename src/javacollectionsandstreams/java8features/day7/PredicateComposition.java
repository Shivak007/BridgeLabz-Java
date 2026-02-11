package javacollectionsandstreams.java8features.day7;
import java.util.*;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Insurance", "Java", "StreamAPI", "Lambda");

        Predicate<String> lengthCheck = s -> s.length() > 5;
        Predicate<String> containsA = s -> s.contains("a");

        list.stream()
                .filter(lengthCheck.and(containsA))
                .forEach(System.out::println);
    }
}
