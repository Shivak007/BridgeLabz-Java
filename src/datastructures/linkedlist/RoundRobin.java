package datastructures.linkedlist;
class ProcessNode {
    int id;
    ProcessNode next;

    ProcessNode(int id) {
        this.id = id;
    }
}

class RoundRobinList {
    ProcessNode head;

    void add(int id) {
        ProcessNode n = new ProcessNode(id);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        ProcessNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    void display() {
        if (head == null) return;
        ProcessNode t = head;
        do {
            System.out.println(t.id);
            t = t.next;
        } while (t != head);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinList list = new RoundRobinList();
        list.add(1);
        list.add(2);
        list.display();
    }
}
