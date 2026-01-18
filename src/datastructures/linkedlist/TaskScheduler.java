package datastructures.linkedlist;
class TaskNode {
    int id;
    TaskNode next;

    TaskNode(int id) {
        this.id = id;
    }
}

class TaskCircularList {
    TaskNode head;

    void add(int id) {
        TaskNode n = new TaskNode(id);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        TaskNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    void display() {
        if (head == null) return;
        TaskNode t = head;
        do {
            System.out.println(t.id);
            t = t.next;
        } while (t != head);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularList list = new TaskCircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display();
    }
}
