package javacollectionsandstreams.java8features.day7;
import java.util.*;

public class OptionalHandling {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 5, 30);

        Optional<Integer> max =
                list.stream().max(Integer::compareTo);

        max.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("List is empty")
        );
    }
}

