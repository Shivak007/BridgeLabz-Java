package datastructures.algorithmruntimeanalysis;
public class StringConcatBenchmark {

    public static void main(String[] args) {
        int n = 10000;

        long t1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "A";
        long t2 = System.nanoTime();
        System.out.println("String Time: " + (t2 - t1));

        t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("A");
        t2 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (t2 - t1));

        t1 = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) sf.append("A");
        t2 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (t2 - t1));
    }
}
