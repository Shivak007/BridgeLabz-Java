package annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

@RoleAllowed("ADMIN")
class AdminService {
    void performAdminTask() {
        System.out.println("Admin Task Executed");
    }
}

public class RoleBasedAccessExample {
    public static void main(String[] args) throws Exception {

        String currentUserRole = "USER";

        Class<?> clazz = AdminService.class;
        RoleAllowed role = clazz.getAnnotation(RoleAllowed.class);

        if (role.value().equals(currentUserRole)) {
            clazz.getDeclaredMethod("performAdminTask")
                    .invoke(clazz.getDeclaredConstructor().newInstance());
        } else {
            System.out.println("Access Denied!");
        }
    }
}
