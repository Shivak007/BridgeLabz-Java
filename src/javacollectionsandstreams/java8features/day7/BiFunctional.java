package javacollectionsandstreams.java8features.day7;
import java.util.function.BiFunction;

public class BiFunctional {
    public static void main(String[] args) {

        BiFunction<String, String, String> concat =
                (a, b) -> a + " " + b;

        System.out.println(concat.apply("Hello", "World"));
    }
}
