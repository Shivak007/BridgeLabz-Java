package javacollectionsandstreams.java8features.day7;
@FunctionalInterface
interface SquareOperation {
    int square(int n);

    default void printResult(int n) {
        System.out.println("Square of " + n + " is " + square(n));
    }
}

public class CustomFunctionalInterfaceWithDefault {
    public static void main(String[] args) {

        SquareOperation sq = n -> n * n;
        sq.printResult(6);
    }
}

