package jsondata;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class PrintJsonKeys {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\jsondata\\users.json"));

        root.forEach(node ->
                node.fields().forEachRemaining(e ->
                        System.out.println(e.getKey()+" : "+e.getValue())
                )
        );
    }
}
