package datastructures.linkedlist;
class UserNode {
    int id;
    UserNode next;

    UserNode(int id) {
        this.id = id;
    }
}

class SocialMediaList {
    UserNode head;

    void addUser(int id) {
        UserNode n = new UserNode(id);
        n.next = head;
        head = n;
    }

    void display() {
        UserNode t = head;
        while (t != null) {
            System.out.println(t.id);
            t = t.next;
        }
    }
}

public class SocialMedia {
    public static void main(String[] args) {
        SocialMediaList list = new SocialMediaList();
        list.addUser(543);
        list.addUser(532);
        list.display();
    }
}

