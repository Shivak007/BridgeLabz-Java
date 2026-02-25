package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Shiva")
    void completeTask() {}
}

public class TaskInfoExample {
    public static void main(String[] args) throws Exception {

        Method method = TaskManager.class.getDeclaredMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);
            System.out.println(info.priority());
            System.out.println(info.assignedTo());
        }
    }
}