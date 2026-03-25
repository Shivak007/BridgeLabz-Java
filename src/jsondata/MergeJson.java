package jsondata;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.*;

public class MergeJson {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Shiva");

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("age", 22);

        obj1.setAll(obj2);

        System.out.println(obj1);
    }
}
