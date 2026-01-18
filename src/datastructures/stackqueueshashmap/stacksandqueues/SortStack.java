package datastructures.stackqueueshashmap.stacksandqueues;
import java.util.Stack;

class StackSorter {
    void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insert(s, x);
        }
    }

    void insert(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insert(s, x);
        s.push(temp);
    }
}

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);

        StackSorter sorter = new StackSorter();
        sorter.sort(s);

        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}
