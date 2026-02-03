package javacollectionsandstreams.exceptions.problemstatement;
import java.io.*;
import java.util.*;

class FileProcess {
    void processFiles(List<String> paths) {
        for (String p : paths) {
            try (BufferedReader br = new BufferedReader(new FileReader(p))) {
                String line;
                while ((line = br.readLine()) != null)
                    System.out.println(line);
            } catch (IOException e) {
                System.out.println("Error reading file: " + p);
            }
        }
    }
}

public class FileProcessor {
    public static void main(String[] args) {
        List<String> files = Arrays.asList("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\javacollectionsandstreams\\exceptions\\problemstatement\\a", "b.txt");
        new FileProcess().processFiles(files);
    }
}
