package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class ReadLargeFileWithErrorFilter {

    public static void main(String[] args) {

        String filePath = "data/javaiostreams/largefile/logs.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading large file");
        }
    }
}
