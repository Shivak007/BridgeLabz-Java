package datastructures.linkedlist;
class MovieNode {
    String title;
    MovieNode next, prev;

    MovieNode(String title) {
        this.title = title;
    }
}

class MovieList {
    MovieNode head, tail;

    void add(String t) {
        MovieNode n = new MovieNode(t);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    void display() {
        MovieNode t = head;
        while (t != null) {
            System.out.println(t.title);
            t = t.next;
        }
    }
}

public class MovieApp {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.add("Prisoners");
        list.add("Kill Bill");
        list.display();
    }
}
