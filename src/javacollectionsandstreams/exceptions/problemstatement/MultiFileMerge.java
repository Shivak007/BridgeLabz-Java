package javacollectionsandstreams.exceptions.problemstatement;

import java.io.*;

public class MultiFileMerge {
    public static void main(String[] args) {
        try (
                BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\javacollectionsandstreams\\exceptions\\problemstatement\\a"));
                BufferedReader br2 = new BufferedReader(new FileReader("b.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\javacollectionsandstreams\\exceptions\\problemstatement\\out"))
        ) {
            String line;
            while ((line = br1.readLine()) != null) bw.write(line + "\n");
            while ((line = br2.readLine()) != null) bw.write(line + "\n");
        } catch (IOException e) {
            System.out.println("File operation failed");
        }
    }
}

