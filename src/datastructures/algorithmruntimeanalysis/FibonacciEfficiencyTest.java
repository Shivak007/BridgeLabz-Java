package datastructures.algorithmruntimeanalysis;
public class FibonacciEfficiencyTest {

    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibItr(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int s = a + b;
            a = b;
            b = s;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long t1 = System.nanoTime();
        fibRec(n);
        long t2 = System.nanoTime();
        System.out.println("Recursive Time: " + (t2 - t1));

        t1 = System.nanoTime();
        fibItr(n);
        t2 = System.nanoTime();
        System.out.println("Iterative Time: " + (t2 - t1));
    }
}
