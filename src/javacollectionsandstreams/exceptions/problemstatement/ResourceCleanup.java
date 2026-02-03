package javacollectionsandstreams.exceptions.problemstatement;

class Connection {
    void open() { System.out.println("Connected"); }
    void close() { System.out.println("Closed"); }
}

public class ResourceCleanup {

    public static void main(String[] args) {
        Connection c = new Connection();
        try {
            c.open();
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            c.close();
        }
    }
}

