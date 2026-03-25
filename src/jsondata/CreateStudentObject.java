package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class CreateStudentObject {
    public static void main(String[] args) throws Exception {

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Naveen");
        student.put("age", 20);
        student.put("subjects", Arrays.asList("Math", "Physics"));

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(student));
    }
}