package javacollectionsandstreams.regexandjunit.junit.exceptionhandlingtest;

public class Divider {
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
