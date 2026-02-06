package javacollectionsandstreams.regexandjunit.junit.banking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testWithdrawFail() {
        BankAccount b = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> b.withdraw(100));
    }
}
