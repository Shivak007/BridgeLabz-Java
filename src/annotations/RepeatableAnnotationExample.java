package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class Application {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Memory leak")
    void process() {}
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {

        Method method = Application.class.getDeclaredMethod("process");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport r : reports)
            System.out.println(r.description());
    }
}