package jsondata;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class ReadJsonFields {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\jsondata\\users.json"));

        for (JsonNode node : root) {
            System.out.println(node.get("name").asText() +
                    " - " +
                    node.get("email").asText());
        }
    }
}