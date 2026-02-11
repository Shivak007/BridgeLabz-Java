package javacollectionsandstreams.java8features.day7;
import java.util.function.Function;

public class Functional {
    public static void main(String[] args) {

        Function<Double, Double> area = r -> Math.PI * r * r;

        System.out.println("Area: " + area.apply(5.0));
    }
}
