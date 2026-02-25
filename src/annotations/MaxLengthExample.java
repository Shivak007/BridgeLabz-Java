package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User1 {

    @MaxLength(10)
    String username;

    User1(String username) throws Exception {
        Field field = this.getClass().getDeclaredField("username");
        MaxLength max = field.getAnnotation(MaxLength.class);

        if (max != null && username.length() > max.value())
            throw new IllegalArgumentException("Username too long");

        this.username = username;
    }
}

public class MaxLengthExample {
    public static void main(String[] args) throws Exception {
        new User1("Shiva");   // valid
    }
}
