package javacollectionsandstreams.regexandjunit.junit.filehandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileProcessorTest {

    @Test
    void testFileIO() throws Exception {
        FileProcessor fp = new FileProcessor();
        fp.writeToFile("test.txt", "Hello");
        assertEquals("Hello", fp.readFromFile("test.txt"));
    }
}
