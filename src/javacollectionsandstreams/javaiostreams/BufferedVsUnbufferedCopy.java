package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class BufferedVsUnbufferedCopy {

    public static void main(String[] args) {

        String inputPath = "data/javaiostreams/bufferedcopy/large.txt";
        String unbufferedOutput = "data/javaiostreams/bufferedcopy/unbuffered_copy.txt";
        String bufferedOutput = "data/javaiostreams/bufferedcopy/buffered_copy.txt";

        byte[] buffer = new byte[4096];

        try {
            long start = System.nanoTime();

            try (FileInputStream fis = new FileInputStream(inputPath);
                 FileOutputStream fos = new FileOutputStream(unbufferedOutput)) {

                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            long end = System.nanoTime();
            System.out.println("Unbuffered copy time: " + (end - start) + " ns");

            start = System.nanoTime();

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputPath));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedOutput))) {

                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
            }

            end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start) + " ns");

        } catch (IOException e) {
            System.out.println("File operation error");
        }
    }
}
