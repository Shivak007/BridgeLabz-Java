import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == capacity) {
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notify();
    }

    public synchronized int consume() throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notify();

        return value;
    }
}

class Producer extends Thread {

    private final SharedQueue queue;

    Producer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.produce(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Producer error");
        }
    }
}

class Consumer extends Thread {

    private final SharedQueue queue;

    Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.consume();
                Thread.sleep(800);
            }
        } catch (Exception e) {
            System.out.println("Consumer error");
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedQueue queue = new SharedQueue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}