package javacollectionsandstreams.regexandjunit.junit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class,
                () -> new UserRegistration().registerUser("", "x", "123"));
    }
}
