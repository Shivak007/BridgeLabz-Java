package javacollectionsandstreams.exceptions.exceptionhandling;
import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\javacollectionsandstreams\\exceptions\\exceptionhandling\\info"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
