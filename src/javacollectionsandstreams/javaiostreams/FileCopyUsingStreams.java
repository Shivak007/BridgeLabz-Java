package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class FileCopyUsingStreams {
    public static void main(String[] args) {

        String inputPath  = "data/javaiostreams/filecopy/source.txt";
        String outputPath = "data/javaiostreams/filecopy/destination.txt";

        new File("out").mkdirs();

        try (
                FileInputStream fis = new FileInputStream(inputPath);
                FileOutputStream fos = new FileOutputStream(outputPath)
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found");
        } catch (IOException e) {
            System.out.println("IO error occurred");
        }
    }
}
