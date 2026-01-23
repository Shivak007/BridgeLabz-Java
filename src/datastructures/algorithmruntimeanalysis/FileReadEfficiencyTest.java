package datastructures.algorithmruntimeanalysis;
import java.io.*;

public class FileReadEfficiencyTest {

    public static void main(String[] args) throws Exception {
        File file = new File("largefile.txt");

        long t1 = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        long t2 = System.nanoTime();
        System.out.println("FileReader Time: " + (t2 - t1));

        t1 = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        t2 = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (t2 - t1));
    }
}
