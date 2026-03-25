package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Employee {
    public int id;
    public String name;
    public double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class JsonReportFromDB {

    public static void main(String[] args) throws Exception {

        List<Employee> records = Arrays.asList(
                new Employee(1, "Aarav", 60000),
                new Employee(2, "Diya", 55000),
                new Employee(3, "Rohan", 70000)
        );

        ObjectMapper mapper = new ObjectMapper();

        String jsonReport = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(records);

        System.out.println(jsonReport);
    }
}