package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task="Add login feature", assignedTo="Shiva", priority="HIGH")
    void login() {}

    @Todo(task="Improve UI", assignedTo="Aarav")
    void uiUpdate() {}
}

public class TodoExample {
    public static void main(String[] args) {

        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " - " + t.assignedTo());
            }
        }
    }
}
