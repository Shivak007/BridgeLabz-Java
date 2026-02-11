package javacollectionsandstreams.java8features.day7;
@FunctionalInterface
interface SumOperation {
    int add(int a, int b);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        SumOperation sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));
    }
}
