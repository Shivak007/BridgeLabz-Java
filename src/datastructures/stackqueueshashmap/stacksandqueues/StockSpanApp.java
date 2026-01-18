package datastructures.stackqueueshashmap.stacksandqueues;
import java.util.Stack;

class StockSpan {
    void calculateSpan(int[] price) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[price.length];

        s.push(0);
        span[0] = 1;

        for (int i = 1; i < price.length; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i])
                s.pop();

            span[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);
        }

        for (int x : span)
            System.out.println(x);
    }
}

public class StockSpanApp {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        StockSpan ss = new StockSpan();
        ss.calculateSpan(price);
    }
}
