package javacollectionsandstreams.regexandjunit.junit.parameterizedtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void testEven(int n) {
        NumberUtils u = new NumberUtils();
        if (n % 2 == 0)
            assertTrue(u.isEven(n));
        else
            assertFalse(u.isEven(n));
    }
}
