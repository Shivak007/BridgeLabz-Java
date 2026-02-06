package javacollectionsandstreams.regexandjunit.junit.beforeeachandaftereach;

public class DatabaseConnection {
    boolean connected;

    void connect() { connected = true; }
    void disconnect() { connected = false; }
}
