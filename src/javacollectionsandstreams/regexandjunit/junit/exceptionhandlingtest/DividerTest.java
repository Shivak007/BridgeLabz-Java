package javacollectionsandstreams.regexandjunit.junit.exceptionhandlingtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DividerTest {
    @Test
    void testException() {
        Divider d = new Divider();
        assertThrows(ArithmeticException.class, () -> d.divide(10, 0));
    }
}
