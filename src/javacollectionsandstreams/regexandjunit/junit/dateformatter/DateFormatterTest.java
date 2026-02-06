package javacollectionsandstreams.regexandjunit.junit.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test void testDate() {
        assertEquals("01-01-2024",
                new DateFormatter().formatDate("2024-01-01"));
    }
}
