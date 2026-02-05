package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class UpperToLowerFile {

    public static void main(String[] args) {

        String inputPath = "data/javaiostreams/filterstreams/input.txt";
        String outputPath = "data/javaiostreams/filterstreams/output.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase(ch));
            }

            System.out.println("File converted to lowercase successfully");

        } catch (IOException e) {
            System.out.println("Error processing text file");
        }
    }
}
