package javacollectionsandstreams.regexandjunit.junit.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test void testAdd() { assertEquals(5, c.add(2, 3)); }
    @Test void testSubtract() { assertEquals(1, c.subtract(3, 2)); }
    @Test void testMultiply() { assertEquals(6, c.multiply(2, 3)); }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> c.divide(5, 0));
    }
}
