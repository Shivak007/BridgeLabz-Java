import java.util.Scanner;

class Counter {
    private int count = 1;
    private final int limit;

    Counter(int limit) {
        this.limit = limit;
    }

    public synchronized void printCount(String threadName) {
        if (count <= limit) {
            System.out.println(threadName + " -> " + count);
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public int getLimit() {
        return limit;
    }
}

class CounterThread extends Thread {
    private final Counter counter;

    CounterThread(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        while (true) {
            synchronized (counter) {
                if (counter.getCount() > counter.getLimit()) break;
                counter.printCount(getName());
            }
        }
    }
}

public class ThreadedCounter {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter counting limit: ");
            int limit = sc.nextInt();

            Counter counter = new Counter(limit);

            Thread t1 = new CounterThread("Thread-1", counter);
            Thread t2 = new CounterThread("Thread-2", counter);
            Thread t3 = new CounterThread("Thread-3", counter);

            t1.start();
            t2.start();
            t3.start();

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}