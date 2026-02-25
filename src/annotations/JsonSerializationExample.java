package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name="user_name")
    String name = "Shiva";

    @JsonField(name="user_age")
    int age = 22;
}

public class JsonSerializationExample {

    static String toJson(Object obj) throws Exception {

        StringBuilder sb = new StringBuilder("{");

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                sb.append("\"")
                        .append(jf.name())
                        .append("\":\"")
                        .append(field.get(obj))
                        .append("\",");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(toJson(new User()));
    }
}