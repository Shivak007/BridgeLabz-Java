package javacollectionsandstreams.exceptions.problemstatement;

public class RethrowDivision {

    static int performDivision(int a, int b) {
        return a / b;
    }

    static int calculate(int a, int b) {
        try {
            return performDivision(a, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error dividing " + a + " by " + b);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculate(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
