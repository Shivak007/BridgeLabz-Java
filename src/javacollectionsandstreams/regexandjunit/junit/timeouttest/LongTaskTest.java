package javacollectionsandstreams.regexandjunit.junit.timeouttest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LongTaskTest {

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        new LongTask().longRunningTask();
    }
}
