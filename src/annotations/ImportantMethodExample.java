package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {

    @ImportantMethod
    void criticalTask() {}

    @ImportantMethod(level = "MEDIUM")
    void normalTask() {}
}

public class ImportantMethodExample {
    public static void main(String[] args) {

        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " - " + im.level());
            }
        }
    }
}
