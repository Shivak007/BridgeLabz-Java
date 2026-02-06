package javacollectionsandstreams.regexandjunit.junit.temperatureconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test void testCtoF() {
        assertEquals(32, new TemperatureConverter().cToF(0));
    }
}
