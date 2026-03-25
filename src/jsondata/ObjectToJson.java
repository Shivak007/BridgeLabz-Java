package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand = "Toyota";
    public int year = 2023;
}

public class ObjectToJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(new Car()));
    }
}
