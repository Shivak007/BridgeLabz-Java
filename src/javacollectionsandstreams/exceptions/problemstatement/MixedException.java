package javacollectionsandstreams.exceptions.problemstatement;
import java.io.*;

public class MixedException {

    static void process(int n) throws IOException {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) throw new IOException();
        System.out.println("Processed: " + n);
    }

    public static void main(String[] args) {
        try {
            process(0);
        } catch (IOException e) {
            System.out.println("Checked exception occurred");
        } catch (IllegalArgumentException e) {
            System.out.println("Unchecked exception occurred");
        }
    }
}

