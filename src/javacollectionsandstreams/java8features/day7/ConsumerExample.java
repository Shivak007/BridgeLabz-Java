package javacollectionsandstreams.java8features.day7;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "lambda", "stream");

        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

        list.forEach(printUpper);
    }
}
