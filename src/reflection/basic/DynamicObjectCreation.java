package reflection.basic;
import java.lang.reflect.*;

class Student {
    String name = "Reflection Student";
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Student.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);

        System.out.println("Class: " + obj.getClass().getName());
        System.out.println("Name: " + field.get(obj));
    }
}