package jsondata;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.File;

public class MergeJsonFiles {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode file1 = mapper.readTree(new File("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\jsondata\\file1.json"));
        JsonNode file2 = mapper.readTree(new File("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\src\\jsondata\\file2.json"));

        ((ObjectNode) file1).setAll((ObjectNode) file2);

        System.out.println(file1);
    }
}