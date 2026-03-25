package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    Student(String name){ this.name=name; }
}

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Student> list = Arrays.asList(
                new Student("Aarav"),
                new Student("Diya")
        );

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(list));
    }
}