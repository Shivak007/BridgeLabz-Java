package javacollectionsandstreams.regexandjunit.junit.timeouttest;

public class LongTask {
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}
