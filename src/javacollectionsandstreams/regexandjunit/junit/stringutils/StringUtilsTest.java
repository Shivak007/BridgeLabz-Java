package javacollectionsandstreams.regexandjunit.junit.stringutils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils u = new StringUtils();

    @Test void testReverse() { assertEquals("cba", u.reverse("abc")); }
    @Test void testPalindrome() { assertTrue(u.isPalindrome("madam")); }
    @Test void testUpper() { assertEquals("HELLO", u.toUpperCase("hello")); }
}
