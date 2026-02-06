package javacollectionsandstreams.regexandjunit.junit.filehandling;
import java.io.*;

public class FileProcessor {
    public void writeToFile(String f, String c) throws IOException {
        FileWriter w = new FileWriter(f);
        w.write(c);
        w.close();
    }

    public String readFromFile(String f) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(f));
        return r.readLine();
    }
}
