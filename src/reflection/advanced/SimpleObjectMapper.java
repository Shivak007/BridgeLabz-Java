package reflection.advanced;
import java.lang.reflect.*;
import java.util.*;

public class SimpleObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName()))
                field.set(instance, properties.get(field.getName()));
        }

        return instance;
    }

    static class User {
        String name;
        int age;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Rishabh");
        map.put("age", 25);

        User user = toObject(User.class, map);
        System.out.println(user.name + " " + user.age);
    }
}