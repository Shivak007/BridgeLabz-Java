package javacollectionsandstreams.collections.queueinterface;
public class CircularBuffer {

    static class CircularBuffers {
        int[] arr;
        int front = 0, size = 0;

        CircularBuffers(int cap) {
            arr = new int[cap];
        }

        void add(int x) {
            arr[(front + size) % arr.length] = x;
            if (size < arr.length) size++;
            else front = (front + 1) % arr.length;
        }

        void display() {
            for (int i = 0; i < size; i++)
                System.out.print(arr[(front + i) % arr.length] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularBuffers cb = new CircularBuffers(3);
        cb.add(1); cb.add(2); cb.add(3);
        cb.add(4);
        cb.display();
    }
}

