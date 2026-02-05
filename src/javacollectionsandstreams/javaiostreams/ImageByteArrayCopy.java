package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class ImageByteArrayCopy {

    public static void main(String[] args) {

        String inputPath = "data/javaiostreams/bytearray/original.jpg";
        String outputPath = "data/javaiostreams/bytearray/copied.jpg";

        try (
                FileInputStream fis = new FileInputStream(inputPath);
                ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {

            int b;
            while ((b = fis.read()) != -1) {
                baos.write(b);
            }

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream(outputPath)) {
                fos.write(imageBytes);
            }

            System.out.println("Image copied using ByteArray streams");

        } catch (IOException e) {
            System.out.println("Error processing image file");
        }
    }
}
