package javacollectionsandstreams.exceptions.problemstatement;

class TransactionException extends Exception {
    TransactionException(String msg) { super(msg); }
}

public class TransactionProcessor {

    static void processTransaction(String id) throws TransactionException {
        try {
            throw new RuntimeException("DB error");
        } catch (RuntimeException e) {
            throw new TransactionException("Transaction " + id + " failed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction("T101");
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
