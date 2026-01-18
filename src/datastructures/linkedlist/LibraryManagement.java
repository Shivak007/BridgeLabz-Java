package datastructures.linkedlist;
class BookNode {
    int id;
    BookNode next, prev;

    BookNode(int id) {
        this.id = id;
    }
}

class LibraryLinkedList {
    BookNode head, tail;

    void add(int id) {
        BookNode n = new BookNode(id);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    int countBooks() {
        int c = 0;
        BookNode t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryLinkedList list = new LibraryLinkedList();
        list.add(874);
        list.add(321);
        System.out.println("Number of available books: " + list.countBooks());
    }
}

