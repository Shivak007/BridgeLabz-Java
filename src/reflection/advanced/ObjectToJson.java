package reflection.advanced;
import java.lang.reflect.*;

class Employee {
    String name = "Diya";
    int salary = 50000;
}

public class ObjectToJson {
    public static String toJson(Object obj) throws Exception {

        StringBuilder sb = new StringBuilder("{");
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            sb.append("\"")
                    .append(field.getName())
                    .append("\":\"")
                    .append(field.get(obj))
                    .append("\",");
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        System.out.println(toJson(e));
    }
}