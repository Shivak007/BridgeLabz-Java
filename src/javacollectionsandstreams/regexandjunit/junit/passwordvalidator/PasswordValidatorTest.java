package javacollectionsandstreams.regexandjunit.junit.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test void testValid() {
        assertTrue(new PasswordValidator().validate("Abcdef12"));
    }
}

