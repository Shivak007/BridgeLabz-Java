package datastructures.linkedlist;
class ItemNode {
    int id, quantity;
    double price;
    ItemNode next;

    ItemNode(int id, int quantity, double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryLinkedList {
    ItemNode head;

    void add(int id, int q, double p) {
        ItemNode n = new ItemNode(id, q, p);
        n.next = head;
        head = n;
    }

    double totalValue() {
        double sum = 0;
        ItemNode t = head;
        while (t != null) {
            sum += t.quantity * t.price;
            t = t.next;
        }
        return sum;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryLinkedList list = new InventoryLinkedList();
        list.add(1, 8, 100);
        list.add(2, 3, 650);
        System.out.println("Total Value: " + list.totalValue());
    }
}
