package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Processor {

    @LogExecutionTime
    void slowMethod() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {

        Processor p = new Processor();
        Method method = Processor.class.getDeclaredMethod("slowMethod");

        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            method.invoke(p);
            long end = System.nanoTime();
            System.out.println("Time: " + (end - start));
        }
    }
}
