package datastructures.linkedlist;
class TicketNode {
    int id;
    TicketNode next;

    TicketNode(int id) {
        this.id = id;
    }
}

class TicketCircularList {
    TicketNode head;

    void add(int id) {
        TicketNode n = new TicketNode(id);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        TicketNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    void display() {
        if (head == null) return;
        TicketNode t = head;
        do {
            System.out.println(t.id);
            t = t.next;
        } while (t != head);
    }
}

public class OnlineTicket {
    public static void main(String[] args) {
        TicketCircularList list = new TicketCircularList();
        list.add(111);
        list.add(112);
        list.display();
    }
}
